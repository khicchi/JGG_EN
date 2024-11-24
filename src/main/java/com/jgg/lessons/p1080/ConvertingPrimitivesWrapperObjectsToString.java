package com.jgg.lessons.p1080;

public class ConvertingPrimitivesWrapperObjectsToString {

  public static void main(String[] args){

    // Converting primitives to String
    int num = 9;
    String numStr1 = String.valueOf(num); // way 1
    String numStr2 = Integer.toString(num); // way 2

    // Converting wrapper class objects to String
    Integer numObj = 23;
    String numStr3 = numObj.toString(); // way 1
    String numStr4 = String.valueOf(numObj); // way 2

    // Examples
    char c = 'c';
    byte b = 2;
    float f = 3f;

    // Convert all above to String objects
    String str1 = String.valueOf(c);
    String str2 = String.valueOf(b);
    String str3 = String.valueOf(f);

  }

}
