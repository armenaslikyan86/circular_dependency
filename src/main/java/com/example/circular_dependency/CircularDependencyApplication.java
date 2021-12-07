package com.example.circular_dependency;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.support.GenericApplicationContext;

@SpringBootApplication
public class CircularDependencyApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(CircularDependencyApplication.class)
                .initializers((GenericApplicationContext c) -> c.setAllowCircularReferences(true))
                .allowCircularReferences(true)
                .run(args);
    }
}
