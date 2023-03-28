package com.componentannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:/Users/ravi/Documents/TestProjects/SpringCore/springcore/src/main/java/com/componentannotation/config.xml");
        Student student = context.getBean("student", Student.class);
        System.out.println("student hash - " + student.hashCode());
        System.out.println(student.getAddress());
        System.out.println(student);
        Student student1 = context.getBean("student", Student.class);
        System.out.println("student1 hash - " + student1.hashCode());
    }
}
