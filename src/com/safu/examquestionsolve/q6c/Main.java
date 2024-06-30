package com.safu.examquestionsolve.q6c;

public class Main {
    public static void main(String[] args) {
        FullTimeEmployee fe1=new FullTimeEmployee("123456","Rahim",23000,true);
        int fec1= fe1.annualSalary(5000,12345);
        System.out.println(fec1);
    }
}
