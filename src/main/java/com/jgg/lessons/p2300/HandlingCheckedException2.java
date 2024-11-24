package com.jgg.lessons.p2300;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HandlingCheckedException2 {

  public static void main(String[] args){

  }

  public static void readFile(String fileName) throws FileNotFoundException {
    File file = new File(fileName);
    Scanner scanner = new Scanner(file);
    while (scanner.hasNextLine()) {
      System.out.println(scanner.nextLine());
    }
    scanner.close();
  }

}
