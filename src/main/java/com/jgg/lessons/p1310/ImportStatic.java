  package com.jgg.lessons.p1310;

  // import sqrt() method of Math class
  import static java.lang.Math.sqrt;

  // imports all static methods of Arrays class
  import static java.util.Arrays.*;

  public class ImportStatic {

    public static void main(String[] args){
      // normal usage of a static method
      Math.max(2,3);

      // direct call to static method
      // see => import static java.lang.Math.sqrt;
      sqrt(20);

      // direct call to static method
      // see => import static java.util.Arrays.*;
      sort(new int[]{ 2, 1});
    }
  }

