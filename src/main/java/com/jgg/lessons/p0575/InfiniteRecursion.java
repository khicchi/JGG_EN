package com.jgg.lessons.p0575;

public class InfiniteRecursion {

  public static void main(String[] args) {

    recursiveMethod();

  }

  public static void recursiveMethod() {
    System.out.println("Recursive Method");
    recursiveMethod();
  }

}
