package edu.csus.csc191.controllers;

import java.util.Locale;

import javax.servlet.ServletContext;

import org.springframework.security.access.annotation.Secured;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;



/**
 * Handles requests for the application home page.
 */
@Controller
@Secured("ROLE_ADMIN")
public class AppController {

    @Autowired
    private ServletContext context;

    /**
     * Set multiple default model attributes for all controllers that extend AppController.
     * controller.
     *
     * @param model The model that is modified whenever a @RequestMapping URL
     * is requested by the client.
     */
    @ModelAttribute
    public void setCommonModelAttributes(Model model) {
        model.addAttribute("appTitle", "HP Data Storage Analysis Tool");
        model.addAttribute("contextPath", context.getContextPath()); // if needed, e.g. helpful in client-side JavaScript-based redirects or forwards.
    }

    static {
        System.out.println(" -- Initializing AppController.");
    }
}
