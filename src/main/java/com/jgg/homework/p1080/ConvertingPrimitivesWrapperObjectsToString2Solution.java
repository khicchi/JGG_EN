package com.jgg.homework.p1080;

public class ConvertingPrimitivesWrapperObjectsToString2Solution {

  public static void main(String[] args){

    Integer integer = 1;
    Double d = 2.2;
    Long lObj = 2324454345L;
    Character character = '!';
    Float fObj = 32234.232f;
    Boolean bObj = false;

    // TASK: Covert the above wrapper class objects to String objects

    // Convert Integer to String
    String integerToString = integer.toString();
    System.out.println("Integer to String: " + integerToString); // 1

    // Convert Double to String
    String doubleToString = d.toString();
    System.out.println("Double to String: " + doubleToString); // 2.2

    // Convert Long to String
    String longToString = lObj.toString();
    System.out.println("Long to String: " + longToString); // 2324454345

    // Convert Character to String
    String characterToString = character.toString();
    System.out.println("Character to String: " + characterToString); // !

    // Convert Float to String
    String floatToString = fObj.toString();
    System.out.println("Float to String: " + floatToString); // 32234.232

    // Convert Boolean to String
    String booleanToString = bObj.toString();
    System.out.println("Boolean to String: " + booleanToString); // false
  }

}
