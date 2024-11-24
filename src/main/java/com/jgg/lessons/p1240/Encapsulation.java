package com.jgg.lessons.p1240;

public class Encapsulation {

  public static void main(String[] args){

    Trainer trainer = new Trainer();
    // use setter to set value
    trainer.setName("John");
    trainer.setAge(22);

    // use getter to retrieve value
    System.out.println(trainer.getName());
    // John

    System.out.println(trainer.getAge());
    // 22

  }

}
