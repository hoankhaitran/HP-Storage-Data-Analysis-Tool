package edu.csus.csc191.common;

import java.lang.annotation.*;

/**
 * This is a custom-made annotation. It allows us to put @Layout to specify
 * specific layouts for controllers or methods that shouldn't use our default
 * "skeleton" template.
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Layout {
    String value() default "";
}
