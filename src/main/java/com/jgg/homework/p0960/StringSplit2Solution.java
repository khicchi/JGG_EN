package com.jgg.homework.p0960;

public class StringSplit2Solution {

  public static void main(String[] args){

    String grades = "C;A;C;A;A;A;B";

    // TASK-1: <grades> holds the grades of a student
    //         Create a char array which holds grades
    char[] gradeArray = grades.replace(";", " ").toCharArray();

    // TASK-2: Find the counts of grades and print. Like => A -> 4
    int countA = 0, countB = 0, countC = 0;

    for (char grade : gradeArray) {
      switch (grade) {
        case 'A':
          countA++;
          break;
        case 'B':
          countB++;
          break;
        case 'C':
          countC++;
          break;
      }
    }

    // Print the counts
    System.out.println("A -> " + countA);
    System.out.println("B -> " + countB);
    System.out.println("C -> " + countC);
  }

}
