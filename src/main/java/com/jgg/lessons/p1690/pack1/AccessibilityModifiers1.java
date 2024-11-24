package com.jgg.lessons.p1690.pack1;

  public class AccessibilityModifiers1 {
    public static void main(String[] args){
      // accessing static variables
      // Planet.privateStaticField => not accessible
      System.out.println(Planet.protectedStaticField);
      System.out.println(Planet.defaultStaticField);

      // accessing instance variables
      Planet planet = new Planet();
      // planet.privateInstanceField => not accessible
      System.out.println(planet.defaultInstanceField);
      System.out.println(planet.protectedInstanceField);
    }
  }
