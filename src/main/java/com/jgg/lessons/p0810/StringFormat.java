package com.jgg.lessons.p0810;

public class StringFormat {

  public static void main(String[] args){

    // Format "Hi <your name>" with your name
    String formatMe = "Hi %s";
    String formatted = String.format(formatMe, "John");
    System.out.println(formatted);

    // Format "Number <digit>" for each digit between [0-9]
    for(int i = 0; i < 10; i++) {
      System.out.println(String.format("Number %s", i));
    }

    // Format "<number> is greater than <number>" using two numbers
    formatted = String.format("%s is greater than %s", 3, 2);
    System.out.println(formatted);

  }

}
