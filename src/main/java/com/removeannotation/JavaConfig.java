package com.removeannotation;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
//@ComponentScan(basePackages = "com.removeannotation")
public class JavaConfig {

    //@Bean
    @Bean(name = {"student", "don"})
    public Student getStudent(){
        Student student = new Student();
        student.setName("Anu");
        return student;
    }

}
