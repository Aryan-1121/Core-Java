package com.exceptions;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student();
        int data = student.mayThrowError();
        System.out.println(data);
    }
}
