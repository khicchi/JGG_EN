package com.jgg.lessons.p1210;

  public class Constructors4 {

    public static void main(String[] args){
      Player player1 = new Player("Joe");
      System.out.println("player1.name = " + player1.name);
      // null

      Player player2 = new Player("Jane", 2345L);
      System.out.println("player2.name = " + player2.name);
      // Jane
    }

  }

  class Player {
    public String name;
    public Long score;

    Player(String name) {
      name = name; // wrong implementation
      // assignment of the name to itself
    }

    Player(String name, Long score) {
      this.name = name;
      this.score = score;
    }
  }