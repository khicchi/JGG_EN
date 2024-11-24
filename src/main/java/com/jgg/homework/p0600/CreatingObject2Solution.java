package com.jgg.homework.p0600;

public class CreatingObject2Solution {

  public static void main(String[] args){

    // TASK-1: Create a Teacher class with those field; firstName, lastName, birthYear
    //         Add a getFullName() instance method inside Teacher class
    //         which returns firstName and lastName concatenation.
    //         Create a Teacher object as <teacher>, assign some values to all fields
    //         Print all field values of <teacher>
    //         Call getFullName() method and print its return value
    Teacher teacher1 = new Teacher();
    teacher1.firstName = "Jane";
    teacher1.lastName = "Doe";
    teacher1.birthYear = 1990;
    System.out.println("teacher1.firstName = " + teacher1.firstName);
    System.out.println("teacher1.lastName = " + teacher1.lastName);
    System.out.println("teacher1.birthYear = " + teacher1.birthYear);
    System.out.println("teacher1.getFullName() = " + teacher1.getFullName());

    System.out.println("************************** TASK 1 FINISHED **************************");

    // TASK-2: Create a Teacher object as <teacher2>, assign some values to all fields
    //         Print all field values of <teacher2>
    //         Call getFullName() method and print its return value
    Teacher teacher2 = new Teacher();
    teacher2.firstName = "Jane";
    teacher2.lastName = "Doe";
    teacher2.birthYear = 1990;
    System.out.println("teacher2.firstName = " + teacher2.firstName);
    System.out.println("teacher2.lastName = " + teacher2.lastName);
    System.out.println("teacher2.birthYear = " + teacher2.birthYear);
    System.out.println("teacher2.getFullName() = " + teacher2.getFullName());

    System.out.println("************************** TASK 2 FINISHED **************************");

  }

}


class Teacher {
  String firstName;
  String lastName;
  short birthYear;

  String getFullName() {
    return firstName.concat(" ").concat(lastName);
  }
}