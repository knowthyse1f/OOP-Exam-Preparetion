package com.safu.properties.inheritance;

public class Box {
    double l;
    double h;
    double w;
//    double weight;
    Box( ){
//      super(); object class
        System.out.println("Parent class constructor calling");
        this.h =-1;
        this.l=-1;
        this.w=-1;
//        this.weight=-5;
    }
    Box(double side){
        this.h=side;
        this.l=side;
        this.w=side;
    }

     Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
         System.out.println("# perameter passes");
    }
    Box(Box old){
        this.h= old.h;
        this.w=old.w;
        this.l=old.l;
    }

    public void information(){
        System.out.println("Running the box");
    }

}
