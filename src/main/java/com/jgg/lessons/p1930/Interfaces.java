package com.jgg.lessons.p1930;

  public class Interfaces {
    public static void main(String[] args){
      // Flyable flyable = new Flyable();
      // not doable
    }
  }

  class Plane extends Transportation implements Flyable, Movable {
    @Override
    public void fly() { System.out.println("Plane flies"); }

    @Override
    public void move() { System.out.println("Plane moves"); }
  }

  class Transportation { }

  interface Flyable {
    void fly(); // public abstract void fly();
  }

  interface Movable {
    // This is a constant, public static final by default
    int PACE = 10;
    // this is a public abstract method
    void move();
  }
