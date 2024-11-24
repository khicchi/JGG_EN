package com.jgg.lessons.p2710;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceAsGeneric {

  public static void main(String[] args) {

    // Type of the interface is declared
    List<Integer> list = new ArrayList();
    list.add(Integer.valueOf(1));
    Integer fetchedValue = list.get(0);

  }

}
