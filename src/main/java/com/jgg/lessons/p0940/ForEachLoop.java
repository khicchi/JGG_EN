package com.jgg.lessons.p0940;

public class ForEachLoop {

  public static void main(String[] args){

    // use for-each loop to print int array elements
    int[] intArr = { 4, 7, 8 };
    for (int element: intArr) {
      System.out.println(element);
    }

    // use for-each loop to print char array elements
    // in the same line, separated by comma
    char[] charArr = { 'e', 'd', 'i' };
    for (char element: charArr) {
      System.out.print(element + ", ");
    }

    // print even numbers of the int array
    for (int element: intArr) {
      if (element % 2 == 0) {
        System.out.println(element);
      }
    }

  }

}
