package com.jgg.homework.p1220;

import java.util.ArrayList;

public class ConstructorExamples6Solution {

  public static void main(String[] args){

    // TASK-1: Create <Grade> class with int <score> and char <letter> instance variables

    // TASK-2: Create 101 <Grade> objects (from score=0 to score=100) 
    //         and add all of them in an ArrayList of Grade;
    //         for scores between [0-49], letter should be F
    //         for scores between [50-59], letter should be E
    //         for scores between [60-69], letter should be D
    //         for scores between [70-79], letter should be C
    //         for scores between [80-89], letter should be B
    //         for scores between [90-100], letter should be A
    // Hint: use for loop to create <Grade> objects
    // Hint: use a constructor to create <Grade> object
    ArrayList<Grade> grades = new ArrayList<>();

    for(int i = 0; i < 100; i++) {
      char letter;
      if (i >= 90) {
        letter = 'A';
      } else if (i >= 80) {
        letter = 'B';
      } else if (i >= 70) {
        letter = 'C';
      } else if (i >= 60) {
        letter = 'D';
      } else if (i >= 50) {
        letter = 'E';
      } else {
        letter = 'F';
      }
      grades.add(new Grade(i, letter));
    }

    // TASK-3: Create a void <displayGrade> method in <Grade> class 
    //         which prints score and the letter of the grade object

    // TASK-4: Call <displayGrade> method for all 100 objects
    for (Grade grade : grades) {
      grade.displayGrade();
    }

  }

}

class Grade {
  private int score;
  private char letter;

  Grade(int score, char letter) {
    this.score = score;
    this.letter = letter;
  }

  public void displayGrade() {
    System.out.println("Score: " + score + ", Letter: " + letter);
  }
}