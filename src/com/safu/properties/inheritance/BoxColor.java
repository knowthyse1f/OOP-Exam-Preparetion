package com.safu.properties.inheritance;

public class BoxColor extends BoxPrice{
    String color;

    public BoxColor(String color) {
        this.color = color;
    }

    public BoxColor(double l, double h, double w, double weight, double cost, String color) {
        super(l, h, w, weight, cost);
        this.color = color;
    }
}
