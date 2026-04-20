package com.naman.taskflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication → the starting point of our application.
 * This single annotation does three thing:
 * 1. @Configuration: Tells Spring this class can define Beans.
 * 2. @EnableAutoConfiguration: Tells Spring Boot to start adding beans based on 
 *    classpath settings, other beans, and various property settings.
 * 3. @ComponentScan: Tells Spring to look for @Component, @Service, @Repository, etc. 
 *    in the current package and all sub-packages.
 */
@SpringBootApplication
public class TaskFlowApplication {

    public static void main(String[] args) {
        // This is the line that actually starts the whole Spring engine
        SpringApplication.run(TaskFlowApplication.class, args);
    }
}
