package com.jgg.lessons.p0210;

public class RelationalOperatorsEqualTo {

  public static void main(String[] args){

    // Compare two same int variables
    int a = 10, b = 10;
    System.out.println(a == b); // true

    // Compare two int variables, assign the result
    boolean intEquals = a == b;
    System.out.println(intEquals); // true

    // Increase one variable by one and compare
    b++;
    System.out.println(a == b); // false

    // Increase another variable by one and compare
    System.out.println(++a == b); // true

    // Compare two different byte variables
    byte b1 = 1, b2 = 2;
    System.out.println(b1 == b2); // false

    // Compare two different boolean variables
    boolean bool1 = true, bool2 = false;
    System.out.println(bool1 == bool2); // false

    // Compare the negation of one of the booleans above
    System.out.println(bool1 == !bool2); // true
  }
}



