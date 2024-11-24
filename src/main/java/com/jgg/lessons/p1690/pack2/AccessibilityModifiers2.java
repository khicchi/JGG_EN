package com.jgg.lessons.p1690.pack2;

import com.jgg.lessons.p1690.pack1.Planet;

  public class AccessibilityModifiers2 {
    public static void main(String[] args){
      // accessing static variables
      // Planet.privateStaticField => not accessible
      // protectedStaticField  => not accessible
      // defaultStaticField  => not accessible

      // accessing instance variables
      Planet planet = new Planet();
      // planet.privateInstanceField => not accessible
      // planet.defaultInstanceField => not accessible
      // planet.protectedInstanceField => not accessible
    }
  }
