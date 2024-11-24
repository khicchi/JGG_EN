package com.jgg.lessons.p1260;

  public class Trainer {

    private String name;
    private int age;

    public void setName(String name) {
      if (name == null || name.isBlank()) {
        System.out.println("Name can not be null or empty");
      }
      else {
        this.name = name;
      }
    }

    public void setAge(int age) {
      if (age < 1) {
        System.out.println("Age can not be smaller than 1");
      }
      else {
        this.age = age;
      }
    }

  }


