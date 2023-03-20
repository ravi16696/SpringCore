package com.ambiguity;

public class Addition {
    private int a;
    private int b;

    public Addition(double a, double b){
        this.a = (int) a;
        this.b = (int) b;
        System.out.println("double addition");
    }
    public Addition(int a, int b) {
        this.a = b;
        this.b = a;
        System.out.println("in integer constructor");
    }

    public Addition(String a, String b){
        this.a = Integer.parseInt(a);
        this.b = Integer.parseInt(b);
        System.out.println("In string constructor");
    }



    @Override
    public String toString() {
        return "Addition{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public void doSum(){
        System.out.println("Sum is + " + a + b);
    }
}
