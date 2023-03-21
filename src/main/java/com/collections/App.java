package com.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:/Users/ravi/Documents/TestProjects/SpringCore/springcore/src/main/java/com/collections/config.xml");
        Employee employee = (Employee) context.getBean("Employee1");
        System.out.println(employee);

        //default type of list, set and map
        System.out.println("list type - " + employee.getPhones().getClass().getName()); // list type - java.util.ArrayList
        System.out.println("set type - " + employee.getAddress().getClass().getName()); // set type - java.util.LinkedHashSet
        System.out.println("map type - " + employee.getCourses().getClass().getName()); // map type - java.util.LinkedHashMap


    }
}
