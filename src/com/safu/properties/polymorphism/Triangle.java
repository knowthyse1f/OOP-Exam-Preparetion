package com.safu.properties.polymorphism;

public class Triangle extends Shape{
    int base;
    int height;

    @Override
    void area() {
        super.area();
        System.out.println(.5*base*height);
    }
}
