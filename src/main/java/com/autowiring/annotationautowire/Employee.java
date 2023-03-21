package com.autowiring.annotationautowire;

import com.autowiring.annotationautowire.Address;
import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

//    @Autowired //- property injection
    private Address address;

//    @Autowired //- constructor injection
    public Employee(Address address) {
        this.address = address;
    }

    public Employee() {
    }

    public Address getAddress() {
        return address;
    }

    @Autowired //- setter injection
    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }
}
