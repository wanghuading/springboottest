package com.sz.springboottest.autoconfiguration.annotation;

import com.sz.springboottest.autoconfiguration.HelloWorldConfiguration;
import com.sz.springboottest.autoconfiguration.HelloWorldImportSelector;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.SchedulingConfiguration;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
//@Import({HelloWorldConfiguration.class})
@Import(HelloWorldImportSelector.class)
@Documented
public @interface EnableHelloWorld {
}
