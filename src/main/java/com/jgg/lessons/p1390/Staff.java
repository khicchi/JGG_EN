package com.jgg.lessons.p1390;

  public class Staff {

    private String firstName;
    private String lastName;
    private int birthYear;

    public String getFullName() {
      return firstName + " " + lastName;
    }

    public void setFirstName(String value) {
      firstName = value;
    }

    public void setLastName(String value) {
      lastName = value;
    }
  }


