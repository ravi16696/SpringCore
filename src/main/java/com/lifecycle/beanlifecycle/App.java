package com.lifecycle.beanlifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        //this line won't call destroy method it will only call init, to call destroy method register it for shutdown
        //ApplicationContext context = new ClassPathXmlApplicationContext("file:/Users/ravi/Documents/TestProjects/SpringCore/springcore/src/main/java/com/beanlifecycle/config.xml");
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("file:/Users/ravi/Documents/TestProjects/SpringCore/springcore/src/main/java/com/lifecycle/beanlifecycle/config.xml");
        context.registerShutdownHook();
        Samosa samosa = (Samosa) context.getBean("samosa1");
        System.out.println(samosa);

    }
}
