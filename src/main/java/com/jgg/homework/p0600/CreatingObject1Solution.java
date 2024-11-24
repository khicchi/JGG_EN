package com.jgg.homework.p0600;

public class CreatingObject1Solution {

  public static void main(String[] args){

    // TASK-1: Create an Animal class with those fields; name, age, species
    //         Create an Animal object as <animal2>, assign some values to all fields
    //         Print all field values of <animal2> object
    Animal animal1 = new Animal();
    animal1.name = "Leon";
    animal1.age = 3;
    animal1.species = "Lion";
    System.out.println("animal2.name = " + animal1.name);
    System.out.println("animal2.age = " + animal1.age);
    System.out.println("animal2.species = " + animal1.species);

    System.out.println("************************** TASK 1 FINISHED **************************");

    // TASK-2: Create an Animal object as <animal2>, assign some values to all fields
    //         Print all field values of <animal2> object
    Animal animal2 = new Animal();
    animal2.name = "Monkey";
    animal2.age = 4;
    animal2.species = "Primates";
    System.out.println("animal2.name = " + animal2.name);
    System.out.println("animal2.age = " + animal2.age);
    System.out.println("animal2.species = " + animal2.species);

    System.out.println("************************** TASK 2 FINISHED **************************");

  }

}

class Animal {
  public String name;
  public int age;
  public String species;
}