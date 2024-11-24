package com.jgg.lessons.p2645;

public class BitwiseAndExample {

  public static void main(String[] args) {

    int a = 10;
    int b = 0;

    if (a < b & a/b == 1) {
      System.out.println("This line will not work because of the exception "
          + "that was thrown at the second condition in the above if statement");
    }

    System.out.println("You will never reach that line "
        + "because of the divide by zero exception occurred in if statement");
  }

}

