package com.sz.springboottest.customlabel;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * 自定义解析
 *
 * @author abel
 * @date 2020/10/9 22:13
 */
public class UserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {
  // Element对应的类
  @Override
  protected Class getBeanClass(Element element) {
    return User.class;
  }

  /**
   *
   * 从element中解析并提取对应的元素
   *
   * @author abel
   * @date 2020/10/9 22:17
   * @param element
   * @param builder
   * @return
   **/
  @Override
  protected void doParse(Element element, BeanDefinitionBuilder builder) {
    String userName = element.getAttribute("userName");
    String email = element.getAttribute("email");
    // 将提取的数据放入到BeanDefinition中，待到完成所有bean的解析后统一注册到beanFactory中
    if (StringUtils.hasText(userName)) {
      builder.addPropertyValue("userName", userName);
    }
    if (StringUtils.hasText(email)) {
      builder.addPropertyValue("email", email);
    }
  }
}
