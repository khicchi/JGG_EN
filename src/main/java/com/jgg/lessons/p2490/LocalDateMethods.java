package com.jgg.lessons.p2490;

import java.time.LocalDate;

public class LocalDateMethods {

  public static void main(String[] args){

    LocalDate date = LocalDate.of(2000, 11, 22);

    // Manipulate date
    date.plusYears(1);
    System.out.println("date = " + date); // 2000-11-22

    // Re-assign date
    date = date.plusYears(1);
    date = date.plusMonths(1);
    date = date.plusDays(5);

    // Get parts of date
    System.out.println("date.getYear() = " + date.getYear());
    System.out.println("date.getMonthValue() = " + date.getMonthValue());
    System.out.println("date.getDayOfMonth() = " + date.getDayOfMonth());

    // Compare dates
    System.out.println(date.isAfter(LocalDate.now())); // false
    System.out.println(LocalDate.now().isAfter(date)); // true

  }
}
