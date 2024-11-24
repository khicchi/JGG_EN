package com.jgg.lessons.p1250;

  public class Trainer {

    // no getter for name => write-only
    private String name;
    // no setter for age => read-only
    private int age;

    // setter for <name>
    public void setName(String name) {
      this.name = name;
    }

    // getter for <age>
    public int getAge() {
      return age;
    }

  }


