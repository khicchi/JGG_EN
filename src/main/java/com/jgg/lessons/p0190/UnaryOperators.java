package com.jgg.lessons.p0190;

public class UnaryOperators {

  public static void main(String[] args){

    // Use (+) Unary Operator as an example
    int x = +5; // x is assigned the positive value of 5

    // Use (-) Unary Operator to assign minus 10
    int y = -10;

    // Use (-) Unary Operator to assign the minus value of a variable
    int z = 4;
    int zMinus = -z; // zMinus is -4

    // Use (++) Unary operator to increase a value
    int myInt = 7;
    myInt++;
    System.out.println(myInt); // 8

    // For <int a = 10;> what does it print for a++
    int a = 10;
    System.out.println(a++); // 10

    // For <int b = 100;> what does it print for ++b
    int b = 100;
    System.out.println(++b); // 101

    // Decrease the value of an int variable by one
    int c = 1;
    c--;
    System.out.println(c); // 0

    // For <int d = 10;> what does it print for d--
    int d = 10;
    System.out.println(d--); // 10

    // For <int e = 10;> what does it print for --e
    int e = 10;
    System.out.println(--e); // 9

    // Negate a true boolean variable
    boolean isTall = true;
    boolean isShort = !isTall;
    System.out.println(isShort); // false

    // Print the negation of a boolean false
    boolean isRed = false;
    System.out.println(!isRed); // true

    // Perform bitwise complement operation on int 5
    int t = 5;
    int w = ~5;
    System.out.println(w); // -6
    // binary of 5 =>           00000000 00000000 00000000 00000101
    // reverse binary of 5 =>   11111111 11111111 11111111 11111010
    // => -6 as decimal
  }
}
