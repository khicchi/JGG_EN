package com.jgg.homework.p1220;

public class ConstructorExamples7Solution {

  public static void main(String[] args){

    // TASK-1: Create <Car> class with those instance variables: make as String, maxSpeed as int.
    //         Create a <Car> constructor which accepts <make> and <maxSpeed> parameters and initializes corresponding variables.
    //         Create a <getInfo> method which returns the instance variable values in a good format as String.

    // TASK-2: Create <Driver> class with those instance variables: name as String, car as Car.
    //         Create a <Driver> constructor which accepts <name> and <car> parameters and initializes corresponding variables.
    //         Create a <getInfo> method which returns the instance variable values in a good format as String.

    // TASK-3: Create three Driver objects: <driver1>, <driver2>, <driver3>
    //         Use those values;
    //         <driver1> => name: John, car: { make: Honda, maxSpeed: 280 }
    //         <driver2> => name: Jane, car: { make: Toyota, maxSpeed: 270 }
    //         <driver3> => name: Fred, car: { make: Toyota, maxSpeed: 310 }
    Car car1 = new Car("Honda", 280);
    Car car2 = new Car("Toyota", 270);
    Car car3 = new Car("Toyota", 310);
    Driver driver1 = new Driver("John", car1);
    Driver driver2 = new Driver("Jane", car2);
    Driver driver3 = new Driver("Fred", car3);

    // TASK-4: Call <getInfo> method for all driver objects and print
    System.out.println(driver1.getInfo());
    System.out.println(driver2.getInfo());
    System.out.println(driver3.getInfo());
  }

}

class Car {
  private String make;
  private int maxSpeed;

  // TASK-1: Constructor to initialize make and maxSpeed
  public Car(String make, int maxSpeed) {
    this.make = make;
    this.maxSpeed = maxSpeed;
  }

  // TASK-1: Method to return instance variable values in a formatted string
  public String getInfo() {
    return "Make: " + make + ", Max Speed: " + maxSpeed;
  }
}

class Driver {
  private String name;
  private Car car;

  // TASK-2: Constructor to initialize name and car
  public Driver(String name, Car car) {
    this.name = name;
    this.car = car;
  }

  // TASK-2: Method to return instance variable values in a formatted string
  public String getInfo() {
    return "Name: " + name + ", Car: {" + car.getInfo() + "}";
  }
}