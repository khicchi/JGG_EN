package com.jgg.homework.p0400;

public class ForLoopSolution {

  public static void main(String[] args){

    // TASK-1: Print your name 9 times
    for (int i = 0; i < 9; i++) {
      System.out.println("John Doe");
    }

    System.out.println("************************** TASK 1 FINISHED **************************");

    // TASK-2: Print your name 9 times in this format:
    // <Your Name> - <count>
    // Example: John Doe - 1
    // Note: count should start from 1
    for (int i = 1; i <= 9; i++) {
      System.out.println("John Doe - " + i);
    }

    System.out.println("************************** TASK 2 FINISHED **************************");

    // TASK-3: Create 5x5 square with x character using for loop
    for(int i = 0; i < 5; i++) {
      System.out.println("*****");
    }

    System.out.println("************************** TASK 3 FINISHED **************************");

    // TASK-4: Print this pattern in a for loop
    // 100
    // 90
    // 80
    // 70
    // 60
    // 50
    for (int i = 10; i >= 1; i--) {
      System.out.println(i * 10);
    }

    System.out.println("************************** TASK 4 FINISHED **************************");

    // TASK-5: Print this pattern in a for loop
    // 3 6 9 12 15 18 21 24 27 30 33
    // way 1
    for (int i = 1; i <= 11; i++) {
      System.out.print(i * 3 + " ");
    }
    System.out.println();
    // way2
    for (int i = 3; i <= 33; i = i + 3) {
      System.out.print(i + " ");
    }
    System.out.println();

    System.out.println("************************** TASK 5 FINISHED **************************");

    // TASK-6: Print this pattern in a for loop
    // 3 5 9 17 33 65
    // way 1
    int num = 3;
    System.out.print(num + " ");
    for (int i = 1; i <= 5; i++) {
      num = num * 2 - 1;
      System.out.print(num + " ");
    }
    System.out.println();

    // way 2
    for(int i = 3; i <= 65; i = i * 2 - 1) {
      System.out.print(i + " ");
    }
    System.out.println();

    System.out.println("************************** TASK 6 FINISHED **************************");

    // TASK-7: Print this pattern in a for loop
    // 99 49 24 12 6 3 1
    // way 1
    int n = 99;
    while (n >= 1) {
      System.out.print(n + " ");
      n = n / 2;
    }
    System.out.println();

    // way 2
    for(int i = 99; i >= 1; i/=2) {
      System.out.print(i + " ");
    }
    System.out.println();

    System.out.println("************************** TASK 7 FINISHED **************************");

  }

}
