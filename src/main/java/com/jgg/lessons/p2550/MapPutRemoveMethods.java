package com.jgg.lessons.p2550;

import java.util.HashMap;

public class MapPutRemoveMethods {

  public static void main(String[] args){

    // Create an <String, String> HashMap and add items
    HashMap<String, String> teachers = new HashMap<>();
    teachers.put("John", "Maths");
    teachers.put("Jane", "Physics");
    teachers.put("Michael", "Chemistry");
    System.out.println(teachers);
    // {Michael=Chemistry, John=Maths, Jane=Physics}

    // Get the profession of Jane
    String janeProfession = teachers.get("Jane");
    System.out.println(janeProfession); // Physics

    // Get the profession of Michael
    System.out.println(teachers.get("Michael")); // Chemistry

    // Remove key "John"
    String removedValue = teachers.remove("John");
    System.out.println(removedValue); // Maths
    System.out.println(teachers); // {Michael=Chemistry, Jane=Physics}

  }
}
