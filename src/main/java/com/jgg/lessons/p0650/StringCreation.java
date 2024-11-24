package com.jgg.lessons.p0650;

public class StringCreation {

  public static void main(String[] args){

    // Declaring a Sting in Literal way
    String literal = "String by Literal";
    // JVM checks String Pool

    // Declaring a String via String class
    String byStringClass =
                  new String("String by Class");
    // JVM does not check String Pool
  }

}
