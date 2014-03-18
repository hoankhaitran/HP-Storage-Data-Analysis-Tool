/*
 * Developed by Hoan Tran.
 */
package edu.csus.csc191.common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletContext;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.lang3.text.WordUtils;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.thoughtworks.xstream.XStream;

import edu.csus.csc191.hibernate.HibernateUtil;
import edu.csus.csc191.models.DynamicCsv;

public class Utilities {
    private static SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    public static HashMap<String, String> columnMap = new HashMap<String,String>() ;
    private static Object[][] results ;
    @Autowired
    private ServletContext context;

    /**
     * This method returns the first and last date of a given month
     *
     * @param yearmonth An integer representing a specifc month of a specific year. format: YYYYMM
     * @return An array with two elements of type Date (the first millisecond and last millisecond of the chosen month).
     */
    public static Date[] getFirstDateLastDateInMonth(int yearmonth){
        Calendar dateCal = Calendar.getInstance();
        int month = yearmonth % 100;
        int year = yearmonth / 100;
        dateCal.set(Calendar.DAY_OF_MONTH, 1);
        dateCal.set(Calendar.MONTH, month);
        dateCal.set(Calendar.YEAR, year);
        dateCal.set(Calendar.HOUR_OF_DAY, 0);
        dateCal.set(Calendar.MINUTE, 0);
        dateCal.set(Calendar.SECOND, 0);
        dateCal.set(Calendar.MILLISECOND, 0);
        Date first = dateCal.getTime();

        dateCal.add(Calendar.MONTH, 1);
        dateCal.add(Calendar.MILLISECOND, -1);
        Date last = dateCal.getTime();

        Date[] results = new Date[2];
        results[0]= first;// first element represents the first millisecond of the month
        results[1]= last;// second element represents the last millisecond of the month
        return results;
    }

    /**
     * Given a valid table name in DB this method returns a list of all column names
     *
     * @param tableName
     * @return A List<String> of the column names in tableName.
     */
    public static List<String> getColumnNamesFromTable(String tableName){
        Session session = sessionFactory.openSession();

        //Use JDBC query style is not recommended only use as last resort
        SQLQuery sqlquery = session.createSQLQuery("select column_name from information_schema.columns where table_name='"+tableName+"'");
        List<String> results = sqlquery.list();

        /*Collections.sort(results, new Comparator<String>() {

            @Override
            public int compare(String arg0, String arg1) {
                // TODO Auto-generated method stub
                return arg0.compareTo(arg1);
            }
        });*/

        // Why have we decided to change column_names to columnNames? Why not have them consistent on both sides? Because of accessors and mutators of the Mastercsv
        List<String> newlist = new ArrayList<String>();
        WordUtils wutil = new WordUtils();
        int index;
        for (String item : results) {
            while ((index = item.indexOf('_')) != -1) {
                item = item.replace("_", " ");
                item = WordUtils.capitalizeFully(item, ' ');
                item = item.replace(" ", "");

                // System.out.print(item);
            }
            char[] temp = item.toCharArray();
            temp[0] = Character.toLowerCase(temp[0]);

            newlist.add(new String(temp));
        }

        session.close();
        return newlist;
    }

   //this method is called during Spring initialization
    public void initColumnsHashMap(){
        XStream xs = new XStream();
        InputStream is = null;
        String path =context.getRealPath("/resources/xml/table.xml");
        try {
            is = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        List<String> cols = Utilities.getColumnNamesFromTable("mastercsv");
        List<String> mappedCols = new ArrayList<String>();
        DynamicCsv dcsv = (DynamicCsv) xs.fromXML(is);

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = null;
        try {
            builder = factory.newDocumentBuilder();

        } catch (ParserConfigurationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Document doc = null;
        try {
            doc = builder.parse(path);
        } catch (SAXException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        NodeList list = doc.getElementsByTagName("*");

        for (int i = 0; i < list.getLength(); i++) {
            // Get element
            Element element = (Element) list.item(i);
            mappedCols.add(element.getNodeName());

        }
        mappedCols.remove(0);// remove root attribute
        results = new Object[2][mappedCols.size()];
        results[0] = cols.toArray();
        results[1] = mappedCols.toArray();

        for( int i =0; i<results[0].length-1; i++){

            columnMap.put((String)results[0][i], (String)results[1][i]);
        }

    }

    /**
     * Get mapped columns. Basically it gets all the column names from the
     * {tableName} table into one array, then reads the {tableXml} and puts
     * the element names except for the root element into the second array.
     *
     * @return A 2x2 Object array. The first element is a (String)Object array
     * containing CSV colun names, and the second element is a (String)Object
     * array containing mapped column names.
     */
    public static Object[][] getMappedColumns() {
    return results;
    }
    public static String[] returnDate(int yearmonth){
        String[] results = new String[2];

        Calendar dateCal = Calendar.getInstance();
        int month = yearmonth % 100;
        int year = yearmonth / 100;
        dateCal.set(Calendar.DAY_OF_MONTH, 1);
        dateCal.set(Calendar.MONTH, month);
        dateCal.set(Calendar.YEAR, year);
        dateCal.set(Calendar.HOUR_OF_DAY, 0);
        dateCal.set(Calendar.MINUTE, 0);
        dateCal.set(Calendar.SECOND, 0);
        dateCal.set(Calendar.MILLISECOND, 0);
        
        results[0]= String.format("%04d-%02d-%02d", dateCal.get(Calendar.YEAR), dateCal.get(Calendar.MONTH), dateCal.get(Calendar.DAY_OF_MONTH));// first element represents the first millisecond of the month
       
        dateCal.add(Calendar.MONTH, 1);
        dateCal.add(Calendar.MILLISECOND, -1);

        results[1]= String.format("%04d-%02d-%02d", dateCal.get(Calendar.YEAR), dateCal.get(Calendar.MONTH), dateCal.get(Calendar.DAY_OF_MONTH));// first element represents the first millisecond of the month
       
        return results;
    }
    public static String toHibernateFormat(String item){ //converts column name format from w_column to wColumn
    	WordUtils wutil = new WordUtils();
        int index;
        while ((index = item.indexOf('_')) != -1) {
            item = item.replace("_", " ");
            item = WordUtils.capitalizeFully(item, ' ');
            item = item.replace(" ", "");

            // System.out.print(item);
        }
        char[] temp = item.toCharArray();
        temp[0] = Character.toLowerCase(temp[0]);
        return new String(temp);
    }
    
	public static String addSpaceToString(String input){ //ThisIsFun to This Is Fun
		String result="";
    	for(int i = 0; i < input.length(); i++)
    	{
    	  char upperCase = input.charAt(i);
    	  if(Character.isUpperCase(upperCase))
    	  {
    	     String nextWord = " "+upperCase;

    	     for(int j = i+1; j < input.length() && (Character.isLowerCase(input.charAt(j))|| Character.isDigit(input.charAt(j))); j++)
    	     {
    	       
    	       nextWord += input.charAt(j);
    	       
    	       
    	       i++;
    	     }
    	     result+=nextWord;
    	     
    	  }
    	}
    	System.out.println(result);
        return result;
    }
}
