package com.jgg.lessons.p0320;

public class NestedIfStatement {

  public static void main(String[] args){
    // Define <a>, <b>, <c> as int and print the biggest value
    int a = -2, b = 4, c = -10;

    if ( a > b && a > c ) {
      System.out.println(a + " is the biggest");
    }
    else {
      if ( b > c) {
        System.out.println(b + " is the biggest");
      }
      else {
        System.out.println(c + " is the biggest");
      }
    }

    // Assume that the coffee machine with 1, 2, 3 options
    // for the option 1 it adds sugar and milk
    // for the option 2 it adds sugar and extra coffee
    // for the option 3 it does not add anything
    // print what it adds based on the selected option
    int option = 1;
    if ( option == 1 || option == 2 ) {
      System.out.println("Adding sugar");
      if (option == 1) {
        System.out.println("Adding milk");
      }
      else {
        System.out.println("Adding extra coffee");
      }
    }
    else if (option == 3) {
      System.out.println("Adding nothing");
    }
  }

}
