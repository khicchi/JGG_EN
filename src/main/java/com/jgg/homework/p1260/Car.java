package com.jgg.homework.p1260;

public class Car {
  // Private instance fields
  private String make;
  private Integer year;

  // Constructor which uses setters to assign values
  public Car(String make, Integer year) {
    setMake(make);
    setYear(year);
  }

  // Getter for make
  public String getMake() {
    return make;
  }

  // Setter for make with validation
  public void setMake(String make) {
    if (make != null && !make.trim().isEmpty()) {
      this.make = make;
    }
  }

  // Getter for year
  public Integer getYear() {
    return year;
  }

  // Setter for year with validation
  public void setYear(Integer year) {
    if (year != null && year <= 2025) {
      this.year = year;
    }
  }
}

