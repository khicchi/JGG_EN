package com.jgg.homework.p1200;

import java.time.LocalDate;
import java.util.ArrayList;

public class Car {

  public long id;
  public String make;
  public String model;
  public int year;
  public Color color;
  public double price;
  public int km;

  public int getAge() {
    return LocalDate.now().getYear() - year;
  }

  /**
   * This method returns true if the provided maxToleratedKm parameter is bigger than the car's km
   * Otherwise, returns false
   * @param maxToleratedKm
   * @return
   */
  public boolean isKmTolerated(int maxToleratedKm) {
    return km - maxToleratedKm < 0;
  }

  public void printDetails() {
    System.out.println("id = " + id);
    System.out.println("make = " + make);
    System.out.println("model = " + model);
    System.out.println("year = " + year);
    System.out.println("color = " + color);
    System.out.println("price = " + price);
    System.out.println("km = " + km);
    System.out.println("*******************");
  }

  public static ArrayList<Car> getCars() {
    Car car1 = new Car();
    car1.id = 1111111111111L;
    car1.make = "Toyota";
    car1.model = "Yaris";
    car1.year = 2020;
    car1.color = Color.BLACK;
    car1.price = 198000;
    car1.km = 20000;

    Car car2 = new Car();
    car2.id = 2222222222222L;
    car2.make = "Toyota";
    car2.model = "Corolla";
    car2.year = 2017;
    car2.color = Color.WHITE;
    car2.price = 223000;
    car2.km = 210000;

    Car car3 = new Car();
    car3.id = 33333333333333L;
    car3.make = "Toyota";
    car3.model = "Corolla";
    car3.year = 2003;
    car3.color = Color.WHITE;
    car3.price = 78500;
    car3.km = 323500;

    Car car4 = new Car();
    car4.id = 44444444444L;
    car4.make = "Honda";
    car4.model = "Civic";
    car4.year = 2020;
    car4.color = Color.GREEN;
    car4.price = 350400;
    car4.km = 12000;

    Car car5 = new Car();
    car5.id = 555555555555L;
    car5.make = "Honda";
    car5.model = "City";
    car5.year = 2015;
    car5.color = Color.GREEN;
    car5.price = 45000;
    car5.km = 523000;

    ArrayList<Car> cars = new ArrayList<>();
    cars.add(car1);
    cars.add(car2);
    cars.add(car3);
    cars.add(car4);
    cars.add(car5);

    return cars;
  }
}
