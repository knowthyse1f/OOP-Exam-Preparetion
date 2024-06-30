package com.safu.examquestionsolve.q6c;

public class PartTimeEmployee extends Employee{
    boolean isPartimeEmployee;
    public PartTimeEmployee(String ID, String name, int salary, boolean isPartimeEmployee) {
        super(ID, name, salary);
        this.isPartimeEmployee=isPartimeEmployee;
    }

    @Override
    public int annualSalary(int bonus, int increment) {
        return super.annualSalary(bonus, increment);
    }
}
