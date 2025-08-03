package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.naming.Name;

record Person(String name, int age, Address address) {};

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
        return new Person("Ram", 27,  new Address("Lane 2 Mandakini Vihar", "xyzCity"));
    }

    @Bean
    public Person person2Methodcall() {
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address3) {
        return new Person(name, age, address3);
    }

    @Bean(name = "address2")
    public Address address() {
        return new Address("Lane 2 Mandakini Vihar", "xyzCity");
    }

    @Bean
    public Address address3() {
        return new Address("Labcd dkdhf", "abc city");
    }
}
