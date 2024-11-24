package com.jgg.homework.p0170;

public class TypeCastingForPrimitiveTypesSolution {

  public static void main(String[] args){

    // TASK-1: Implicitly cast an int variable to long
    int intVar1 = 100;
    long longVar1 = intVar1; // implicit cast

    System.out.println("************************** TASK 1 FINISHED **************************");

    // TASK-2: Implicitly cast a byte variable to long
    byte byteVar1 = 10;
    long longVar2 = byteVar1; // implicit cast

    System.out.println("************************** TASK 2 FINISHED **************************");

    // TASK-3: Implicitly cast a byte variable to int
    byte byteVar2 = 20;
    int intVar2 = byteVar2; // implicit cast

    System.out.println("************************** TASK 3 FINISHED **************************");

    // TASK-4: Explicitly cast a short variable to long
    //         even though it is not required
    short shortVar1 = 30;
    long longVar3 = (long) shortVar1; // explicit cast

    System.out.println("************************** TASK 4 FINISHED **************************");

    // TASK-5: Initialize <myDouble> as 23.45 and print
    //         Cast <myDouble> to an int variable <myInt> and print <myInt>
    double myDouble = 23.45;
    System.out.println(myDouble); // 23.45

    int myInt = (int) myDouble; // explicit cast
    System.out.println(myInt); // 23

    System.out.println("************************** TASK 5 FINISHED **************************");

    // TASK-6: Initialize <myLong> as 123456789 and print
    //         Cast <myLong> to a short variable <myShort> and print <myShort>
    long myLong = 123456789L;
    System.out.println(myLong); // 123456789

    short myShort = (short) myLong; // explicit cast
    System.out.println(myShort); // truncated value

    System.out.println("************************** TASK 6 FINISHED **************************");

    // TASK-7: Try to assign a double variable to a short variable without casting
    // short shortVar2 = 45.67; // compilation error

    System.out.println("************************** TASK 7 FINISHED **************************");

    // TASK-8: Try to assign <3.3> to an int variable without casting
    // int intVar3 = 3.3; // compilation error

    System.out.println("************************** TASK 8 FINISHED **************************");

    // TASK-9: Try to assign <3.3> to a short variable without casting
    // short shortVar3 = 3.3; // compilation error

    System.out.println("************************** TASK 9 FINISHED **************************");

    // TASK-10: Try to assign the result of "0.3 * 3" to an int variable
    //          with and without casting
    double result = 0.3 * 3;
    int intVar4WithoutCasting = (int) result; // explicit cast
    // int intVar4WithoutCasting = result; // compilation error
    System.out.println(intVar4WithoutCasting); // truncated value

    System.out.println("************************** TASK 10 FINISHED **************************");

  }

}
