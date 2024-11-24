package com.jgg.lessons.p0300;

public class IfElseIfElse {

  public static void main(String[] args){
    // Define <age> as int. Print "young" if it is between [0-30],
    // print "not young" if it is [31-120],
    // print "invalid" for all other cases
    int age = -12;
    if (age >= 0 && age <= 30) {
      System.out.println("Young"); // not executed
    }
    else if (age > 30 && age <= 120) {
      System.out.println("Not young"); // not executed
    }
    else {
      System.out.println("Invalid"); // executed
    }

    // Re-write the above in a different way
    if (age < 0 || age > 120) {
      System.out.println("Invalid");
    }
    else {
      if (age <= 30) {
        System.out.println("Young");
      }
      else {
        System.out.println("Not Young");
      }
    }

  }
}
