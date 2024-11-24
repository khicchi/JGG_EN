package com.jgg.homework.p1080;

public class ConvertingPrimitivesWrapperObjectsToString5Solution {

  public static void main(String[] args){

    // TASK: Create a method which accepts a primitive char array
    //       and returns a String array with the same values as String elements

    char[] charArray = {'a', 'b', 'c'};
    String[] stringArray = convertCharArrayToStringArray(charArray);

    // Print the results
    for (String s : stringArray) {
      System.out.println(s);
    }
  }

  public static String[] convertCharArrayToStringArray(char[] charArray) {

    String[] stringArray = new String[charArray.length];
    for (int i = 0; i < charArray.length; i++) {
      stringArray[i] = Character.toString(charArray[i]);
    }

    return stringArray;
  }

}
