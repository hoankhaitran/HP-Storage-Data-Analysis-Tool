package edu.csus.csc191.controllers;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.csus.csc191.common.AppController;
import edu.csus.csc191.common.Utilities;

import javax.servlet.ServletContext;


@Controller
public class UsersController extends AppController {
    private static String PAGE_TITLE = "Users";
    private static String VIEW_NAME = "v2_users";
    @Autowired private ServletContext context;

    /**
     * Set defaults model attributes for this controller.
     *
     * @param model The model that is modified whenever a @RequestMapping URL
     * is requested by the client.
     */
    @ModelAttribute
    @Override
    public void setCommonModelAttributes(Model model) {
        super.setCommonModelAttributes(model);
        model.addAttribute("pageTitle", PAGE_TITLE);
    }

    /**
     * Users
     *
     * @param locale
     * @param model The model associated with the home page view.
     * @return Returns the name of the view that should generate the response content.
     */
    @RequestMapping(value = "/users", method = RequestMethod.GET)
        @Secured("ROLE_ADMIN")
        public String v2Users(Locale locale, Model model) {

            // TODO...

            return VIEW_NAME;
        }

}
