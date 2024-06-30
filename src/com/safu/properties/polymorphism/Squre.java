package com.safu.properties.polymorphism;

public class Squre extends Shape{
    int side;
// this will run when obj of Circle is created
// hence iit is overridding the parent method
    @Override // this is called annotation
    void area() {
        super.area();
        System.out.println(side*side);
    }
}
