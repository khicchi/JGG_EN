package com.jgg.lessons.p2100;

public class AccessibilityInPolymorphism {

  public static void main(String[] args){
    Animal myDog = new Dog();

    // Reference type decides what is accessible
    myDog.makeSound();  // Output: Dog barks
    myDog.sleep();      // Output: Animal is sleeping

    // myDog.wagTail();
    // Compile-time error: no access
    // not overridden

    System.out.println(myDog.kind); // Animal
    // <kind> is inherited

    // System.out.println(myDog.species);
    // Compile-time error: no access
    // <species> is not inherited
  }
}

  class Animal {
    String kind = "Animal";
    void makeSound() {
      System.out.println("Animal makes a sound");
    }

    void sleep() {
      System.out.println("Animal is sleeping");
    }
  }

  class Dog extends Animal {
    String species = "Dog";

    @Override
    void makeSound() {
      System.out.println("Dog barks");
    }

    void wagTail() {
      System.out.println("Dog is wagging its tail");
    }
  }

