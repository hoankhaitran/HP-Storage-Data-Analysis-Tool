/*
 * Developed by Hoan Tran. 
 */
package edu.csus.csc191.controllers;


import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.csus.csc191.common.Utilities;
import edu.csus.csc191.hibernate.HibernateUtil;
import edu.csus.csc191.models.DynamicCsv;
import edu.csus.csc191.models.Mastercsv;
import edu.csus.csc191.models.Reports.CustomerEnvironmentSizeReport;
import edu.csus.csc191.models.Reports.NewCustomerReport;
import edu.csus.csc191.models.interfaces.IReport;

@Controller
public class ReportController {
    private static SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    @Autowired
    DynamicCsv dcsv ;


    /**
     * Get the average, sum, and maximum of the specified {column} of type {dataType} during {yearmonth}
     *
     * @param column
     * @param dateType
     * @param yearmonth
     * @return The average, sum, and maximum of the specified {column} of type {dataType} during {yearmonth}
     */
    @RequestMapping(value = "/reportCustomerEnvironmentSize/{column}/{dateType}/{yearmonth}", method = RequestMethod.GET)
        public @ResponseBody
        IReport reportCustomerEnvironmentSize(
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

            cesReport.setEnvName(Utilities.columnMap.get(column));
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
    @RequestMapping(value="/newCustomersReport", method = RequestMethod.GET)
        public @ResponseBody NewCustomerReport newCustomersReport(){
            Session session = sessionFactory.openSession();
           // Date[] dates = Utilities.getFirstDateLastDateInMonth(yearmonth);

            //Use Hibernate Query Language HQL if you want to write SQL like queries

            String queryString = "select count("+dcsv.getInstalledModule()+") from Mastercsv where "+dcsv.getInstalledModule()+" like :installedModule" ;
            Query query = session.createQuery(queryString);
            query.setParameter("installedModule", "Server%");
            //query.setParameter("firstDate", dates[0]);
           // query.setParameter("lastDate",dates[1]);
            Long count = (Long) query.uniqueResult();
            System.out.println(count);
            NewCustomerReport newCustomerReport = new NewCustomerReport();
            newCustomerReport.setAllCustomer(new Integer(count.toString()));
            return newCustomerReport;
        }

    static {
        System.out.println(" -- Initializing ReportController.");
    }
}
