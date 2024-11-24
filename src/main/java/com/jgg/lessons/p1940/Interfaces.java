package com.jgg.lessons.p1940;

  interface Movable extends Accelerate {

    default void calculatePace() {

    }

    static void calculateTime() {

    }

    // int insField; // not doable
  }

  interface Accelerate { }