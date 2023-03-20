package com.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
    private String name;
    private List<String> phones;
    private Set<String> address;
    private Map<String, Integer> courses;

    public Employee(String name, List<String> phones, Set<String> address, Map<String, Integer> courses) {
        this.name = name;
        this.phones = phones;
        this.address = address;
        this.courses = courses;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public Set<String> getAddress() {
        return address;
    }

    public void setAddress(Set<String> address) {
        this.address = address;
    }

    public Map<String, Integer> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, Integer> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", phones=" + phones +
                ", address=" + address +
                ", courses=" + courses +
                '}';
    }
}
