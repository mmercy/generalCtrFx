package com.java.intentory.repository.test;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.java.intentory")
@PropertySource("classpath:application.properties")
public class TestRepositoryConfig {

}
