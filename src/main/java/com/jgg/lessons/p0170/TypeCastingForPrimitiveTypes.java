package com.jgg.lessons.p0170;

public class TypeCastingForPrimitiveTypes {

  public static void main(String[] args){

    // Implicitly cast a short variable to int
    short myShort = 1000;
    int myInt = myShort;

    // Explicitly cast a short variable to int even it is not required
    short myShort2 = 1000;
    int myInt2 = (int) myShort2; // explicit casting

    // Cast a double variable to int variable
    double doubleValue = 10.5;
    int intFromDouble = (int) doubleValue;
    System.out.println("doubleValue = " + doubleValue);
    System.out.println("intFromDouble = " + intFromDouble);

    // Try to assign a double variable to int variable without casting
    double myDouble = 10.10;
    //int myInt3 = myDouble; // not doable

    // Try to assign "3 * 3.3" result to an int variable without casting
    //int result = 3 * 3.3; // not doable

    // Try to assign "3 * 3.3" result to an int variable with casting
    int myResult = (int) (3 * 3.3);
    System.out.println("myResult = " + myResult);

  }

}
