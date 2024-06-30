package com.safu.examquestionsolve.q6c;

public class Main {
    public static void main(String[] args) {
        FullTimeEmployee fe1=new FullTimeEmployee("123456","Rahim",23000,true);
        PartTimeEmployee pe1= new PartTimeEmployee("123455","Karim");

        int fec1= fe1.annualSalary(5000,12345);
        int pec1= pe1.annualSalary(125,53);

        System.out.println(fe1.ID+"\t"+ fe1.name+"\t" +fec1);
        System.out.println(pe1.ID+"\t"+ pe1.name+"\t" +pec1);


    }
}
