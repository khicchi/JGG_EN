package com.jgg.lessons.p1390;

public class RunnerClass {

  public static void main(String[] args){

    Student student = new Student();
    student.setFirstName("Student");
    student.setLastName("Jane");

    Teacher teacher = new Teacher();
    teacher.setFirstName("Teacher");
    teacher.setLastName("John");

    Employee employee = new Employee();
    employee.setFirstName("Employee");
    employee.setLastName("Joe");

    System.out.println(student.getFullName());
    // Student Jane
    System.out.println(teacher.getFullName());
    // Teacher John
    System.out.println(employee.getFullName());
    // Employee Joe


  }
}
