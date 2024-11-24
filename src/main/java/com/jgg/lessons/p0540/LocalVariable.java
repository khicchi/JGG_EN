package com.jgg.lessons.p0540;

public class LocalVariable {

  public static void main(String[] args){
    // LOCAL 1
    int a = 5; // this <a> is local to main method
    increase(a);
    System.out.println(a); // prints 5

    // LOCAL 2
    for(int i = 0; i < 3; i++) {
      System.out.println(i);
      // <i> is local to for loop
      // not accessible outside the loop
    }
    //System.out.println(i); // not doable
  }

  public static void increase(int a) {
    // parameter <a> is local to increase() method
    a++;
  }

}
