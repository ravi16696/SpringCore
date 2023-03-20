package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
//        String classpath = System.getProperty("java.class.path");
//        System.out.println("classPath - " + classpath);
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("file:/Users/ravi/Documents/TestProjects/SpringCore/springcore/src/main/java/com/springcore/config.xml");
        Student student = (Student) applicationContext.getBean("student1");
        Student student1 = (Student) applicationContext.getBean("student2");
        System.out.println(student);
        System.out.println(student1);
    }
}

