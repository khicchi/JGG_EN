package com.jgg.lessons.p2300;

import java.io.File;
import java.util.Scanner;

public class HandlingCheckedException1 {

  public static void main(String[] args){

  }

  public static void readFile(String fileName) {
    try{
      File file = new File(fileName);
      Scanner scanner = new Scanner(file);
      while (scanner.hasNextLine()) {
        System.out.println(scanner.nextLine());
      }
      scanner.close();
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

}
