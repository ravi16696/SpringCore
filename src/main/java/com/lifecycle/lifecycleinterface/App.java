package com.lifecycle.lifecycleinterface;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("file:/Users/ravi/Documents/TestProjects/SpringCore/springcore/src/main/java/com/lifecycle/lifecycleinterface/config.xml");
        context.registerShutdownHook(); // this is mandatory to call destroy
        Pepsi pepsi = (Pepsi) context.getBean("pepsi1");
        System.out.println(pepsi);
    }
}
