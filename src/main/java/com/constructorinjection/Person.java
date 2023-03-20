package com.constructorinjection;

public class Person {
    private String name;
    private Integer id;

    public Person(String nameValue, Integer id) {
        this.name = nameValue;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
