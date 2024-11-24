package com.jgg.lessons.p1270;

public class StaticVariable1 {

  public static void main(String[] args){

    Counter counterJohn =
                  new Counter("John");
    Counter counterJoe =
                  new Counter("Joe");
    Counter counterEva =
                  new Counter("Eva");
    Counter counterJane =
                  new Counter("Jane");

    // Contestant starts to sing
    counterJohn.setLiked(true);
    System.out.println(Counter.totalLikes); // 1
    counterJoe.setLiked(true);
    System.out.println(Counter.totalLikes); // 2
    counterEva.setLiked(false);
    System.out.println(Counter.totalLikes); // 2
    counterJane.setLiked(true);
    System.out.println(Counter.totalLikes); // 3


  }

}


  class Counter {
    private String juryName;
    private Boolean liked;

    public static int totalLikes;

    Counter(String juryName) {
      this.juryName = juryName;
    }

    public void setLiked(Boolean liked) {
      this.liked = liked;
      if (liked) {
        totalLikes++;
      }
    }
  }