package com.jgg.lessons.p0290;

public class IfElseExamples {

  public static void main(String[] args){
    // Define <a> as int, print if it is odd or even
    int a = 23;
    if (a % 2 == 0) {
      System.out.println(a + " is even"); // not executed
    }
    else {
      System.out.println(a + " is odd"); // executed
    }

    // Try the example above with ternary statement
    System.out.println(a + " is " + (a % 2 == 0 ? "even" : "odd"));

    //////////////////////////////////////
    String validUsername = "admin", validPassword = "password123";
    String inputUsername = "user", inputPassword = "password123";
    // Given those above, print "Login successful" or not
    if (inputUsername.equals(validUsername) && inputPassword.equals(validPassword)) {
      System.out.println("login success"); // not executed
    }
    else {
      System.out.println("invalid username or password"); // executed
    }

    // Given "Meters=Feet×0.3048" formula. Define <length> as 200, and <isFeet> as false
    // Convert meters to feet if isFeet is false, and print as meters for each condition
    double length = 200;
    boolean isFeet = false;
    if (isFeet) {
      System.out.println("Length: " + (length * 0.3048) + " meters"); // not executed
    }
    else {
      System.out.println("Length: " + length + " meters"); // executed
    }
  }

}
