package com.standalonecollection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
    List<String> friends;
    Map<String, Integer> nameAgeMap;
    private Properties props;

    public Person() {
    }

    public Properties getProps() {
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    public List<String> getFriends() {
        return friends;
    }

    public Map<String, Integer> getNameAgeMap() {
        return nameAgeMap;
    }

    public void setNameAgeMap(Map<String, Integer> nameAgeMap) {
        this.nameAgeMap = nameAgeMap;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "Person{" +
                "friends=" + friends +
                ", nameAgeMap=" + nameAgeMap +
                ", props=" + props +
                '}';
    }
}
