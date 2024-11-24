package com.jgg.lessons.p1090;

import com.jgg.lessons.p0590.Fox;
import java.util.ArrayList;

public class CreatingArraylistObject {

  public static void main(String[] args) {

    // Create an ArrayList of Integer
    ArrayList<Integer> numbers = new ArrayList<>();

    // Create an ArrayList of String
    ArrayList<String> names = new ArrayList<>();

    // Create an ArrayList of Character
    ArrayList<Character> characters = new ArrayList<>();

    // Create an ArrayList of primitive double
    //ArrayList<double> prices = new ArrayList<>();
    // not doable

    // Create an ArrayList of Fox
    ArrayList<Fox> foxes = new ArrayList<>();

    // Create an ArrayList of String with size 101
    ArrayList<String> addresses = new ArrayList<>(101);

  }
}
