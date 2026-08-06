package com.mile1.bean;

public class Student {
    private String name;
    private int[] marks;
    private String grade;

    // 1. Default Constructor
    public Student() {
    }

    // 2. Parameterized Constructor (Fixes: new Student("John", new int[] { 85, 90, 85 }))
    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    // 3. Constructor with Grade (if needed)
    public Student(String name, int[] marks, String grade) {
        this.name = name;
        this.marks = marks;
        this.grade = grade;
    }

    // --- Getters and Setters ---

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}