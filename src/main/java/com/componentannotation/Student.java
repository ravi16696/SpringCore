package com.componentannotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component // orr @Component("student")
@Scope("prototype")
//now prototype scope will give the new reference everytime, basically IOC container will give the new object
public class Student {

    @Value("Ravi")
    private String studentName;

    @Value("Bangalore")
    private String city;

    @Value("#{temp}")
    private List<String> address;


    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
