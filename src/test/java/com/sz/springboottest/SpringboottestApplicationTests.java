package com.sz.springboottest;

import com.sz.springboottest.config.BeanNameAwareDemo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringboottestApplication.class)
public class SpringboottestApplicationTests {

  @Autowired
  private BeanNameAwareDemo beanNameAwareDemo;

  private int i = 0;
  @Test
  @Scheduled(cron = "0/5 * * * * *")
  public void contextLoads() {
    System.out.println(++i);
    /*try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
    }*/
  }


  @Test
  public void mapTest() {
    Map<String, String> testMap = new HashMap<>();
    testMap.put(null, null);
    testMap.put(null, null);
    System.out.println(testMap.get(null));;
  }

  @Test
  public void beanNameAwareTest() {
    System.out.println(beanNameAwareDemo.getBeanName());
  }


  // 自定义标签
}
