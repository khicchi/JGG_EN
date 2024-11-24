package com.jgg.homework.p0860;

public class AssigningValuesToArrayElementsSolution {

  public static void main(String[] args){

    // TASK-1: Initialize a String array with values;
    //         "Good", "things", "come", "to", "those", "who", "wait"
    String[] wordsArray = {"Good", "things", "come", "to", "those", "who", "wait"};

    // TASK-2: Print the first element of the array above
    System.out.println("First element: " + wordsArray[0]); // Good

    System.out.println("************************** TASK 2 FINISHED **************************");

    // TASK-3: Assign "Bad" to the first element of the array above
    wordsArray[0] = "Bad";

    // TASK-4: Print the first element of the above array
    System.out.println("First element after update: " + wordsArray[0]); // Bad

    System.out.println("************************** TASK 4 FINISHED **************************");

    // TASK-5: Assign "deserve" to the last element of the array above
    wordsArray[wordsArray.length - 1] = "deserve";

    // TASK-6: Print all elements of the array above in uppercase characters
    System.out.print("Array in uppercase: ");
    for (String word : wordsArray) {
      System.out.print(word.toUpperCase() + " ");
    }
    // BAD THINGS COME TO THOSE WHO DESERVE

    System.out.println("\n************************** TASK 6 FINISHED **************************");

  }

}
