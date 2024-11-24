package com.jgg.lessons.p1210;

  public class Constructors1 {

    public static void main(String[] args){

      Plane plane =
          new     // new keyword invokes constructor
              Plane(); // () points to the parameterless constructor

      System.out.println(plane.make); // null => default String value
    }

  }

  class Plane{
    public String make;

    // There is a default construct of each class even we do not see it.
    // The compiler automatically inserts a default parameterless constructor

  }
