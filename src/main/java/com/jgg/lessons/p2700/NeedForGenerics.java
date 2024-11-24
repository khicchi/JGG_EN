package com.jgg.lessons.p2700;

import java.util.ArrayList;
import java.util.List;

public class NeedForGenerics {

  public static void main(String[] args) {

    // Create a List of Integers without specifying the type as Integer
    List list = new ArrayList();
    list.add(Integer.valueOf(1));
    // Integer fetchedValue = list.get(0);

  }

}
