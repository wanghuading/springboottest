package com.sz.springboottest.customlabel;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * 调用自定义解析器
 *
 * @author abel
 * @date 2020/10/9 22:22
 */
public class MyNamespaceHandler extends NamespaceHandlerSupport {
  @Override
  public void init() {
    registerBeanDefinitionParser("user", new UserBeanDefinitionParser());
  }
}
