package com.safu.examquestionsolve.q6a;

import java.util.Scanner;

public class GradeBookTest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        GradeBook myGradeBook= new GradeBook();
        System.out.println("Please Enter The Course Name");
        String nameOfCourse= input.nextLine();
        System.out.println();
        myGradeBook.displayMassage(nameOfCourse);

    }
}
