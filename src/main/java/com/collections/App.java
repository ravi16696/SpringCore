package com.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:/Users/ravi/Documents/TestProjects/SpringCore/springcore/src/main/java/com/collections/config.xml");
        Employee employee = (Employee) context.getBean("Employee1");
        System.out.println(employee);
    }
}
