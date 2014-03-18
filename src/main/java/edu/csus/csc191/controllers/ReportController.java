/*
 * Developed by Hoan Tran.
 */
package edu.csus.csc191.controllers;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Vector;

import javax.servlet.ServletContext;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.csus.csc191.common.Utilities;
import edu.csus.csc191.hibernate.HibernateUtil;
import edu.csus.csc191.models.DynamicCsv;
import edu.csus.csc191.models.Mastercsv;
import edu.csus.csc191.models.VersionInfo;
import edu.csus.csc191.models.Reports.CustomerEnvironmentSizeReport;
import edu.csus.csc191.models.Reports.NewCustomerReport;
import edu.csus.csc191.models.Reports.ReportStorageMetric;
import edu.csus.csc191.models.Reports.StorageArray;
import edu.csus.csc191.models.Reports.VersionInformationReport;
import edu.csus.csc191.models.interfaces.IReport;

@Controller
@RequestMapping(value = "/reports")
@Secured("ROLE_ADMIN")
public class ReportController extends AppController {
    private static String PAGE_TITLE = "Reports";
    private static String VIEW_NAME = "v2_reports";
    @Autowired private ServletContext context;

    private static SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    @Autowired DynamicCsv dcsv ;

    /**
     * Set defaults model attributes for this controller.
     *
     * @param model The model that is modified whenever a @RequestMapping URL
     * is requested by the client.
     */
    @Override
    @ModelAttribute
    public void setCommonModelAttributes(Model model) {
        super.setCommonModelAttributes(model);
        model.addAttribute("pageTitle", PAGE_TITLE);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
        public String v2Reports(Locale locale, Model model) {

            model.addAttribute("message", "Welcome to DSAT !");
            return VIEW_NAME;
        }

    /**
     * Get the average, sum, and maximum of the specified {column} of type {dataType} during {yearmonth}
     *
     * @param column
     * @param dateType
     * @param yearmonth
     * @return The average, sum, and maximum of the specified {column} of type {dataType} during {yearmonth}
     */
    @RequestMapping(value = "/reportCustomerEnvironmentSize/{column}/{dateType}/{yearmonth}", method = RequestMethod.GET)
        @ResponseBody
        public IReport reportCustomerEnvironmentSize(
            @PathVariable("column") String column,
            @PathVariable("dateType") String dateType,
            @PathVariable("yearmonth") int yearmonth
        ) {

            Session session = sessionFactory.openSession();
            Date[] dates = Utilities.getFirstDateLastDateInMonth(yearmonth); //this method returns a date[] object which has 2 elements first and last date of a specific month
            //Use Hibernate Criteria allows much more dynamic query to be built
            Criteria crit = session.createCriteria(Mastercsv.class);

            ProjectionList proList = Projections.projectionList();

            proList.add(Projections.avg(column));
            proList.add(Projections.sum(column));
            proList.add(Projections.max(column));

            crit.setProjection(proList);
            crit.add(Restrictions.gt(column, 0));
            crit.add(Restrictions.between(dateType, dates[0], dates[1]));
            List results = crit.list();
            Object[] arr = (Object[]) results.get(0);
            CustomerEnvironmentSizeReport cesReport = new CustomerEnvironmentSizeReport();
            
            cesReport.setEnvName(Utilities.addSpaceToString(Utilities.columnMap.get(column)));
            cesReport.setReportName("Customer Environment Size Report");
            if (arr[0] != null)
                cesReport.setAverage(new Float(arr[0].toString()));
            if (arr[1] != null)
                cesReport.setTotal(new Integer(arr[1].toString()));
            if (arr[2] != null)
                cesReport.setMax(new Integer(arr[2].toString()));
            session.close();
            return cesReport;
        }

    /**
     * Get customer report. Currently shows the count of how many servers a customer had during {yearmonth}.
     *
     * @param yearmonth
     * @return (NewCustomerReport) The customer report
     */
    @RequestMapping(value="/newCustomersReport/{yearmonth}", method = RequestMethod.GET)
        @ResponseBody
        public NewCustomerReport newCustomersReport(@PathVariable("yearmonth") int yearmonth){
            Session session = sessionFactory.openSession();
            Date[] dates = Utilities.getFirstDateLastDateInMonth(yearmonth);

            //Use Hibernate Query Language HQL if you want to write SQL like queries

            String queryString = "select count("+dcsv.getInstalledModule()+") from Mastercsv where "+dcsv.getInstalledModule()+" like :installedModule and "
            +dcsv.getHPICSMInstallDate()+" between :firstDate and :lastDate" ;
            Query query = session.createQuery(queryString);
            query.setParameter("installedModule", "S%");
            query.setParameter("firstDate", dates[0]);
            query.setParameter("lastDate",dates[1]);
            Long count = (Long) query.uniqueResult();
           
            NewCustomerReport newCustomerReport = new NewCustomerReport();
            newCustomerReport.setAllCustomer(new Integer(count.toString()));
            
            query = session.createQuery(queryString);
            query.setParameter("installedModule", "Storage");
            query.setParameter("firstDate", dates[0]);
            query.setParameter("lastDate",dates[1]);
            count = (Long) query.uniqueResult();
            newCustomerReport.setStorageCustomer(new Integer(count.toString()));
            
            query = session.createQuery(queryString);
            query.setParameter("installedModule", "Server");
            query.setParameter("firstDate", dates[0]);
            query.setParameter("lastDate",dates[1]);
            count = (Long) query.uniqueResult();
            newCustomerReport.setServerCustomer(new Integer(count.toString()));
            
            query = session.createQuery(queryString);
            query.setParameter("installedModule", "Server, Storage");
            query.setParameter("firstDate", dates[0]);
            query.setParameter("lastDate",dates[1]);
            count = (Long) query.uniqueResult();
            newCustomerReport.setServerAndStorageCustomer(new Integer(count.toString()));
            newCustomerReport.setReportName("New Customers Report");
            
            return newCustomerReport;
        }

    @RequestMapping(value="/storageArrays/{param_colname}/{param_sDate}/{param_eDate}", method=RequestMethod.GET)
    	@ResponseBody
 
    	public Vector<StorageArray> newStorageArray(@PathVariable("param_colname") String columnName,
							    			@PathVariable("param_sDate") int startDate,
											@PathVariable("param_eDate") int endDate
											)
    {    	
    	Session session = sessionFactory.openSession();

        String[] sDate = Utilities.returnDate(startDate);
        String[] eDate = Utilities.returnDate(endDate);
        
        
        
        String columns[] = columnName.split(",");
        
        Vector<StorageArray> arrays = new Vector<StorageArray>();
        
        long totalArrayCount = 0;
        
        for (String c : columns)
        {
        	String queryString = String.format("SELECT count(%s) as count, sum(%s) as sum FROM Mastercsv WHERE %s <> 0 AND c_column BETWEEN '%s' AND '%s'",
														c, c, c,
														sDate[0], eDate[1]
												);
	
			
			Query query = session.createQuery(queryString);
			
			System.out.println("Query String: '" + query.getQueryString() + "'");

			List allpatients = query.list();
			Iterator it = allpatients.iterator();
			Object[] myResult = (Object[]) it.next();

		    StorageArray sa = new StorageArray();
		    sa.setReportName("Storage Array");
			sa.setArrayName(Utilities.addSpaceToString(Utilities.columnMap.get(c)));
	    	sa.setCustomerCount((Long)myResult[0]);
	    	sa.setArrayCount((Long)myResult[1]);

	    	totalArrayCount += (Long)myResult[1];
	    	
			arrays.add(sa);
        }
        
        for (StorageArray sa : arrays)
        {
        	sa.setPercent((int)(((double)sa.getArrayCount() / (double)totalArrayCount) * 100));
        }
        
        return arrays;
    }
    
    @RequestMapping(value="/versionInformation/{param_column}/{param_sDate}/{param_eDate}", method=RequestMethod.GET)
    	@ResponseBody
//    	public VersionInformationReport versionInformationArray(@PathVariable("param_column") String columnName,
   	public Vector<VersionInfo> versionInformationArray(@PathVariable("param_column") String columnName,
    															@PathVariable("param_sDate") int startDate,
    															@PathVariable("param_eDate") int endDate
    															)
    {
    	Session session = sessionFactory.openSession();
    	
        String[] sDate = Utilities.returnDate(startDate);
        String[] eDate = Utilities.returnDate(endDate);

        
        // SELECT u_column, w_column FROM mastercsv WHERE u_column <> '' and c_column BETWEEN '2013-07-01' AND '2013-08-31'
        
    	String queryString = String.format("SELECT %s, wColumn FROM Mastercsv WHERE %s <> '' AND cColumn BETWEEN '%s' AND '%s'",
    			columnName, columnName,
    			sDate[0], eDate[1]
		);
    	
    	System.out.println("queryString: " + queryString);
    	
        Query query = session.createQuery(queryString);
        
        List allpatients = query.list();
        Iterator it = allpatients.iterator();
        
        Vector<VersionInfo> versionStorageInformation = new Vector<VersionInfo>();
        
        int totalCustomerCount = 0;
        
        while (it.hasNext())
        {
            Object[] myResult = (Object[]) it.next();
            
            String version = (String)myResult[0];
            String storage = (String)myResult[1];

			int bestVersion = 0;

        	if (Utilities.columnMap.get(columnName).contains("ESX"))
        	{
        		if (version.contains(","))
        		{
        			String[] versions = version.split(", ");
        			
        			for (String s : versions)
        			{
        				String[] parts = s.split(" ");
          				
          				String t = String.format("%c%c%c", parts[2].charAt(0), parts[2].charAt(2), parts[2].charAt(4));
          				if (Integer.parseInt(t) > bestVersion)
          				{
          					bestVersion = Integer.parseInt(t);
          				}
        			}
        		}
        		else
        		{
       				String[] parts = version.split(" ");
      				
      				String t = String.format("%c%c%c", parts[2].charAt(0), parts[2].charAt(2), parts[2].charAt(4));
      				if (Integer.parseInt(t) > bestVersion)
      				{
      					bestVersion = Integer.parseInt(t);
      				}
        		}
        		
        		version = String.format("%d", bestVersion);
        		version = String.format("%c.%c.%c", version.charAt(0), version.charAt(1), version.charAt(2));
           	}
        	else
        	{
                if (version.contains(","))
                {
                	version = version.substring(0, version.indexOf(','));
            	}    
                
            	version = version.substring(version.indexOf(' ') + 1);
        	}

            if (storage.contains("Storage") || storage.contains("storage") || storage.contains("Both") || storage.contains("both"))
            {
            	storage = "Storage";
            }
            else
            {
            	storage = "";
            }
            
            boolean found = false;
            for (VersionInfo v : versionStorageInformation)
            {
            	if (v.getVersionNumber().equals(version))
            	{
            		found = true;
            		v.updateTotalCount();
            		
            		if (!storage.equals(""))
            		{
            			v.updateStorageCount();
            		}
            	}
            }
            
            if (!found)
            {
            	VersionInfo vi = new VersionInfo(version);
            	vi.updateTotalCount();
            	
            	if (!storage.equals(""))
            	{
            		vi.updateStorageCount();
            	}
            	
            	versionStorageInformation.add(vi);
            }
        }

        int totalCount = 0;
        
        for (VersionInfo va : versionStorageInformation)
        	totalCount += va.getTotalCount();
        
        for (VersionInfo va : versionStorageInformation)
        {
        	va.setPercent((int)(((double)va.getTotalCount() / (double)totalCount * 100)));
        }

    	
    	return versionStorageInformation;
    }


    @RequestMapping(value="/returnStorageMetric/{param_column}/{param_sDate}/{param_eDate}", method=RequestMethod.GET)
	@ResponseBody
	public ReportStorageMetric returnNewStorageMetric(
													@PathVariable("param_column") String columnName,
													@PathVariable("param_sDate") int startDate,
													@PathVariable("param_eDate") int endDate
													)
	{
		Session session = sessionFactory.openSession();
	
        String[] sDate = Utilities.returnDate(startDate);
        String[] eDate = Utilities.returnDate(endDate);

		ReportStorageMetric rsm = new ReportStorageMetric(this.formatStorageMetricTitle(Utilities.columnMap.get(columnName)));
        
		System.out.println(columnName);
		System.out.println(Utilities.columnMap.get(columnName));
		
		String col1 = columnName;
		String col2 = "";
		
		String loc[] = new String[2];
		try 
		{
			col2 = this.adjustDBColumn(columnName);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}		
		

		if (Utilities.columnMap.get(columnName).contains("Count"))
		{
			loc[0] = col1;
			loc[1] = col2;
		}
		else
		{
			loc[1] = col1;
			loc[0] = col2;
		}
		
		
		
		
		


       	String queryString = String.format("SELECT %s, %s FROM Mastercsv WHERE %s <> 0 AND %s <> 0 AND cColumn BETWEEN '%s' AND '%s'",
				col1, col2, col1, col2,

				sDate[0], eDate[1]
		);



       	System.out.println("Query String: '" + queryString + "'");
       	
		Query query = session.createQuery(queryString);

		List allpatients = query.list();
		Iterator it = allpatients.iterator();
				
		int totalCount = 0;
		int custCount = 0;
		int custTotal = 0;
		int totalTime = 0;
		int totalCust = 0;
		while (it.hasNext())
		{
			Object[] result = (Object[])it.next();
			
			int views = (Integer)result[0];
			
			if (views != 0)
			{
				totalCount += (Integer)result[0];
				custCount++;
			}
			
			int time = (Integer)result[1];
			
			if (time != 0)
			{
				totalTime += time;
				totalCust++;
			}
			
			custTotal++;
		}
		
		double avgPageView = (double)totalCount / (double)custCount;
		double timeAvg = (double)totalTime / (double)totalCust;
		
//		System.out.println(String.format("[TotalViews; CustomerCount; TotalCustomers; AvgPgView; AvgTime]: {%d; %d; %d; %.2f, %.2f}", totalCount, custCount, custTotal, avgPageView, timeAvg));
		
		
		rsm.setTotalPageViews(totalCount);
		rsm.setCustomerPageViews(custCount);
		rsm.setCustomersViewingPagePercent(0.0);
		rsm.setAveragePageViews(avgPageView);
		rsm.setAverageTime(timeAvg);

		
		
		return rsm;
	}
    
    private String formatStorageMetricTitle(String columnName)
    {    	
    	Vector<String> parts = new Vector<String>();
    	
    	int sIndex = 0;
    	for (int i = 0; i < columnName.length(); i++)
    	{
    		Character c = columnName.charAt(i);
    		
    		if (Character.isUpperCase(c))
    		{
    			if (i != 0 && !Character.isUpperCase(columnName.charAt(i - 1)))
    			{
    				parts.add(columnName.substring(sIndex, i));
        			sIndex = i;
    			}
       		}    		
    	}
    	
    	String finalString = "";
    	for (int i = 0; i < parts.size(); i++)
    	{
    		finalString += parts.elementAt(i) + " ";
    		
    		if (i != parts.size() - 1)
    		{
    			finalString += ": ";
    		}
    	}
    	    	
    	return finalString;
    }
    
    private String adjustDBColumn(String columnName) throws Exception
    {    	
    	int adjustBy = 0;
		if (Utilities.columnMap.get(columnName).contains("Count"))
		{
			adjustBy = +1;
		}
		else
		{
			adjustBy = -1;
		}

		String firstPart = "";
    	    	
		for (int i = 0; i < columnName.length(); i++)
    	{
    		Character c = columnName.charAt(i);
    		
    		if (Character.isUpperCase(c))
    		{
    			break;
       		}    		
    		
    		firstPart += c;
    	}
    	
		char c1;
		char c2;
		
		if (adjustBy < 0)
		{
			c1 = firstPart.charAt(0);
			c2 = firstPart.charAt(1);
			
			c2 -= 1;
			
			if (c2 < 'a')
				c1 -= 1;
			
			if (c1 < 'a')
				c1 = '\0';
		}
		else
		{
			c1 = firstPart.charAt(0);
			c2 = firstPart.charAt(1);
			
			c2 += 1;
			
			if (c2 > 'z')
				c1 = 'a';
			
			if (c1 > 'z')
				throw new Exception("Character Error Encountered");
			
		}
		
    	return String.format("%c%cColumn", c1, c2);
    }
}
