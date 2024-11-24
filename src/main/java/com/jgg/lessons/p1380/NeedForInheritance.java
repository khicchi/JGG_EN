package com.jgg.lessons.p1380;

import java.util.ArrayList;

public class NeedForInheritance { }

  class Student {

    private String firstName;
    private String lastName;
    private int birthYear;
    private String studentId;
    private ArrayList<String> lessons;

    public String getFullName() {
      return firstName + " " + lastName;
    }
  }

  class Teacher {

    private String firstName;
    private String lastName;
    private int birthYear;
    private String teacherId;
    private String profession;

    public String getFullName() {
      return firstName + " " + lastName;
    }
  }

  class Employee {
    private String firstName;
    private String lastName;
    private int birthYear;
    private String employeeId;
    private String department;

    public String getFullName() {
      return firstName + " " + lastName;
    }
  }