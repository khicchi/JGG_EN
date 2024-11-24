package com.jgg.lessons.p2080;

public class CallingMethodsInPolymorphism {

  public static void main(String[] args){
    Shape rectangle = new Rectangle();
    rectangle.draw(); // Drawing a rectangle

    Shape square = new Square();
    square.draw(); // Drawing a shape
  }

}

  class Shape {
    void draw() {
      System.out.println("Drawing a shape");
    }
  }

  class Rectangle extends Shape {
    @Override
    void draw() {
      System.out.println("Drawing a rectangle");
    }
  }

  class Square extends Shape {

  }
