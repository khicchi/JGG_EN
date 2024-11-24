package com.jgg.lessons.p1060;

import java.util.Arrays;

public class WrapperClasses3 {

  public static void main(String[] args){
    // Create a method which accepts an int array and returns Integer array
    Integer[] integerArray = getIntegerArray(new int[] {2, 3, 5});
    System.out.println(Arrays.toString(integerArray)); // [2, 3, 5]

    // Create a method which accepts a String and returns Character array
    System.out.println(Arrays.toString(getCharacterArray("Hi"))); // [H, i]

    String numbersString = "22 13 34 231 45";
    // Create a method which accepts a String and returns an Integer array
    // of the space separated integers in the String parameter
    Integer[] returned = getIntegerArrayFromString(numbersString);
    System.out.println(Arrays.toString(returned)); // [22, 13, 34, 231, 45]
  }

  public static Integer[] getIntegerArray(int[] intArr) {
    Integer[] integers = new Integer[intArr.length];
    for(int i = 0; i < intArr.length; i++) {
      integers[i] = intArr[i];
    }
    return integers;
  }

  public static Character[] getCharacterArray(String str) {
    Character[] characters = new Character[str.length()];
    for(int i = 0; i < characters.length; i++) {
      characters[i] = str.charAt(i);
    }
    return characters;
  }

  public static Integer[] getIntegerArrayFromString(String str) {
    String[] strArr = str.split(" ");
    Integer[] integers = new Integer[strArr.length];
    for(int i = 0; i < strArr.length; i++) {
      integers[i] = Integer.valueOf(strArr[i]);
    }
    return integers;
  }

}
