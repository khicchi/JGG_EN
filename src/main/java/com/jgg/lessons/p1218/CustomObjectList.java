package com.jgg.lessons.p1218;

import java.util.ArrayList;

  public class CustomObjectList {

    public static void main(String[] args) {
      ArrayList<Car> cars = new ArrayList<>(); // Create an ArrayList of Car objects

      // Adding elements to the ArrayList
      cars.add(new Car("Red", 120));
      cars.add(new Car("Blue", 150));
      cars.add(new Car("Green", 100));

      // Accessing elements
      Car firstCar = cars.get(0);
      System.out.println(firstCar.color); // Red

      // Modifying elements
      cars.set(1, new Car("Black", 140));

      // Removing elements
      cars.remove(2);

      // Iterating over elements
      for (Car car : cars) {
        System.out.println(car.color + ", " + car.speed);
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