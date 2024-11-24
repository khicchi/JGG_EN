package com.jgg.lessons.p2350;

public class Main {

  public static void main(String[] args){

    String username = " ";

    if (username == null || username.isBlank()) {
      throw new ImproperUsernameException("Username can not be empty");
    }

  }

}
