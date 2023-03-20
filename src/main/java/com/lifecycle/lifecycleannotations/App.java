package com.lifecycle.lifecycleannotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("file:/Users/ravi/Documents/TestProjects/SpringCore/springcore/src/main/java/com/lifecycle/lifecycleannotations/config.xml");
        Example example = (Example) context.getBean("example1");
        System.out.println(example);
        context.registerShutdownHook();
    }
}
