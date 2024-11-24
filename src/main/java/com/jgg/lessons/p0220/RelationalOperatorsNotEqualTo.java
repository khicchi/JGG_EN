package com.jgg.lessons.p0220;

public class RelationalOperatorsNotEqualTo {

  public static void main(String[] args){

    // Compare two different long variables if they are not equal
    long l1 = 89L, l2 = 34L;
    System.out.println(l1 != l2); // true

    // Compare two same long variables if they are not equal
    long l3 = 1L, l4 = 1L;
    System.out.println(l3 != l4); // false

    // Assign the comparison above to a variable
    boolean areLongsNotEqual = l3 != l4;
    System.out.println(areLongsNotEqual); // false

    // Compare two same char values as they are not equal
    boolean areCharsNotEqual = 'F' != 'F';
    System.out.println(areCharsNotEqual); // false

    // Get the decimal value of 'F'
    System.out.println((int) 'F');

    // Compare 'F' and 70 as they are not equal
    System.out.println('F' != (char) 70); // false
    System.out.println((int) 'F' != 70); // same with above
  }
}
