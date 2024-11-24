package com.jgg.lessons.p1260;

public class Encapsulation {

  public static void main(String[] args){
    Trainer trainer = new Trainer();
    trainer.setName(""); // Name can not be null or empty
    trainer.setAge(0); // Age can not be smaller than 1
  }

}
