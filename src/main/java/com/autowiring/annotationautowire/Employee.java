package com.autowiring.annotationautowire;

import com.autowiring.annotationautowire.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

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
    @Qualifier("address5") // pass the name of the bean, that you want to be called
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
