package com.jgg.homework.p1220;

public class ConstructorExamples3Solution {

  public static void main(String[] args){

    // TASK-1: Create a class Student that has two constructors.
    //         The parameterless constructor should set 'Unknown' for name, and 0 for age.
    //         The parameterized constructor should accept the name and age as parameters.
    //         Use constructor chaining to avoid code duplication
    //         (parameterless constructor should call parameterized constructor with default values).
    //         Create a void <displayInfo> method which prints the name and the age of the student.

    // TASK-2: Create a Student object via parameterless constructor
    Student student1 = new Student();

    // TASK-3: Create 2 Student objects via parameterized constructor with those values
    // Name   Age
    // John   17
    // Eva    16
    Student student2 = new Student("John", 17);
    Student student3 = new Student("Eva", 16);

    // TASK-4: Call <displayInfo> method for all three Student objects
    student1.displayInfo(); // Output: Name: Unknown, Age: 0
    student2.displayInfo(); // Output: Name: John, Age: 17
    student3.displayInfo(); // Output: Name: Eva, Age: 16

  }

}

class Student {
  private String name;
  private int age;

  // Default constructor
  public Student() {
    this("Unknown", 0); // Constructor chaining
  }

  // Parameterized constructor
  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // Method to display student information
  public void displayInfo() {
    System.out.println(String.format("Name: %s, Age: %s", name, age));
  }
}