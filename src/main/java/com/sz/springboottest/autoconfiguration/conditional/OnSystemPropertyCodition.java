package com.sz.springboottest.autoconfiguration.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

public class OnSystemPropertyCodition implements Condition {
  @Override
  public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
    Map<String, Object> attributes = annotatedTypeMetadata.getAnnotationAttributes(ConditionalOnSystemProperty.class.getName());
    String propertyName = (String) attributes.get("name");
    String propertyValue = (String) attributes.get("value");
    String systemName = System.getProperty(propertyName);
    return systemName.equalsIgnoreCase(propertyValue);
  }
}
