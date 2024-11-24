package com.jgg.lessons.p2740;

import java.util.ArrayList;
import java.util.List;

  public class LambdaExpressionExamples4 {

    public static void main(String[] args) {

      MyInterface myInterface = l -> {
        List<Integer> newList = new ArrayList<>();
        newList.addAll(l);
        newList.addAll(l);
        return newList;
      };

      List<Integer> myList = new ArrayList<>();
      myList.add(1); myList.add(2);

      System.out.println(myInterface.doubleList(myList));
    }

  }

  interface MyInterface {
    List<Integer> doubleList(List<Integer> list);
  }
