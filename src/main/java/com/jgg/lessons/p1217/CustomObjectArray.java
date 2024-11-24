package com.jgg.lessons.p1217;

  public class CustomObjectArray {

    public static void main(String[] args) {
      Car[] cars = new Car[3]; // Create an array of 3 Car objects

      // Initialize each element with a Car object
      cars[0] = new Car("Red", 120);
      cars[1] = new Car("Blue", 150);
      cars[2] = new Car("Green", 100);

      printSpeed(cars);
    }

    public static void printSpeed(Car[] cars) {
      for (Car car: cars) {
        System.out.println("car.speed = " + car.speed);
      }
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