package com.jgg.lessons.p0700;

public class StringContains {

  public static void main(String[] args){

    // Check if "age" is included in "Stages"
    String container = "Stages";
    String check = "age";
    boolean contains = container.contains(check);
    System.out.println("'Stages' contains 'age' = " + contains);
    // 'Stages' contains 'age' = true

    // Check if "Age" is included in "Stages"
    check = "Age";
    contains = container.contains(check);
    System.out.println("'Stages' contains 'Age' = " + contains);
    // 'Stages' contains 'Age' = false

    // Check "Cats and dogs" contains " "
    System.out.println("Cats and dogs".contains(" ")); // true

    // Check if "Cats and dogs" contains " and"
    System.out.println("Cats and dogs".contains(" and")); // true

  }

}
