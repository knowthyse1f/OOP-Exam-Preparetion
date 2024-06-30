package com.safu.properties.polymorphism;

public class Circle extends Shape{
    int radius;

    @Override
    void area() {
        super.area();
        System.out.println(radius*radius*3.1416);
    }
}
