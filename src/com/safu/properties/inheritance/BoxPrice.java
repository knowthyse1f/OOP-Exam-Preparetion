package com.safu.properties.inheritance;

public class BoxPrice extends BoxWeight{
    double cost;
    BoxPrice(){
        super();
        this.cost=-1;
    }
    BoxPrice(BoxPrice old){
        super(old);
        this.cost=old.cost;
    }

    public BoxPrice(double cost) {
        this.cost = cost;
    }

    public BoxPrice(double l, double h, double w, double weight, double cost) {
        super(l, h, w, weight);
        this.cost = cost;
    }

    public BoxPrice(double weight, double cost) {
        super(weight);
        this.cost = cost;
    }
}
