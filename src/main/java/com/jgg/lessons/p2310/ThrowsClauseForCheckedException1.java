package com.jgg.lessons.p2310;

public class ThrowsClauseForCheckedException1 {

  public static void main(String[] args) throws InterruptedException {
    writeNameByInterval("Ben");
  }

  // Writes a name 3 times by waiting 1 sec for each
  static void writeNameByInterval(String name) throws InterruptedException {
    System.out.println(name);
    Thread.sleep(1000);
    System.out.println(name);
    Thread.sleep(1000);
    System.out.println(name);
  }

}
