package com.jgg.lessons.p2585;

import java.util.LinkedHashMap;
import java.util.Map;

/*
Given a string, write a method to find the first non-repeating vowel (a, e, i, o, u) in it and return its index.
If it doesn't exist, return -1.
Assume that all the characters of the String is lowercase.
Do not use String class functions other than charAt() and length()
You can also try to solve with Map data structure like using a Map<Character, Integer> variable.
 */
public class MapProblem2 {

  public static void main(String[] args) {

    String input = "";
    System.out.println(getFirstNonRepeatingVowel(input));

    input = "xyz";
    System.out.println(getFirstNonRepeatingVowel(input));

    input = "Jason";
    System.out.println(getFirstNonRepeatingVowel(input));

    input = "responsible";
    System.out.println(getFirstNonRepeatingVowel(input));

  }

  public static int getFirstNonRepeatingVowel(String input) {
    Map<Character, Integer> map = new LinkedHashMap<>();
    for (int i = 0; i < input.length(); i++) {
      char currentChar = input.charAt(i); // get chars one by one
      if ("aeiou".contains("" + currentChar)) { // check if current char is vowel
        // “put” operation below will add the current vowel for it’s first occurrence
        // for the next occurrences; “put” operation will update the VALUE of the vowel
        map.put(currentChar, map.getOrDefault(currentChar, 0)+1 );
      }
    }
    for (Map.Entry<Character, Integer> each : map.entrySet()) {
      // iterate over map entries to find whose value is 1 (total occurrence)
      if (each.getValue() == 1){
        return input.indexOf(each.getKey());// key of the map is holding the vowel, just return it
      }
    }
    return -1; // if above operation not returns an index, then we can assume all vowels are repeated or there is no vowel, just return -1
  }


}
