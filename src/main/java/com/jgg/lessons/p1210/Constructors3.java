package com.jgg.lessons.p1210;

  public class Constructors3 {

    public static void main(String[] args){

      Film film1 = new Film();
      System.out.println("film1.name = " + film1.name); // null
      System.out.println("film1.year = " + film1.year); // null

      Film film2 = new Film("Inception");
      System.out.println("film2.name = " + film2.name); // Inception
      System.out.println("film2.year = " + film2.year); // null

      Film film3 = new Film(2000);
      System.out.println("film3.name = " + film3.name); // null
      System.out.println("film3.year = " + film3.year); // 2000

      Film film4 = new Film("Day 0", 2007);
      System.out.println("film4.name = " + film4.name); // Day 0
      System.out.println("film4.year = " + film4.year); // 2007

    }

  }

  class Film {
    public String name;
    public Integer year;

    Film () {} // Parameterless cons.

    Film (String name) {
      this.name = name;
    }

    Film (Integer year) {
      this.year = year;
    }

    Film (String name, Integer year) {
      this.name = name;
      this.year = year;
    }
  }
