package com.jgg.lessons.p2680;

import lombok.AllArgsConstructor;

  @AllArgsConstructor
  public class School {

    private String schoolName;

    // Inner Class (Student)
    @AllArgsConstructor
    public class Student {
      private String studentName;

      public void displayInfo() {
        System.out.println("Student Name: " + studentName);
        System.out.println("School Name: " + schoolName);
      }
    }

  }
