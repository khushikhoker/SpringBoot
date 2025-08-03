package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {};

record Address(String firstLine, String city){};

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Khushi";
    }

    @Bean
    public int age() {
        return 24;
    }

    @Bean
    public Person person() {
        return new Person("Ram", 27);
    }

    @Bean
    public Address address() {
        return new Address("Lane 2 Mandakini Vihar", "xyzCity");
    }
}
