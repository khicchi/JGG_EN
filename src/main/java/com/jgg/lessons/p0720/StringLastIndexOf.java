package com.jgg.lessons.p0720;

public class StringLastIndexOf {

  public static void main(String[] args){

    String source = "Consequences";

    // Find the last index of "s"
    int lastIndexOfS = source.lastIndexOf("s");
    System.out.println("lastIndexOfS = " + lastIndexOfS); // 11

    // Find the last Index of "C"
    int lastIndexOfC = source.lastIndexOf('C');
    System.out.println("lastIndexOfC = " + lastIndexOfC); // 0

    // Find the last index of "m"
    int lastIndexOfM = source.lastIndexOf("m");
    System.out.println("lastIndexOfM = " + lastIndexOfM); // -1

    // How many chars between first "e" and last "e"
    int firstIndexOfE = source.indexOf("e");
    int lastIndexOfE = source.lastIndexOf('e');
    System.out.println("char count between first e and last e = " +
                          (lastIndexOfE - firstIndexOfE - 1)); // 5

  }
}
