package com.autowiring.xmlautowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:/Users/ravi/Documents/TestProjects/SpringCore/springcore/src/main/java/com/autowiring/xmlautowiring/config.xml");
        Employee employee = (Employee) context.getBean("employee");
        Employee employee1 = context.getBean("employee", Employee.class); //here we don't have to typecast
        System.out.println(employee);
    }
}
