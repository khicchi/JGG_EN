package com.jgg.homework.p0810;

public class StringFormatSolution {

  public static void main(String[] args){

    // TASK-1: Format "<easy> come, <easy> go" by updating <easy> with "easy"
    String word = "easy";
    System.out.println(String.format("%s come, %s go", word, word)); // easy come, easy go

    System.out.println("************************** TASK 1 FINISHED **************************");

    // TASK-2: Format "Dear <firstName> <lastName>, welcome to Paris."
    //         with your first and last name
    String firstName = "John";
    String lastName = "Doe";
    System.out.println(String.format("Dear %s %s, welcome to Paris.", firstName, lastName)); // Dear John Doe, welcome to Paris.

    System.out.println("************************** TASK 2 FINISHED **************************");

    // TASK-3: Format "<digit0><digit0><digit7>" with "0", "0", and "7"
    char digit0 = '0';
    char digit7 = '7';
    System.out.println(String.format("%s%s%s", digit0, digit0, digit7)); // 007

    System.out.println("************************** TASK 3 FINISHED **************************");

  }

}
