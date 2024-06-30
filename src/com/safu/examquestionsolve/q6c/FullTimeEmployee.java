package com.safu.examquestionsolve.q6c;

public class FullTimeEmployee extends Employee{
    boolean isFullTimeEmployee;

    public FullTimeEmployee(String ID, String name, int salary,boolean isFullTimeEmployee) {
        super(ID, name, salary);
        this.isFullTimeEmployee=isFullTimeEmployee;
    }

    @Override
    public int annualSalary(int bonus, int increment) {
        return super.annualSalary(bonus, increment);
    }
}
