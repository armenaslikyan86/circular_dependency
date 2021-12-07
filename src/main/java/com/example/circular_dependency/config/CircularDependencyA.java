package com.example.circular_dependency.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CircularDependencyA {

    @Autowired
    private CircularDependencyB circB;
}
