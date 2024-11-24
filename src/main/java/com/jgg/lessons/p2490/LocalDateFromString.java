package com.jgg.lessons.p2490;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateFromString {

  public static void main(String[] args){

    // Example 1 - convert "15.04.2020" to LocalDate object
    String stringDate1 = "15.04.2020";

    // throws DateTimeParseException
    // LocalDate date1 = LocalDate.parse(stringDate1);

    // proper conversion via formatter
    DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    LocalDate date1 = LocalDate.parse(stringDate1, formatter1);
    System.out.println("date1 = " + date1);

    // Example 1 - convert "11/22/2020" to LocalDate object
    String stringDate2 = "11/22/2020";
    DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    LocalDate date2 = LocalDate.parse(stringDate2, formatter2);
    System.out.println("date2 = " + date2);

  }
}
