package com.safu.examquestionsolve.q6b;

public class Employee {
    String name;
    String ID;
    int salary;

    public Employee(String ID, String name, int salary) {
        this.ID = ID;
        this.name = name;
        this.salary = salary;
    }
    public int annualSalary(int bonus, int increment){
        int totalSalary= salary*12;
        totalSalary+=bonus;
        totalSalary+=increment;
        return totalSalary;
    }
}
