package com.jgg.homework.p0310;

public class IfElseIfElseExamples1Solution {

  public static void main(String[] args){

    double totalAmount = 120.0;

    // TASK: In a restaurant, discount is calculated like that;
    //       If the total amount is greater than 150$, then discount is 20%
    //       If the total amount is greater than 100$, then discount is 10%
    //       Otherwise, discount is 5%
    //       Print the discounted price

    double discount;
    double discountedPrice;

    if (totalAmount > 150) {
      discount = 0.20; // 20% discount
    } else if (totalAmount > 100) {
      discount = 0.10; // 10% discount
    } else {
      discount = 0.05; // 5% discount
    }

    discountedPrice = totalAmount * (1 - discount);
    System.out.println("Discounted price: $" + discountedPrice);
  }

}
