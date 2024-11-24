package com.jgg.lessons.p1910;

  public class AbstractClassPracticeExample {
    public static void main(String[] args){
      Circle circle = new Circle(5);
      System.out.println("Area of Circle: " + circle.calculateArea()); // 78.5

      Rectangle rectangle = new Rectangle(4, 6);
      System.out.println("Area of Rectangle: " + rectangle.calculateArea()); //24.0

      Triangle triangle = new Triangle(3, 4);
      System.out.println("Area of Triangle: " + triangle.calculateArea());//6.0
    }
  }

  abstract class Shape {
    abstract double calculateArea();
  }

  class Circle extends Shape {
    double radius;

    Circle(double radius) {
      this.radius = radius;
    }

    @Override
    double calculateArea() {
      return Math.PI * radius * radius;
    }
  }

  class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
      this.length = length;
      this.width = width;
    }

    @Override
    double calculateArea() {
      return length * width;
    }
  }

  class Triangle extends Shape {
    double base;
    double height;

    Triangle(double base, double height) {
      this.base = base;
      this.height = height;
    }

    @Override
    double calculateArea() {
      return 0.5 * base * height;
    }
  }
