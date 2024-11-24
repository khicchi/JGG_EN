package com.jgg.lessons.p2490;

import java.time.LocalDate;

public class LocalDateCreation {

  public static void main(String[] args){
    // Create LocalDate object as today
    LocalDate today = LocalDate.now();
    System.out.println(today);

    // Create LocalDate object for 20.07.2024
    LocalDate dateOf = LocalDate.of(2024, 7, 20);
    System.out.println(dateOf);

    // Create LocalDate object for the 200th day of 2024
    LocalDate dateOfYearDay = LocalDate.ofYearDay(2024, 200);
    System.out.println(dateOfYearDay);

    // Convert "2024-07-20" to LocalDate object
    LocalDate dateFromString = LocalDate.parse("2024-07-20");
    System.out.println(dateFromString);
  }

}
