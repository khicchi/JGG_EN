package com.jgg.lessons.p2360;

  // Checked Exception
  public class RestrictedAgeException extends Exception {

    RestrictedAgeException() {
      super("Age under 18 is restricted");
    }

  }
