package com.jgg.lessons.p0100;

public class PrimitiveDataTypes {

  public static void main(String[] args){

    // Declare a variable which can hold only TRUE or FALSE value, assign TRUE and print, then assign FALSE and print
    boolean isChild;
    isChild = true;
    System.out.println(isChild);

    isChild = false;
    System.out.println(isChild);

    // Declare a variable which can hold only integer values between -128 to 127, assign -50, then assign 100 and print
    short data; data = -50; data = 100;
    System.out.println(data);

    // Initialize a variable with numeric 50000 * 4, then print
    int myVar = 50000 * 4;
    System.out.println(myVar);

    // Initialize a long variable and print
    long population = 2000000L;
    System.out.println(population);

    // Initialize a float variable with 23.56 and print
    float myFloat = 23.56F;
    System.out.println(myFloat);

    // Initialize a double variable with 23.57 and print
    double myDouble = 23.57;
    System.out.println(myDouble);

    // Initialize a char with 'c' and print
    char myChar = 'c';
    System.out.println(myChar);
  }
}




