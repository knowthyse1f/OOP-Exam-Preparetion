package com.safu.properties.polymorphism;

public class Squre extends Shape{
    int side;

    @Override
    void area() {
        super.area();
        System.out.println(side*side);
    }
}
