package com.jgg.homework.p1080;

public class ConvertingPrimitivesWrapperObjectsToString4Solution {

  public static void main(String[] args){

    // TASK: Create a method which accepts a primitive double array
    //       and returns a String array with the same values as String elements

    double[] primitiveArray = {1.23, 4.56, 7.89};
    String[] stringArray = convertDoubleArrayToStringArray(primitiveArray);

    // Print the results
    for (String s : stringArray) {
      System.out.println(s);
    }
  }

  /**
   * Converts a primitive double array to a String array.
   *
   * @param doubleArray the primitive double array to convert
   * @return a String array with the same values as String elements
   */
  public static String[] convertDoubleArrayToStringArray(double[] doubleArray) {

    String[] stringArray = new String[doubleArray.length];
    for (int i = 0; i < doubleArray.length; i++) {
      stringArray[i] = Double.toString(doubleArray[i]);
    }

    return stringArray;
  }

}
