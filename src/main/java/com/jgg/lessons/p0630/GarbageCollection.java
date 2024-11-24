package com.jgg.lessons.p0630;

  public class GarbageCollection {

    public static void main(String[] args){
      // Ex 1
      Vehicle vehicle1 = new Vehicle();
      // Memory allocated for <vehicle1> obj
      // <vehicle1> points the obj address
      // which is in the HEAP

      vehicle1 = null;
      // <vehicle1> reference variable does not
      // point to the created object anymore.
      // Allocated area for <vehicle1> obj in the HEAP
      // is ready for Garbage Collection now

      // Ex 2
      Vehicle vehicle2 = new Vehicle();
      Vehicle vehicle3 = new Vehicle();
      vehicle2 = vehicle3;
      // Now, the object referred by <vehicle2>
      // is not referred anymore (unreferenced).
      // It is ready for GC
    }

  }

  class Vehicle {

  }



