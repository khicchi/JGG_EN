package com.jgg.homework.p0960;

public class StringSplit1Solution {

  public static void main(String[] args){

    String dataRow = ",John,Doe,,30,New York,";

    // TASK-1: In the <dataRow> above, each data of a customer is separated with comma
    //         First data is <kids count> (which is empty in the example)
    //         Second data is <first name>
    //         Third data is <last name>
    //         Fourth data is <home address> (which is empty in the example)
    //         Fifth data is <city>
    //         Sixth data is <work address> (which is empty in the example)
    String[] fields = dataRow.split(",");

    // TASK-2: Find how many empty fields are there?
    int emptyCount = 0;
    for (String field : fields) {
      if (field.isEmpty()) {
        emptyCount++;
      }
    }
    System.out.println("Number of empty fields: " + emptyCount);

    System.out.println("************************** TASK 2 FINISHED **************************");

    // TASK-3: Print each field in a new row in this format
    //         first name: <first name>
    System.out.println("kids count: " + fields[0]);
    System.out.println("first name: " + fields[1]);
    System.out.println("last name: " + fields[2]);
    System.out.println("home address: " + fields[3]);
    System.out.println("city: " + fields[4]);
    System.out.println("work address: " + fields[5]);

    System.out.println("************************** TASK 3 FINISHED **************************");

  }

}
