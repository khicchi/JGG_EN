package com.jgg.lessons.p1730;

public class FinalArray {

  public static void main(String[] args){

    final int[] arr1 = { 2, 5, 7 };
    arr1[0] = 3; // doable

    int[] arr2 = { 1, 2, 1 };
    // arr1 = arr2; // not doable, arr1 is final
    arr2 = arr1; // doable, arr2 is not final

  }

}
