package com.jgg.lessons.p2090;

  public class GettingObjectInformationAtRuntime1 {

    public static void main(String[] args){
      Animal[] animals = new Animal[3];
      animals[0] = new Dog();
      animals[1] = new Cat();
      animals[2] = new Bird();

      for (Animal animal: animals) {
        System.out.println(animal.getClass().getSimpleName());
      }
    }

  }

  class Animal { }

  class Dog extends Animal { }

  class Cat extends Animal { }

  class Bird extends Animal { }

