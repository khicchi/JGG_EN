package com.jgg.lessons.p2680;

  public class RunnerClass {

    public static void main(String[] args) {

      // Create an instance of School
      School school = new School("Greenwood High");

      // Create an instance of the inner Student class through the outer School instance
      School.Student student = school.new Student("Alice");

      // Display student information
      student.displayInfo();

    }
  }
