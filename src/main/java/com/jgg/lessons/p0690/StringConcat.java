package com.jgg.lessons.p0690;

public class StringConcat {

  public static void main(String[] args){

    // concat "Jane " with "Doe"
    String jane = "Jane ";
    String doe = "Doe";
    System.out.println(jane.concat(doe));
    // prints <Jane Doe>

    // Print <jane> and <doe>
    System.out.println("jane = " + jane); // Jane
    System.out.println("doe = " + doe); // Doe

    // concat "Jane " with "Doe" without any declarations
    System.out.println("Joe ".concat("Doe"));
    // prints <Joe Doe>
  }
}
