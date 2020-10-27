package com.sz.springboottest.autoconfiguration;

import com.sz.springboottest.autoconfiguration.annotation.EnableHelloWorld;
import com.sz.springboottest.autoconfiguration.conditional.ConditionalOnSystemProperty;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableHelloWorld
@ConditionalOnSystemProperty(name = "user.name", value = "whd")
public @interface HelloWorldAutoConfiguration {
}
