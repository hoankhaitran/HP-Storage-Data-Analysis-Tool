/*
 * Developed by Hoan Tran. 
 */
package edu.csus.csc191.controllers;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.thoughtworks.xstream.XStream;

import edu.csus.csc191.common.Utilities;
import edu.csus.csc191.models.DynamicCsv;

@Controller
public class DBMapperController extends AppController {
    @Autowired
    private ServletContext context;

    /**
     * Get the mapped columns from mastercsv. Basically it gets all the column names from the
     * dynamiccsv table into one array, then reads the table.xml and puts
     * the element names except for the root element into the second array.
     *
     * @return A 2x2 Object array. The first element is a (String)Object array
     * containing CSV colun names, and the second element is a (String)Object
     * array containing mapped column names.
     */
    @RequestMapping(value = "/getMappedColumns", method = RequestMethod.GET)
        @ResponseBody
        public Object[][] getMappedColumns() {

            return Utilities.getMappedColumns();
            
        }
    @RequestMapping(value = "/writeObjectToXml", method = RequestMethod.GET)
    private String writeObjectToXml(Model model){
    	XStream xs = new XStream();
        OutputStream os = null;
        String path =context.getRealPath("/resources/xml/newtable.xml");
        try {
            os = new FileOutputStream(path);
            xs.toXML(new DynamicCsv(), os);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        model.addAttribute("message", "xml created");

        return "home";
        
       
    }

}
