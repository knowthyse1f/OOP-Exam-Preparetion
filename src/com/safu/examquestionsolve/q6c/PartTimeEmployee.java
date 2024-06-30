package com.safu.examquestionsolve.q6c;

public class PartTimeEmployee extends Employee{

    public PartTimeEmployee(String ID, String name) {
        super(ID, name);

    }

    @Override
    public int annualSalary(int totalHour, int perHourSelary) {
        return totalHour*perHourSelary;
    }
}
