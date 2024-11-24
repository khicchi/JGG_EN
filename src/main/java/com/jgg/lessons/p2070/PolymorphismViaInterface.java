package com.jgg.lessons.p2070;

public class PolymorphismViaInterface {

  public static void main(String[] args){
    // Polymorphic object creation
    MakesSound dog = new Dog();
    MakesSound cat = new Cat();

    dog.makeSound(); // Dog barks
    cat.makeSound(); // Cat meows

    // Polymorphic object creation conditionally
    String myPet = "dog";
    MakesSound myPetSounds;

    if (myPet.equals("dog")) {
      myPetSounds = new Dog();
    }
    else {
      myPetSounds = new Cat();
    }

    myPetSounds.makeSound(); // Dog barks
  }

}

  interface MakesSound {
    void makeSound();
  }

  class Dog implements MakesSound {
    @Override
    public void makeSound() {
      System.out.println("Dog barks");
    }
  }

  class Cat implements MakesSound {
    @Override
    public void makeSound() {
      System.out.println("Cat meows");
    }
  }
