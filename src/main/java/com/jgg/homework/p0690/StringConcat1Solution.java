package com.jgg.homework.p0690;

public class StringConcat1Solution {

  public static void main(String[] args){

    // TASK-1: Concat "Big " and "World" using concat method and print

    String str1 = "Big ";
    String str2 = "World";
    String result1 = str1.concat(str2);
    System.out.println(result1); // Output: Big World

    System.out.println("************************** TASK 1 FINISHED **************************");

    // TASK-2: Concat "World ", "is ", " bigger", " than", " ever."
    //         using concat method by chaining each concat method.

    String part1 = "World ";
    String part2 = "is ";
    String part3 = " bigger";
    String part4 = " than";
    String part5 = " ever.";

    String result2 = part1.concat(part2)
        .concat(part3)
        .concat(part4)
        .concat(part5);
    System.out.println(result2); // Output: World is  bigger than ever.

    System.out.println("************************** TASK 2 FINISHED **************************");

  }

}
