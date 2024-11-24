package com.jgg.homework.p1220;

public class ConstructorExamples1Solution {

  public static void main(String[] args){

    // TASK-1: Create a class Rectangle that has a constructor to initialize its length and width.
    //         Add a method to calculate the area of the rectangle: <calculateArea>

    // TASK-2: Create 4 different Rectangle objects using the parameterized constructor.
    //         Use those inputs as parameters;
    // length   width
    //   5        4
    //   12       2
    //   3        10
    //   15       1
    Rectangle rect1 = new Rectangle(5, 4);
    Rectangle rect2 = new Rectangle(12, 2);
    Rectangle rect3 = new Rectangle(3, 10);
    Rectangle rect4 = new Rectangle(15, 1);

    // TASK-3: Call <calculateArea> method and print the value returned for all 4 objects
    System.out.println("Area of Rectangle 1: " + rect1.calculateArea()); // Output: 20.0
    System.out.println("Area of Rectangle 2: " + rect2.calculateArea()); // Output: 24.0
    System.out.println("Area of Rectangle 3: " + rect3.calculateArea()); // Output: 30.0
    System.out.println("Area of Rectangle 4: " + rect4.calculateArea()); // Output: 15.0
  }

}

class Rectangle {
  private double length;
  private double width;

  // Constructor
  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  // Method to calculate area
  public double calculateArea() {
    return length * width;
  }
}