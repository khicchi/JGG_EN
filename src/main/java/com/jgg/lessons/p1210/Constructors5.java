package com.jgg.lessons.p1210;

  public class Constructors5 {

    public static void main(String[] args){
      City city1 =
          new City("Los Angeles", 423424324L, 234242424L);
    }
  }

  class City {
    public String name;
    public Long xCoordinate;
    public Long yCoordinate;

    City (String name) {
      this.name = name;
    }

    City (String name, Long xCoordinate, Long yCoordinate) {
      this(name); // calling the constructor above
      this.xCoordinate = xCoordinate;
      this.yCoordinate = yCoordinate;
    }

  }


