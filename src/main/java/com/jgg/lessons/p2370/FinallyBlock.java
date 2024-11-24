package com.jgg.lessons.p2370;

public class FinallyBlock {

  public static void main(String[] args){
    try{
      connectDB();
      // fetch data and process
      throw new RuntimeException();
    } catch (Exception e) {
      System.out.println("Handling Exception");
    } finally{
      disconnectDB();
    }

    try{
      connectDB();
    } finally{
      disconnectDB();
    }
  }

  static void connectDB() {
    System.out.println("Connecting DB");
  }

  static void disconnectDB() {
    System.out.println("Disconnecting DB");
  }

}
