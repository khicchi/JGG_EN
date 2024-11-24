package com.jgg.homework.p0730;

public class StringReplaceSolution {

  public static void main(String[] args){

    String asBlueAsSky = "as blue as sky";

    // TASK-1: Replace "as" with "like" in "as blue as sky"
    String result = asBlueAsSky.replace("as", "like");
    System.out.println(result); // like blue like sky

    System.out.println("************************** TASK 1 FINISHED **************************");

    // TASK-2: Replace "a" with "000" in "as blue as sky"
    result = asBlueAsSky.replace("a", "000");
    System.out.println(result); // 000s blue 000s sky

    System.out.println("************************** TASK 2 FINISHED **************************");

    // TASK-3: Replace "b" with "000" in "as blue as sky"
    result = asBlueAsSky.replace("b", "000");
    System.out.println(result); // as 000lue as sky

    System.out.println("************************** TASK 3 FINISHED **************************");

  }

}
