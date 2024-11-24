package com.jgg.lessons.p1190;

import java.util.ArrayList;

public class ArrayListSet {

  public static void main(String[] args){

    ArrayList<String> list = new ArrayList<>();
    list.add("Fred"); list.add("Betty"); list.add("Barney"); list.add("Wilma");
    System.out.println(list); // [Fred, Betty, Barney, Wilma]

    // Update the second item in the list with "bam bam"
    list.set(1, "bam bam");
    System.out.println(list); // [Fred, bam bam, Barney, Wilma]



  }

}
