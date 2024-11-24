package com.jgg.lessons.p2490;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattedDateStringFromLocalDate {

  public static void main(String[] args){

    // Create date object as today
    LocalDate date = LocalDate.now();

    // Print date in "yyyy/MM/dd" format
    DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    System.out.println(date.format(dateTimeFormatter1));

    // Print date in "dd MMM yyyy" format
    DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("dd MMM yyyy");
    System.out.println(date.format(dateTimeFormatter2));

    // Print date in "dd.M.yyyy" format
    DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("dd.M.yyyy");
    System.out.println(date.format(dateTimeFormatter3));

  }
}
