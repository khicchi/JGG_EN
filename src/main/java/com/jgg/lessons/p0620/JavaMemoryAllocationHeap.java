package com.jgg.lessons.p0620;

  public class JavaMemoryAllocationHeap {

    public static void main(String[] args){

      Car car // car is a reference
              // variable kept in the Stack
              // it holds the address of the
              // created object in heap (see below)
          = new Car();
      // new keyword allocates a memory
      // in the heap to hold the values
      // associated with <car> variable
      // which is an object
    }

  }

  class Car {

    public String make;
    public int model;

  }


