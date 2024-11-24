package com.jgg.homework.p1060;

public class WrapperClassesSolution {

  public static void main(String[] args){

    String str = "22";

    // TASK-1: Create a byte object from <str>
    Byte bObj = Byte.valueOf(str);

    // TASK-2: Create a primitive byte from <str>
    byte b = Byte.parseByte(str);

    // TASK-3: Create a short object from <str>
    Short sObj = Short.valueOf(str);

    // TASK-4: Create a primitive short from <str>
    short s = Short.parseShort(str);

    // TASK-5: Create an integer object from <str>
    Integer iObj = Integer.valueOf(str);

    // TASK-6: Create a primitive int from <str>
    int i = Integer.parseInt(str);

    // TASK-7: Create a long object from <str>
    Long lObj = Long.valueOf(str);

    // TASK-8: Create a primitive long from <str>
    long l = Long.parseLong(str);

    // TASK-9: Create a float object from <str>
    Float fObj = Float.valueOf(str);

    // TASK-10: Create a primitive float from <str>
    float f = Float.parseFloat(str);

    // TASK-11: Create a double object from <str>
    Double dObj = Double.valueOf(str);

    // TASK-12: Create a primitive double from <str>
    double d = Double.parseDouble(str);

    // TASK-13: Create an Integer object from an int
    int myInt = 20;
    Integer myInteger = Integer.valueOf(myInt);

  }

}
