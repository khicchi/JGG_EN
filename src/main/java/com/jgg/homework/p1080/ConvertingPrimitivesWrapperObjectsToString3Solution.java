package com.jgg.homework.p1080;

public class ConvertingPrimitivesWrapperObjectsToString3Solution {

  public static void main(String[] args){

    String strTrue = "true";

    // TASK-1: Convert <strTrue> to Boolean object

    Boolean booleanObject = Boolean.valueOf(strTrue);
    System.out.println("Boolean object: " + booleanObject); // true

    System.out.println("************************** TASK 1 FINISHED **************************");

    // TASK-2: Convert <strTrue> to primitive boolean

    boolean primitiveBoolean = Boolean.parseBoolean(strTrue);
    System.out.println("Primitive boolean: " + primitiveBoolean); // true

    System.out.println("************************** TASK 2 FINISHED **************************");

  }

}
