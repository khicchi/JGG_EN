package com.jgg.lessons.p0380;

public class TernaryOperator {

  public static void main(String[] args){
    // Define <isAdult> as boolean, and <age> as int
    // assign TRUE to <isAdult> if age is >= 18, otherwise assign FALSE
    int age = 18;
    boolean isAdult = age >= 18 ? true : false;

    // Do the same with if-else block
    if ( age >= 18 ) {
      isAdult = true;
    }
    else {
      isAdult = false;
    }

    // Define <num> as int
    // Print GREATER if <num> is greater than 5, else print "NOT GREATER"
    int num = 21;
    System.out.println( num > 5 ? "GREATER" : "NOT GREATER" );

    // Define <x>, <y>, <z> as int.
    // Print the max value by checking Ternary Operator
    int x = 10, y = 20, z = 15;

    int max = (x > y) ? ((x > z) ? x : z) : ((y > z) ? y : z);

    System.out.println(max);
  }

}
