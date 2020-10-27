package com.sz.springboottest;

import com.sz.springboottest.autoconfiguration.Count;
import com.sz.springboottest.autoconfiguration.annotation.EnableHelloWorld;
import com.sz.springboottest.autoconfiguration.conditional.ConditionalOnSystemProperty;
import com.sz.springboottest.service.PersonService;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;



//@EnableScheduling
//@EnableCaching
//@RibbonClient("ribbon-service")
//@EnableFeignClients
@SpringBootApplication(scanBasePackages = "com.sz.springboottest")
//@ComponentScan("com.sz.springboottest.autoconfiguration")
//@EnableAutoConfiguration
public class SpringboottestApplication {


  // 编程时条件装配
//  @ConditionalOnSystemProperty(name = "user.name", value = "wang")
//  @Bean
//  public String condition() {
//    return "编程时条件状态";
//  }

  public static void main(String[] args) {
    SpringApplication.run(SpringboottestApplication.class, args);
    LoggerFactory.getLogger(SpringboottestApplication.class).info("SpringboottestApplication started successfully.");
//    ConfigurableApplicationContext context =
//      new SpringApplicationBuilder(SpringboottestApplication.class)
//        .web(WebApplicationType.NONE)
//        // profile实现条件装配
////        .profiles("java8")
//        .run(args);

    // profile 条件装配
//    Count contextBean = context.getBean(Count.class);
//    int sum = contextBean.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//    System.out.println("Count sum = " + sum);

    // 编程时条件装配
//    String condition = context.getBean("condition", String.class);
//    System.out.println(condition);

    // 自动装配
//    String helloWorld = context.getBean("helloWorld", String.class);
//    System.out.println(helloWorld);


//    String helloWorld = context.getBean("helloWorld", String.class);
//    System.out.println(helloWorld);

//    context.close();
  }

}
