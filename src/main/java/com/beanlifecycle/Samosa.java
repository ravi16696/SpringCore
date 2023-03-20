package com.beanlifecycle;

public class Samosa {
    private double price;

    public Samosa(double price) {
        System.out.println("Setting price");
        this.price = price;
    }

    public Samosa() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }

    //lifecycle method

    public void init(){
        System.out.println("Inside init method");
    } //here method name can be anything, we just need to tell in config file

    public void destroy(){
        System.out.println("Inside destroy method");
    }
    //here method name can be anything, we just need to tell in config file
}
