package com.sz.springboottest.config;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

@Component
public class BeanNameAwareDemo implements BeanNameAware {

  private String beanName;

  public String getBeanName() {
    return beanName;
  }

  @Override
  public void setBeanName(String beanName) {
    this.beanName = beanName;
  }
}
