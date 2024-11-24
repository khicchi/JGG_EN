package com.jgg.homework.p1220;

public class ConstructorExamples2Solution {

  public static void main(String[] args){

    // TASK-1: Create a class Circle that has overloaded constructors.
    //         Parameterless constructor should initialize the circle with a default radius of 1.0,
    //         and the other should accept a radius as a parameter
    //         and initialize the radius with he provided radius parameter.
    //         Create a method to calculate the area of the circle
    //         and return as primitive double : <calculateArea>
    //         Hint: circle area is calculated like: PI * radius * radius


    // TASK-2: Create 1 Circle object via parameterless constructor.
    Circle circle1 = new Circle();

    // TASK-3: Create 3 Circle objects via those radius values;
    // radius
    // 2
    // 6
    // 4
    Circle circle2 = new Circle(2);
    Circle circle3 = new Circle(6);
    Circle circle4 = new Circle(4);

    // TASK-4: Call <calculateArea> method and print the value returned for all 4 objects
    System.out.println("Area of Circle 1 (radius 1.0): " + circle1.calculateArea()); // Output: 3.141592653589793
    System.out.println("Area of Circle 2 (radius 2.0): " + circle2.calculateArea()); // Output: 12.566370614359172
    System.out.println("Area of Circle 3 (radius 6.0): " + circle3.calculateArea()); // Output: 113.09733552923255
    System.out.println("Area of Circle 4 (radius 4.0): " + circle4.calculateArea()); // Output: 50.26548245743669

  }

}

class Circle {
  private double radius;

  // Default constructor
  public Circle() {
    this.radius = 1.0;
  }

  // Parameterized constructor
  public Circle(double radius) {
    this.radius = radius;
  }

  // Method to calculate area
  public double calculateArea() {
    return Math.PI * radius * radius;
  }
}