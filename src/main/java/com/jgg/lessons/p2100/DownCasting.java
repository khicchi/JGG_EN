package com.jgg.lessons.p2100;

public class DownCasting {

    public static void main(String[] args){
      Animal myDog = new Dog();

      // Not doable - Compilation error
      // myDog.wagTail();
      // System.out.println(myDog.species);

      // Down casting dog
      ((Dog)myDog).wagTail();
      String species = ((Dog)myDog).species;

      // Down casting dog
      // and creating a new reference variable
      Dog dog = (Dog)myDog;
      dog.wagTail();
      species = dog.species;
    }
}