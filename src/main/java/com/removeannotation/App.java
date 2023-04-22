package com.removeannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        //ApplicationContext context = new ClassPathXmlApplicationContext("file:/Users/ravi/Documents/TestProjects/SpringCore/springcore/src/main/java/com/removeannotation/config.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        //Student student = context.getBean("student", Student.class);
        Student student = context.getBean("don", Student.class);

        System.out.println(student);
    }
}
