package com.standalonecollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:/Users/ravi/Documents/TestProjects/SpringCore/springcore/src/main/java/com/standalonecollection/config.xml");
        Person person = (Person) context.getBean("person1");
        System.out.println(person);
        System.out.println(person.getFriends().getClass().getName());
        System.out.println(person.getNameAgeMap().getClass().getName());
    }
}
