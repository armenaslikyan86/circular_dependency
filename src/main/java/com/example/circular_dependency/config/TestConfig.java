package com.example.circular_dependency.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.example.circular_dependency.config" })
public class TestConfig {
}
