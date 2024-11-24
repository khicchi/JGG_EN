package com.jgg.lessons.p2430;

public class ThreadsBasic {

  private static Runnable runnable = new Runnable() {
    @Override
    public void run() {
      for (int i = 0; i < 100; i++) {
        System.out.println("I am a thread");
      }
    }
  };

  public static void main(String[] args) {
    Thread thread = new Thread(runnable);

    thread.start();

    count();
  }

  private static void count(){
    for (int i = 0; i < 100; i++) {
      System.out.println(i);
    }
  }

}
