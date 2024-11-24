package com.jgg.homework.p0900;

public class MainMethodArgsSolution {

  public static void main(String[] args){

    // TASK: Provide command line parameters: look to the future with hope
    //       create a new array with the lengths of each word
    //       print each word and length in this format;
    //       <word> : <wordLength>

    // args contains command line parameters
    // Create an array to hold lengths of each word
    int[] lengths = new int[args.length];

    // Calculate the length of each word and store it in the lengths array
    for (int i = 0; i < args.length; i++) {
      lengths[i] = args[i].length();
    }

    // Print each word and its length
    for (int i = 0; i < args.length; i++) {
      System.out.println(args[i] + " : " + lengths[i]);
    }
  }

}
