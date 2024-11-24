package com.jgg.lessons.p2100;

public class UpCasting {

  public static void main(String[] args){

    Dog dog = new Dog();
    Animal animal = dog;  // Upcasting (implicit)

    // Accessible methods through superclass reference
    animal.makeSound();  // Output: Dog barks

    // The following line would cause a compile-time error:
    // animal.wagTail();  // Error: cannot find symbol

    // Upcasting can be done explicitly but not needed
    Animal myAnimal = (Animal) dog;

  }

}
