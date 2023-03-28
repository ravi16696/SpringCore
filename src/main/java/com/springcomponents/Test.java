package com.springcomponents;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:/Users/ravi/Documents/TestProjects/SpringCore/springcore/src/main/java/com/springcomponents/config.xml");
        //Student student = (Student) context.getBean("student");
        //System.out.println(student);
    }
}
