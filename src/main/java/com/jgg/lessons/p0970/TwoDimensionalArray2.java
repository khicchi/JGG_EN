package com.jgg.lessons.p0970;

public class TwoDimensionalArray2 {

  public static void main(String[] args){
    int[][] scores = { {50, 60, 75}, {40, 40, 45}, {50, 55, 65} };

    // scores array keeps the scores of lesson1, lesson2 and lesson3
    // lesson1 scores are the first array in the scores
    // lesson2 scores are the second array in the scores
    // lesson3 scores are the third array in the scores
    // calculate the average of each lesson score
    // and print PASSED if average is greater than 59, otherwise FAILED
    double lesson1Avg = 0, lesson2Avg = 0, lesson3Avg = 0;
    for(int i = 0; i < scores.length; i++) {
      for(int j = 0; j < scores[i].length; j++) {
        if (i == 0) {
          lesson1Avg += scores[i][j];
        }
        else if (i == 1) {
          lesson2Avg += scores[i][j];
        }
        else {
          lesson3Avg += scores[i][j];
        }
      }
    }
    lesson1Avg /= 3;
    lesson2Avg /= 3;
    lesson3Avg /= 3;

    System.out.println(String.format("Lesson 1: %s", passedFailed(lesson1Avg)));
    System.out.println(String.format("Lesson 2: %s", passedFailed(lesson2Avg)));
    System.out.println(String.format("Lesson 3: %s", passedFailed(lesson3Avg)));
  }

  public static String passedFailed(double average) {
    return average > 59 ? "PASSED" : "FAILED";
  }

}
