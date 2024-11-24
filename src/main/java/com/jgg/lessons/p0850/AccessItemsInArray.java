package com.jgg.lessons.p0850;

public class AccessItemsInArray {

  public static void main(String[] args){

    // Declare an int array with values 13, 0, 5.
    // Print the first element of an int array
    int[] myIntArr = new int[3];
    System.out.println("myIntArr[0] = " + myIntArr[0]); // 0

    // Print the second element of the array above
    System.out.println("myIntArr[1] = " + myIntArr[1]); // 0

    // Print last element of the array above
    System.out.println("myIntArr[2] = " + myIntArr[2]); // 0

    // Declare a String array with values "Blue", "Red", "Green"
    // Print the first and the last elements
    String[] colors = { "Blue", "Red", "Green" };
    System.out.println("colors[0] = " + colors[0]); // Blue
    System.out.println("colors[2] = " + colors[2]); // Green

  }

}
