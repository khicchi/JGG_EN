package com.jgg.homework.p0680;

public class StringCharAt3Solution {

  public static void main(String[] args){

    // TASK:   Define <emoji> variable as String
    //         It can either be
    //         ":)" [Smile]
    //         ":(" [Sad]
    //         ":/" [Upset]
    //         ";)" [Wink]
    //         ";0" [Surprised]
    //         Create a program to print its text pair.
    //         Print <Not Valid> if the emoji is not valid.
    //         Example; if <:)> print <Smile>

    String emoji = ":)"; // You can change this to test other values

    // Determine and print the text pair for the emoji
    switch (emoji) {
      case ":)":
        System.out.println("Smile");
        break;
      case ":(":
        System.out.println("Sad");
        break;
      case ":/":
        System.out.println("Upset");
        break;
      case ";)":
        System.out.println("Wink");
        break;
      case ";0":
        System.out.println("Surprised");
        break;
      default:
        System.out.println("Not Valid");
        break;
    }
  }

}
