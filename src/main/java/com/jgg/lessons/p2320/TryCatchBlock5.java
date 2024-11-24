package com.jgg.lessons.p2320;

public class TryCatchBlock5 {

  public static void main(String[] args){
    System.out.println(convertTextToNumeric1("3s"));
    System.out.println(convertTextToNumeric2("3s"));
  }

  static int convertTextToNumeric1(String text) {
    int numeric = 0;

    try{
      numeric = Integer.parseInt(text);
    } catch (NumberFormatException e) {
      System.out.println("Provided text is not a number");
    }

    return numeric;
  }

  static int convertTextToNumeric2(String text) {
    int numeric = 0;

    try{
      numeric = Integer.parseInt(text);
    } catch (NumberFormatException e) {
      // assume we are logging exception details here
      e.printStackTrace();
    }

    return numeric;
  }

}
