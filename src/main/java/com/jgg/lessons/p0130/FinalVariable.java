package com.jgg.lessons.p0130;

public class FinalVariable {

  public static void main(String[] args){

    // Declare PI variable with 3.14159 value as final
    final double PI = 3.14159;
    System.out.println("PI value: " + PI);

    // Declare a numeric variable with a value of 100 as constant
    final short MAX_SIZE = 100;
    System.out.println("Max Size => " + MAX_SIZE);

    // Try to reassign a final variable
    final String name = "John";
    //name = "Jane";
  }

}


