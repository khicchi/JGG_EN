package com.jgg.lessons.p2090;

public class GettingObjectInformationAtRuntime2 {

  public static void main(String[] args){
    Animal[] animals = new Animal[3];
    animals[0] = new Dog();
    animals[1] = new Cat();
    animals[2] = new Bird();

    for (Animal animal: animals) {
      if (animal instanceof Dog) {
        System.out.println("Animal is a dog");
      }
      else if(animal instanceof Cat){
        System.out.println("Animal is a cat");
      }
      else if(animal instanceof Bird){
        System.out.println("Animal is a bird");
      }
    }

  }

}