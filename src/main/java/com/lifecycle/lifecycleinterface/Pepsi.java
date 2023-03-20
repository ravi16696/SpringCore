package com.lifecycle.lifecycleinterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {

    private double price;

    public Pepsi(double price) {
        this.price = price;
    }

    public Pepsi() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pepsi{" +
                "price=" + price +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        //auto generated method
        //init
        System.out.println("taking pepsi :- init");
    }

    @Override
    public void destroy() throws Exception {
        //auto generated method
        //destroy
        System.out.println("going to put bottle after drining");
    }
}
