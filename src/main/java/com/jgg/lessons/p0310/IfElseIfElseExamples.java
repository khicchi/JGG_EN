package com.jgg.lessons.p0310;

public class IfElseIfElseExamples {

  public static void main(String[] args){
    // Define <score> as int,
    // if score is smaller than 60 and greater than -1, print "Fail",
    // if score is smaller than 90 and greater than 59, print "Pass",
    // if score is smaller than 101 and greater than 89, print "Well Done!",
    // otherwise print "score is not valid"
    int score = 101;
    if (score > -1 && score < 60) {System.out.println("Fail");}
    else if (score > 59 && score < 90) {System.out.println("Pass");}
    else if(score >= 90 && score <= 100) {System.out.println("Well Done!");}
    else {System.out.println("score is not valid");}

    // Rewrite the same in a proper way
    if (score < 0 || score > 100) {
      System.out.println("score is not valid");
    }
    else {
      if (score >= 90) {
        System.out.println("Well Done!");
      }
      else if (score >= 60) {
        System.out.println("Pass");
      }
      else {
        System.out.println("Fail");
      }
    }
  }

}
