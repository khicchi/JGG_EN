package com.jgg.lessons.p1280;

  public class StaticMethod3 {

    public static void main(String[] args){
      Pizza pizza1 = new Pizza("cheese");
      Pizza pizza2 = new Pizza("meat");
      Pizza pizza3 = new Pizza("vegetarian");

      System.out.println(pizza3.totalPizzaSold); //3
      System.out.println(Pizza.totalPizzaSold);  //3
    }
  }

  class Pizza {
    private String type;

    public static int totalPizzaSold;

    Pizza(String type) {
      this.type = type;
      increaseSoldCount();
    }

    private static void increaseSoldCount() {
      totalPizzaSold++;
      //System.out.println("New pizza " + type);
      // not doable. can not access instance field
    }
  }

