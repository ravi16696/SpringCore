package com.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

//    @Value("#{4+5}")
    //@Value("#{T(com.spel.Demo).getValue()}") //note - give the complete package name
    @Value("#{T(java.lang.Math).sqrt(16)}")
    private Integer x;

    @Value("#{new String('ravi')}")
    private String str;

    @Value("#{4 < 5}") // it will resolve to false
    private boolean isActive;



    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Value("#{10>5 ? 2 : 8}")
    private Integer y;

    public Integer getX() {
        return x;
    }

    public static Integer getValue(){
        return 10;
    }

//    public void setX(Integer x) {
//        this.x = x;
//    }

    public Integer getY() {
        return y;
    }
//setter is not mandatory to write spring take it by default also
//    public void setY(Integer y) {
//        this.y = y;
//    }

    @Override
    public String toString() {
        return "Demo{" +
                "x=" + x +
                ", str='" + str + '\'' +
                ", isActive=" + isActive +
                ", y=" + y +
                '}';
    }
}
