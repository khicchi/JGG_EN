package com.jgg.lessons.p2320;

public class TryCatchBlock1 {

  public static void main(String[] args){
    waitOneSec();
  }

  static void waitOneSec() {
    try{
      Thread.sleep(1000);
    } catch (InterruptedException ex) {
      System.out.println("Wait is interrupted. Try again.");
    }
  }

}
