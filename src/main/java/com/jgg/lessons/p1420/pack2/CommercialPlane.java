package com.jgg.lessons.p1420.pack2;

  import com.jgg.lessons.p1420.pack1.Plane;

  public class CommercialPlane extends Plane {

    public void printModel() {
      System.out.println(model);
    }

    public void printCapacity() {
      System.out.println(capacity);
    }

    public void printMaxSpeed() {
      //System.out.println(maxSpeed);
      // (default) maxSpeed is not accessible
      // outside the package
    }

  }
