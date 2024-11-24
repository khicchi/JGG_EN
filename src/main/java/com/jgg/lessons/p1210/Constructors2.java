package com.jgg.lessons.p1210;

  public class Constructors2 {

    public static void main(String[] args){

      Car car1 = new Car("Honda");
      System.out.println("car1.make = " + car1.make);

      Car car2 = new Car("Toyota");
      System.out.println("car2.make = " + car2.make);
    }

  }

  class Car {
    public String make;

    Car(String make) {

      this.make = make;
      // this refers the object being created (instance field)
      // the assigned make is the parameter of the constructor
    }

  }

