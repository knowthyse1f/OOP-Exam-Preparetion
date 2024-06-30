package com.safu.properties.inheritance;
//inheritance
public class BoxWeight extends Box{
    double weight;

    public BoxWeight() {
        this.weight=-1;
//        System.out.println(this.weight);
    }
    BoxWeight(BoxWeight other){
        super(other);
        weight=other.weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); //what is this ? call the parent class constructor
        //used to initialise values paresent in parent class
        this.weight = weight;
//        System.out.println(this.weight);
    }
    BoxWeight(double weight){
        super(123);
        this.weight=weight;
    }

}
