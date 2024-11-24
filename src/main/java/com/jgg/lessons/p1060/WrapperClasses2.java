package com.jgg.lessons.p1060;

public class WrapperClasses2 {

  public static void main(String[] args){

    // Create an integer object and print
    Integer intObj = Integer.valueOf(30);

    // Create a primitive int from String "12"
    int intFromString = Integer.parseInt("12");

    // Nullify <intObj> and print
    intObj = null;
    System.out.println(intObj); // null

    // Create a byte object from a primitive byte variable
    byte bytePrimitive = 3;
    Byte byteObj = Byte.valueOf(bytePrimitive);
    System.out.println(byteObj); // 3

    // Create an array of Integer objects
    Integer[] integers = { Integer.valueOf(1),
                                    Integer.valueOf(3) };

    // Create an Integer object from String "11"
    Integer myInt = Integer.valueOf("11");

    // Assign 'C' directly yo a character object
    Character character = 'C';
    System.out.println(character); // C

    // Assign 5 to an integer object directly
    Integer five = 5;
    System.out.println(five); // 5

  }
}
