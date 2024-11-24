package com.jgg.lessons.p0960;

import java.util.Arrays;

public class StringSplit {

  public static void main(String[] args){

    String sentence = "Keep your friends close, and your enemies closer";

    // Split <sentence> by space
    String[] spaceSplit = sentence.split(" ");
    System.out.println(Arrays.toString(spaceSplit));
    // [Keep, your, friends, close,, and, your, enemies, closer]

    // Split <sentence> by comma
    String[] commaSplit = sentence.split(",");
    System.out.println(Arrays.toString(commaSplit));
    // [Keep your friends close,  and your enemies closer]

    // Capitalize each words first character
    String capitalized = "";
    for(int i = 0; i < spaceSplit.length; i++) {
      String word = spaceSplit[i];
      capitalized += word.substring(0, 1).toUpperCase() +
                                        word.substring(1) + " ";
    }
    capitalized = capitalized.trim();
    System.out.println(capitalized);
    // Keep Your Friends Close, And Your Enemies Closer

  }
}
