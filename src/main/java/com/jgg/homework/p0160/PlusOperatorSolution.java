package com.jgg.homework.p0160;

public class PlusOperatorSolution {

  public static void main(String[] args){

    // TASK-1: Use the + operator to sum two float variables and print the result
    float float1 = 4.5f;
    float float2 = 3.2f;
    System.out.println(float1 + float2); // 7.7

    System.out.println("************************** TASK 1 FINISHED **************************");

    // TASK-2: Use the + operator to sum two byte variables and print the result
    byte byte1 = 10;
    byte byte2 = 20;
    System.out.println((byte1 + byte2)); // 30

    System.out.println("************************** TASK 2 FINISHED **************************");

    // TASK-3: Use the + operator to concatenate two String variables and print the result
    String str1 = "Hello";
    String str2 = "World";
    System.out.println(str1 + " " + str2); // Hello World

    System.out.println("************************** TASK 3 FINISHED **************************");

    // TASK-4:
    int int1 = 3, int2 = 5, int3 = 7;
    String here = "Here";
    // Use + operator and print: <here> + <int1> + <int2> + <int3>
    System.out.println(here + int1 + int2 + int3); // Here357

    System.out.println("************************** TASK 4 FINISHED **************************");

    // TASK-5: Use + operator and print:  <int1> + <int2> + <here> + <int3>
    System.out.println(int1 + int2 + here + int3); // 8Here7

    System.out.println("************************** TASK 5 FINISHED **************************");

    // TASK-6: Use + operator and print:  <here> + (<int1> + <int2> + <int3>)
    System.out.println(here + (int1 + int2 + int3)); // Here15

    System.out.println("************************** TASK 6 FINISHED **************************");

    // TASK-7: Use + operator and print:  <here> + <int1> + (<int2> + <int3>)
    System.out.println(here + int1 + (int2 + int3)); // Here312

    System.out.println("************************** TASK 7 FINISHED **************************");

    // TASK-8: Use + operator and print:  <here> + (<int1> + <int2>) + <int3>
    System.out.println(here + (int1 + int2) + int3); // Here87

    System.out.println("************************** TASK 8 FINISHED **************************");

  }

}
