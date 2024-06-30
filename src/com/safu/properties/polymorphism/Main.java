package com.safu.properties.polymorphism;

public class Main {
    public static void main(String[] args) {
        Circle circle=new Circle();
        circle.radius=23;
        circle.area();

        Triangle triangle=new Triangle();
        triangle.height=10;
        triangle.base=5;
        triangle.area();

        Squre squre=new Squre();
        squre.side=20;
        squre.area();
    }

}
