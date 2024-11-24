package com.jgg.homework.p0060;

public class EscapeSequencesSolution {

  public static void main(String[] args){

    // TASK-1: Print <This is a backslash: \>
    System.out.println("This is a backslash: \\");

    System.out.println("************************** TASK 1 FINISHED **************************");

    // TASK-2: Print <New> and <Jersey> each on different lines by using a single println function
    System.out.println("New\nJersey");

    System.out.println("************************** TASK 2 FINISHED **************************");

    // TASK-3: Print <Name: Alice> and <Age: 30> on different lines
    //         but the values <Alice> and <30> should be aligned by their beginning.
    //         Use the escape sequence for tab
    System.out.println("Name:\tAlice\nAge:\t30");

    System.out.println("************************** TASK 3 FINISHED **************************");

    // TASK-4: Print <C:\Users\Alice\Documents>
    System.out.println("C:\\Users\\Alice\\Documents");

    System.out.println("************************** TASK 4 FINISHED **************************");

    // TASK-5: Print <He said, "Hello, world!">
    System.out.println("He said, \"Hello, world!\"");

    System.out.println("************************** TASK 5 FINISHED **************************");

    // TASK-6: Print <© 2022>. For the © character, use this Unicode: \u00A9
    System.out.println("\u00A9 2022");

    System.out.println("************************** TASK 6 FINISHED **************************");

    // TASK-7: Print the following with only one single println function
    // *
    // **
    // ***
    System.out.println("*\n**\n***");

    System.out.println("************************** TASK 7 FINISHED **************************");

  }

}
