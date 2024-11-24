package com.jgg.lessons.p2060;

public class PolymorphismViaSuperClass2 {

  public static void main(String[] args) {
    Animal myAnimal = new Animal();
    Animal myDog = new Dog();
    Animal myCat = new Cat();

    myAnimal.makeSound(); // Animal makes a sound
    myDog.makeSound();    // Dog barks
    myCat.makeSound();    // Cat meows

    System.out.println(myDog.name); // Dog
    System.out.println(myCat.name); // Cat
  }
}

  class Animal {
    String name;
    Animal() {
      name = "Animal";
    }
    void makeSound() {
      System.out.println("Animal makes a sound");
    }
  }

  class Dog extends Animal {
    Dog() {
      name = "Dog";
    }

    @Override
    void makeSound() {
      System.out.println("Dog barks");
    }
  }

  class Cat extends Animal {
    Cat() {
      name = "Cat";
    }

    @Override
    void makeSound() {
      System.out.println("Cat meows");
    }
  }
