package com.jgg.homework.p0880;

public class ProcessingArrays2Solution {

  public static void main(String[] args){

    // TASK: Initialize a String array with values: "candy", "tear", "candy", "red"
    //       Find frequency of "candy"
    String[] words = {"candy", "tear", "candy", "red"};
    String target = "candy";
    int frequency = 0;

    for (int i = 0; i < words.length; i++) {
      if (words[i].equals(target)) {
        frequency++;
      }
    }
    System.out.println("Frequency of \"" + target + "\": " + frequency);
    
  }

}
