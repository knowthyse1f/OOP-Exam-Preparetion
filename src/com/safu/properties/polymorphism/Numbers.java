package com.safu.properties.polymorphism;

public class Numbers {
    int sum(int a, int b, int c){
        return a+b+c;
    }
    //method overloading
    int sum(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        Numbers obj= new Numbers();
        System.out.println(obj.sum(1,3)+obj.sum(1,2,3));
    }
}
