package com.jgg.homework.p0720;

public class StringLastIndexOfSolution {

  public static void main(String[] args){

    // TASK-1: What is the last index of "s" in "s"
    String mainString1 = "s";
    String subString1 = "s";

    int lastIndex1 = mainString1.lastIndexOf(subString1);
    System.out.println(lastIndex1); // 0

    System.out.println("************************** TASK 1 FINISHED **************************");

    // TASK-2: What is the last index of "s" in "0"
    System.out.println("0".lastIndexOf("s")); // -1

    System.out.println("************************** TASK 2 FINISHED **************************");

    // TASK-3: What is the last index of "" in ""
    System.out.println("".lastIndexOf("")); // 0

    System.out.println("************************** TASK 3 FINISHED **************************");

    // TASK-4: What is the last index of "" in "s"
    System.out.println("s".lastIndexOf("")); // 1

    System.out.println("************************** TASK 4 FINISHED **************************");

    // TASK-5: What is the last index of " " in "as blue as sky"
    System.out.println("as blue as sky".lastIndexOf(" ")); // 10

    System.out.println("************************** TASK 5 FINISHED **************************");

    // TASK-6: What is the last index of "as" in "as blue as sky"
    System.out.println("as blue as sky".lastIndexOf("as")); // 8

    System.out.println("************************** TASK 6 FINISHED **************************");
  }

}
