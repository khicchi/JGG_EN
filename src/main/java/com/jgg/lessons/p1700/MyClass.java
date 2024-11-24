package com.jgg.lessons.p1700;

  public class MyClass {

    public static void main(String[] args){
      System.out.println(new Blue()); // Blue@a09ee92
      System.out.println(new Red()); // Red Class
    }

  }

  class Blue {

  }

  class Red {

    @Override
    public String toString() {
      return "Red Class";
    }
  }