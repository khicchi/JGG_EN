package com.jgg.lessons.p2850;

import java.util.ArrayList;

public class TypeInferenceVar {

  public static void main(String[] args) {

    var message = "Hello, World!";  // Inferred as String
    var number = 42;                // Inferred as int
    var list = new ArrayList<String>();  // Inferred as ArrayList<String>

    // var invalid;  // Compilation error: Type cannot be inferred

    var num = 10;  // Inferred as int
    // num = "Text";  // Compilation error: Type mismatch

  }
}
