package com.safu.properties.inheritance;

import javax.swing.Box;

public class Main {
    public static void main(String[] args) {
//        Box box=new Box(4);
//        Box box1=new Box(4.6, 7.9,9.9);
//        Box box2= new Box(box1);
//        System.out.println(box.l+" :length, "+ box.h+" :height, "+box.w+" : width");

//        BoxWeight box3= new BoxWeight();
//        BoxWeight box4=new BoxWeight(2,3,4,8);
//        System.out.println(box3.h+" "+box3.weight);

//        this is the reference type of box and it is object of boxweight
//        Box box5=new BoxWeight(2,3,4,8);
//        System.out.println(box5.w);
//        BoxWeight box10=new BoxWeight();

//        there are many variables in both parent and child classes
//        you are given acces to variables that  are in ref type i.e. BoxWeight
//        hence you should have access to weight variable
//        this also means , that the ones you are trying to access should be initialized
//        but therer, when the obj itself of type parent class how will you call the constructor of child class
//        this is why error
//        BoxWeight box6=new Box(2,3,4);
//        System.out.println(box5.w);
        BoxPrice box6=new BoxPrice(12,15,30,5,4);
       BoxPrice box7=new BoxPrice(120,30);
        System.out.println(box7.h);
    }
}
