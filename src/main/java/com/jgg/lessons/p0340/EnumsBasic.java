package com.jgg.lessons.p0340;

  public class EnumsBasic {

      public static void main(String[] args){
        // Define an Enum for days of the week and print some of them
        System.out.println(Day.MONDAY); // prints MONDAY
        System.out.println(Day.TUESDAY.name()); // prints TUESDAY
      }

  }

  enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
  }



