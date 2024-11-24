package com.jgg.lessons.p0260;

public class LogicalOperatorsNot {

  public static void main(String[] args){

    // Print the reverse of false
    System.out.println(!false); // true

    // Print the reverse of (4 < 5)
    System.out.println(!(4 < 5)); // false

    // Jane is 20 years old. Print if she is a child by using Logical NOT (!)
    int age = 20;
    boolean isAdult = age >= 18;
    boolean isChild = !isAdult;
    System.out.println("Jane is a child: " + isChild); // false

    // Declare variable isRainy as true. Print the weather is not rainy by using Logical NOT (!)
    boolean isRainy = true;
    System.out.println("Weather is rainy: " + !isRainy); // false

    // If a child is in [13, 19] age range, then is a teenager
    // Alice is 13 years old. Print if Alice is a teenager or not in separate lines
    int alice = 13;
    boolean isAliceTeenager = alice >= 13 && alice <= 19;
    System.out.println("Alice is a teenager: " + isAliceTeenager); // true
    System.out.println("Alice is not a teenager: " + !isAliceTeenager); // false
  }

}
