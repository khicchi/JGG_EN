package com.jgg.homework.p1220;

import java.util.ArrayList;

public class ConstructorExamples8Solution {

  public static void main(String[] args){

    // TASK-1: Create a <Room> class with those instance fields: length as double, width as double.
    //         Create a <getInfo> method which returns the instance variable values in a good format as String.
    //         Create a <getArea> method which returns the area of the room as double.

    // TASK-2: Create a <Kitchen> class with those instance fields: length as double, width as double, hasSink as Boolean.
    //         Create a <getInfo> method which returns the instance variable values in a good format as String.
    //         Create a <getArea> method which returns the area of the kitchen as double.

    // TASK-3: Create a <House> class with those instance fields: an ArrayList of Room, kitchen as Kitchen.
    //         Create a <getInfo> method which returns the instance variable values in a good format as String.
    //         Create a <getArea> method which returns the sum of the rooms and the kitchen as double.

    // TASK-4: Create 3 House objects: <house1>, <house2>, <house3>
    //         Use those values:
    // <house1> => rooms: [{length: 2, width: 3}, {length: 2, width: 2.2}], kitchen: {length: 3, width: 2.7, hasSink: false}
    // <house1> => rooms: [{length: 1.3, width: 1.7}, {length: 2, width: 4.2}, {length: 1, width: 1.2}], kitchen: {length: 2, width: 4.7, hasSink: false}
    // <house1> => rooms: [{length: 2.3, width: 2.7}], kitchen: {length: 3, width: 3, hasSink: true}
    // House 1
    ArrayList<Room> rooms1 = new ArrayList<>();
    rooms1.add(new Room(2, 3));
    rooms1.add(new Room(2, 2.2));
    Kitchen kitchen1 = new Kitchen(3, 2.7, false);
    House house1 = new House(rooms1, kitchen1);

    // House 2
    ArrayList<Room> rooms2 = new ArrayList<>();
    rooms2.add(new Room(1.3, 1.7));
    rooms2.add(new Room(2, 4.2));
    rooms2.add(new Room(1, 1.2));
    Kitchen kitchen2 = new Kitchen(2, 4.7, false);
    House house2 = new House(rooms2, kitchen2);

    // House 3
    ArrayList<Room> rooms3 = new ArrayList<>();
    rooms3.add(new Room(2.3, 2.7));
    Kitchen kitchen3 = new Kitchen(3, 3, true);
    House house3 = new House(rooms3, kitchen3);

    // TASK-5: Call <getInfo> method for all 3 objects
    System.out.println("House 1 Info:");
    System.out.println(house1.getInfo());
    System.out.println("House 2 Info:");
    System.out.println(house2.getInfo());
    System.out.println("House 3 Info:");
    System.out.println(house3.getInfo());

    System.out.println("************************** TASK 5 FINISHED **************************");

    // TASK-6: Find the house which has the max area using <getArea> method of the House objectand print its details
    // Hint: use loops
    House maxHouse = house1;
    double maxArea = house1.getArea();

    for (House house : new House[]{house2, house3}) {
      double area = house.getArea();
      if (area > maxArea) {
        maxArea = area;
        maxHouse = house;
      }
    }

    System.out.println("House with the max area:");
    System.out.println(maxHouse.getInfo());
    System.out.println("Max Area: " + maxHouse.getArea());

    System.out.println("************************** TASK 6 FINISHED **************************");
  }

}

class Room {
  private double length;
  private double width;

  // TASK-1: Constructor to initialize length and width
  public Room(double length, double width) {
    this.length = length;
    this.width = width;
  }

  // TASK-1: Method to return instance variable values in a formatted string
  public String getInfo() {
    return "Length: " + length + ", Width: " + width;
  }

  // TASK-1: Method to return the area of the room
  public double getArea() {
    return length * width;
  }
}

class Kitchen {
  private double length;
  private double width;
  private Boolean hasSink;

  // TASK-2: Constructor to initialize length, width, and hasSink
  public Kitchen(double length, double width, Boolean hasSink) {
    this.length = length;
    this.width = width;
    this.hasSink = hasSink;
  }

  // TASK-2: Method to return instance variable values in a formatted string
  public String getInfo() {
    return "Length: " + length + ", Width: " + width + ", Has Sink: " + hasSink;
  }

  // TASK-2: Method to return the area of the kitchen
  public double getArea() {
    return length * width;
  }
}

class House {
  private ArrayList<Room> rooms;
  private Kitchen kitchen;

  // TASK-3: Constructor to initialize rooms and kitchen
  public House(ArrayList<Room> rooms, Kitchen kitchen) {
    this.rooms = rooms;
    this.kitchen = kitchen;
  }

  // TASK-3: Method to return instance variable values in a formatted string
  public String getInfo() {
    StringBuilder info = new StringBuilder("Rooms:\n");
    for (Room room : rooms) {
      info.append(room.getInfo()).append("\n");
    }
    info.append("Kitchen: ").append(kitchen.getInfo());
    return info.toString();
  }

  // TASK-3: Method to return the total area of the house (sum of rooms and kitchen)
  public double getArea() {
    double totalArea = kitchen.getArea();
    for (Room room : rooms) {
      totalArea += room.getArea();
    }
    return totalArea;
  }
}