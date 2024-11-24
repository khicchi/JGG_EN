package com.jgg.lessons.p0120;

public class PrintValueAndVariable {

  public static void main(String[] args){

    // Print <name: John> by using "name: " as literal and John as variable
    String name = "John";
    System.out.println("name: " + name);

    // Print <age: 20> by using "age: " as literal and 20 as variable
    int age = 20;
    System.out.println("age: " + age);

    // Print "My grade: A" by using "My grade: " as literal and A as variable
    char grade = 'A';
    System.out.println("My grade: " + grade);

    // Print "Population: 2000000" by using "Population:", " ", and "2000000" as variable
    String population = "Population:";
    String space = " ";
    long populationValue = 2000000;
    System.out.println(population + space + populationValue);
  }
}



