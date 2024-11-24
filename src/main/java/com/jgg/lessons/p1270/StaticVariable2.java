package com.jgg.lessons.p1270;

public class StaticVariable2 {

  public static void main(String[] args){

    Customer customerJohn =
          new Customer("John",2);
    Customer customerJoe =
          new Customer("Joe",1);
    Customer customerJane =
          new Customer("Jane",1);

    System.out.println(Customer.totalSlices); // 8
    customerJohn.eat();
    System.out.println(Customer.totalSlices); // 6
    customerJoe.eat();
    System.out.println(Customer.totalSlices); // 6
    customerJane.eat();
    System.out.println(Customer.totalSlices); // 4
    customerJoe.eat();
    System.out.println(Customer.totalSlices); // 3
    customerJohn.eat();
    System.out.println(Customer.totalSlices); // 1
    customerJane.eat();
    System.out.println(Customer.totalSlices); // 0
  }

}

  class Customer {
    private String name;
    private int slicesPerEat;

    public static int totalSlices = 8;

    Customer(String name, int slicesPerEat) {
      this.name = name;
      this.slicesPerEat = slicesPerEat;
    }

    public void eat() {
      System.out.println(String.format(
          "%s eats %s slice(s)", name, slicesPerEat));
      totalSlices -= slicesPerEat;
    }
  }
