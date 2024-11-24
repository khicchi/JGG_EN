package com.jgg.homework.p0800;

public class StartsWithEndsWithSolution {

  public static void main(String[] args){

    // TASK-1: Check if your full name starts with your first name, and ends with your last name
    System.out.println("John Doe".startsWith("John") && "John Doe".endsWith("Doe")); // true

    System.out.println("************************** TASK 1 FINISHED **************************");

    // TASK-2: Check if "!" starts with ""
    System.out.println("!".startsWith("")); // true

    System.out.println("************************** TASK 2 FINISHED **************************");

    // TASK-3: Check if "!" starts with "!"
    System.out.println("!".startsWith("!")); // true

    System.out.println("************************** TASK 3 FINISHED **************************");

    // TASK-4: Check if "!" ends with "!"
    System.out.println("!".endsWith("!")); // true

    System.out.println("************************** TASK 4 FINISHED **************************");

    // TASK-5: Check if "try" ends with "try"
    System.out.println("try".endsWith("try")); // true

    System.out.println("************************** TASK 5 FINISHED **************************");

    // TASK-6: Check if "Try" ends with "try"
    System.out.println("Try".endsWith("try")); // false

    System.out.println("************************** TASK 6 FINISHED **************************");

  }

}
