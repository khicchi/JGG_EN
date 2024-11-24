package com.jgg.lessons.p1215;

  public class PassingObjectsAsArgument {

    public static void main(String[] args) {
      Car myCar = new Car("Red", 120);
      changeColor(myCar);
      System.out.println(myCar.color); // Blue
    }

    public static void changeColor(Car car) {
      car.color = "Blue";
    }

  }

  class Car {
    String color;
    int speed;

    public Car(String color, int speed) {
      this.color = color;
      this.speed = speed;
    }
  }
