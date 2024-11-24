package com.jgg.lessons.p2120;

  public class PassByValueProofForReferences {

    public static void main(String[] args) {
      MyObject obj = new MyObject();
      obj.value = 10;
      modify(obj); // changes object field
      System.out.println(obj.value); // 20

      reassign(obj);
      System.out.println(obj.value); // 20
    }

    public static void modify(MyObject o) {
      o.value = 20; // Modifies the original object
    }

    public static void reassign(MyObject o) {
      o = new MyObject(); // Reassigns a new reference
    }

  }

  class MyObject {
    int value;
  }