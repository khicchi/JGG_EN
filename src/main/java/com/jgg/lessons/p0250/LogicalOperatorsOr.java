package com.jgg.lessons.p0250;

public class LogicalOperatorsOr {

  public static void main(String[] args){

    // Compare true and false by || (OR) operator
    System.out.println(true || false); // true

    // Compare false and false by || (OR) operator
    System.out.println(false || false); // false

    // Compare true and true by || (OR) operator
    System.out.println(true || true); // true

    // Compare (3 == 3) with (3.4 == 3.4) by || (OR) operator
    boolean compare6 = 3 == 3; // true
    boolean compare7 = 3.4 == 3.4; // true
    System.out.println(compare6 || compare7); // true

    // Compare (3 == 3) with (3.4 != 3.4) by || (OR) operator
    boolean compare8 = 3 == 3; // true
    boolean compare9 = 3.4 != 3.4; // false
    System.out.println(compare8 || compare9); // true

    // Compare <(3 * 2) == (12 / 3)> and <'F' == (char) 70> by || (OR) operator
    boolean compare1 = (3 * 2) == (12 / 3); // false
    boolean compare2 = 'F' == (char) 70; // true
    System.out.println(compare1 || compare2); // true

  }

}
