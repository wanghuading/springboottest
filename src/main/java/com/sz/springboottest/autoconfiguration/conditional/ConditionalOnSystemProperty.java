package com.sz.springboottest.autoconfiguration.conditional;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Conditional({OnSystemPropertyCodition.class})
public @interface ConditionalOnSystemProperty {
  String name() default "";
  String value() default "";
}
