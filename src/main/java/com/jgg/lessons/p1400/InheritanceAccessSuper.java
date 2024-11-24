package com.jgg.lessons.p1400;

  public class InheritanceAccessSuper {
    public static void main(String[] args){
      Dog dog = new Dog();
      dog.name = "Bulldog";

      Bird bird = new Bird();
      bird.name = "Parrot";

      dog.eat("bone");
      dog.run();
      bird.eat("worm");
      bird.fly();
    }
  }


  class Animal {
    public String name;

    public void eat(String meal) {
      System.out.println(name + " eats " + meal);
    }
  }

  class Dog extends Animal {
    public void run() {
      System.out.println(name + " runs.");
    }
  }

  class Bird extends Animal {
    public void fly() {
      System.out.println(name + " fly.");
    }
  }