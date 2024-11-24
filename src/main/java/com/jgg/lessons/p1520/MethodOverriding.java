package com.jgg.lessons.p1520;

  public class MethodOverriding {

    public static void main(String[] args){
      Car car = new Car();
      car.accelerate(10);
      // Car accelerates at : 10
    }

  }


  class Vehicle {
    public void accelerate(long mph) {
      System.out.println("Vehicle accelerates at : " + mph);
    }
  }

  class Car extends Vehicle {
    @Override
    public void accelerate(long mph) {
      System.out.println("Car accelerates at : " + mph);
    }
  }
