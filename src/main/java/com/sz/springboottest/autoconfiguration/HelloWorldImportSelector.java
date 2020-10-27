package com.sz.springboottest.autoconfiguration;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class HelloWorldImportSelector implements ImportSelector {
  @Override
  public String[] selectImports(AnnotationMetadata annotationMetadata) {
    String[] strings = {HelloWorldConfiguration.class.getName()};
    return strings;
  }
}
