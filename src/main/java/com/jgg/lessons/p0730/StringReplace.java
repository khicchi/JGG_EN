package com.jgg.lessons.p0730;

public class StringReplace {

  public static void main(String[] args){

    String source = "Rise and Shine";

    // Replace "Shine" with "Eat";
    String newStr = source.replace("Shine", "Eat");
    System.out.println("newStr = " + newStr);

    // Print the original String, see if it is changed
    System.out.println("source = " + source);

    // Replace "Rise" with "Wake Up", and replace "Shine" with "Walk"
    // in the same expression
    newStr = source.replace("Rise", "Wake Up")
        .replace("Shine", "Walk");
    System.out.println("newStr = " + newStr);

    // Assign "Peter, Peter, Pumpkin Eater" to <source>
    // replace all "Peter" with your name and assign to <source>
    source = "Peter, Peter, Pumpkin Eater";
    source = source.replace("Peter", "Joe");
    System.out.println("source = " + source);

  }
}
