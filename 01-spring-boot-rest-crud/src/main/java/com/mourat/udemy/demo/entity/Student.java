package com.mourat.udemy.demo.entity;

public class Student {

    // private fields of student
    private String firstName;
    private String lastName;

    // Implement empty constructor and one with private fields


    public Student() {
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    // Implement getters/Setters for private fields

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
