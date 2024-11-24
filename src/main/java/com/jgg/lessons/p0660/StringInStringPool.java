package com.jgg.lessons.p0660;

public class StringInStringPool {

  public static void main(String[] args){

    // JVM checks the String Pool and creates a new instance
    // if there is no String with "hi" value created before
    String str1 = "hi";

    // JVM does not check the String Pool, it directly creates
    // a new instance even there is an instance with the same value
    String str2 = new String("hi");

    // equals() method compares the value of String object,
    // It does not compare the references
    System.out.println(str1.equals(str2)); // true
    // str1 and str2 are two different String objects,
    // but their values is the same

    // == operator compares the reference address, not the values
    System.out.println(str1 == str2); // false

    String str3 = new String("hi");
    System.out.println(str2.equals(str3)); // true

    System.out.println(str2 == str3); // false

    String str4 = "hi";
    System.out.println(str1 == str4); // true

  }
}
