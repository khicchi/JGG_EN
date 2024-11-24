package com.jgg.lessons.p0180;

public class MixedIntegerOperations {

  public static void main(String[] args){

    // Perform a multiplication between int and double variables
    int intValue = 5; double doubleValue = 2.5;

    // Implicit type promotion: int is promoted to double
    double result = intValue * doubleValue;
    System.out.println("Result: " + result); // Output: Result: 12.5

    // Perform an addition over two short variables
    short short1 = 10;
    short short2 = 20;
    //short shortResult = short1 + short2;
    short shortResult = (short) (short1 + short2);

    double myDub = 3.3; long myLong = 3;
    double resultForDouble = myDub * myLong;
    System.out.println(resultForDouble);// Output = 9.899999999999999
    // Floating-point numbers, such as double,
    // cannot always represent decimal numbers
    // precisely due to their binary representation

    float myFloat = 3.3F; long myLong2 = 3;
    float resultForFloat = myFloat * myLong2;
    System.out.println(resultForFloat); // 9.9

    // Perform a multiplication between int and double variables
    // assign the result to an int variable
    int dataInt = 5; double dataDouble = 2.5;
    int dataResult = (int) (dataInt * dataDouble);
    System.out.println(dataResult); // Output: Result: 12
  }

}
