package com.jgg.lessons.p0350;

  public class IfStatementWithEnum {

    public static void main(String[] args){
      // Define an Enum for days of the week
      // Create a <day> variable for a certain day
      // Print "Picnic Day" if <day> is SATURDAY
      // Print "Work Day" if <day> is weekday
      // Print "Out of Work" if <day> is weekend

      Day day = Day.SATURDAY;
      if (day == Day.MONDAY || day == Day.TUESDAY ||
          day == Day.WEDNESDAY || day == Day.THURSDAY || day == Day.FRIDAY) {
        System.out.println("Work Day");
      }
      else {
        System.out.println("Out of Work");
        if (day == Day.SATURDAY) {
          System.out.println("Picnic Day");
        }
      }
    }
  }

  enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
  }






