package com.jgg.lessons.p1160;

import java.util.ArrayList;

public class ArrayListContainsAll {

  public static void main(String[] args){

    ArrayList<Integer> nums1 = new ArrayList<>();
    nums1.add(4); nums1.add(3); nums1.add(2);
    ArrayList<Integer> nums2 = new ArrayList<>();
    nums2.add(3); nums2.add(2);
    ArrayList<Integer> nums3 = new ArrayList<>();
    nums3.add(2); nums3.add(3);

    // Check if <nums1> contains all elements of <nums2>
    System.out.println("nums1.containsAll(nums2) = " + nums1.containsAll(nums2));
    // true

    // Check if <nums1> contains all elements of <nums3>
    System.out.println("nums1.containsAll(nums3) = " + nums1.containsAll(nums3));
    // true

    // Check if <nums3> contains all elements of <num1>
    System.out.println("nums3.containsAll(nums1) = " + nums3.containsAll(nums1));
    //false

  }
}
