/*
 * Developed by Hoan Tran. 
 */
package edu.csus.csc191.controllers;


import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import javax.servlet.ServletContext;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import edu.csus.csc191.common.Utilities;



/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

    private static final Logger logger = LoggerFactory
        .getLogger(HomeController.class);

    @Autowired
    private ServletContext context;

    /**
     * Handles the home page.
     *
     * @param locale
     * @param model The model associated with the home page view.
     * @return Returns the name of the view that should generate the response content.
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
        public String home(Locale locale, Model model) {
            logger.info("Welcome home! The client locale is {}.", locale);
            Date date = new Date();
            DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,
                    DateFormat.LONG, locale);

            String formattedDate = dateFormat.format(date);
            model.addAttribute("message", "Welcome to DSAT !");
            model.addAttribute("serverTime", formattedDate);

            return "home";
        }
    
    /**
     * Generate the report.
     *
     * @param model The model associated with the report view.
     * @return Returns the name of the view that should generate the response content.
     */
    @RequestMapping(value = "/showMetricReport", method = RequestMethod.GET)
        public String showMetricReport(Model model) {

            model.addAttribute("message", "Metric Report");
            

            return "report";
        }

    /**
     * Upload file.
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/showupload", method = RequestMethod.GET)
        public String upload(Model model) {

            model.addAttribute("message", "Upload");

            return "upload";
        }

    static {
        System.out.println(" -- Initializing HomeController.");
    }
}
