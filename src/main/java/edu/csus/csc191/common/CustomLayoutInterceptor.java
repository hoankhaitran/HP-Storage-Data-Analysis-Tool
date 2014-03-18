package edu.csus.csc191.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.util.Assert;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * This class implements an interceptor that does some processing of the view
 * name in order to be able to create a custom view layout. You might not need
 * to worry about this. Just continue using the controllers like normal.
 */
public class CustomLayoutInterceptor extends HandlerInterceptorAdapter {

    private static final String DEFAULT_LAYOUT = "skeleton";
    private static final String DEFAULT_VIEW_ATTRIBUTE_NAME = "view";

    private String defaultLayout = DEFAULT_LAYOUT;
    private String viewAttributeName = DEFAULT_VIEW_ATTRIBUTE_NAME;

    /**
     * Setter for this.defaultLayout.
     *
     * @param defaultLayout The new value for this.defaultLayout
     */
    public void setDefaultLayout(String defaultLayout) {
        Assert.hasLength(defaultLayout);
        this.defaultLayout = defaultLayout;
    }

    /**
     * Setter for this.viewAttributeName.
     *
     * @param viewAttributeName The new value for this.viewAttributeName
     */
    public void setViewAttributeName(String viewAttributeName) {
        Assert.hasLength(defaultLayout);
        this.viewAttributeName = viewAttributeName;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        if (modelAndView == null || !modelAndView.hasView()) {
            return;
        }
        String originalViewName = modelAndView.getViewName();
        if (isRedirectOrForward(originalViewName)) {
            return;
        }
        System.out.println(" -- Custom layout interceptor intercepting URI: " + request.getRequestURI());
        String layoutName = getLayoutName(handler);
        modelAndView.setViewName(layoutName);
        modelAndView.addObject(this.viewAttributeName, originalViewName);
       
    }

    private boolean isRedirectOrForward(String viewName) {
        return viewName.startsWith("redirect:") || viewName.startsWith("forward:");
    }

    private String getLayoutName(Object handler) {
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Layout layout = getMethodOrTypeAnnotation(handlerMethod);
        if (layout == null) {
            return this.defaultLayout;
        } else {
            return layout.value();
        }
    }

    private Layout getMethodOrTypeAnnotation(HandlerMethod handlerMethod) {
        Layout layout = handlerMethod.getMethodAnnotation(Layout.class);
        if (layout == null) {
            return handlerMethod.getBeanType().getAnnotation(Layout.class);
        }
        return layout;
    }

    static {
        System.out.println(" -- Initializing CustomLayoutInterceptor.");
    }
}
