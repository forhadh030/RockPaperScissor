package org.example;

import java.sql.SQLOutput;

public class Student {
    /*
    Student
        What is the name of the student? (String name)
        What is the student ID of the student? (int studentID)
        What is the major of the student? (String major)
        What is the GPA of the student? (double GPA)
        What is the date of birth of the student? (String dateOfBirth)
    */
    String name;
    int studentID;
    String major;
    double GPA;
    String dateOfBirth;

    public Student(String name, int studentID, String major, double GPA, String dateOfBirth) {
        this.name = name;
        this.studentID = studentID;
        this.major = major;
        this.GPA = GPA;
        this.dateOfBirth = dateOfBirth;
    }

    public Student(){};
    public void studentInfo() {
        System.out.println("My name is " + name + " and I was born on " + dateOfBirth + ". My student ID is: " + studentID + ". My major is " +
                major + " with a GPA of " + GPA);
    }
}
