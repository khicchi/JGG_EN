package com.jgg.homework.p1200;

import java.util.ArrayList;

public class ArrayListExamples1Solution {

  public static void main(String[] args){

    ArrayList<Car> cars = Car.getCars();

    // TASK-1: Given a list of <cars>
    //         Print the count of cars.
    System.out.println(cars.size());

    System.out.println("************************** TASK 1 FINISHED **************************");

    // TASK-2: Print the details of the first car in the list
    cars.get(0).printDetails();

    System.out.println("************************** TASK 2 FINISHED **************************");

    // TASK-3: Print the details of the first Honda in the list.
    for (Car car: cars) {
      if (car.make.equals("Honda")) {
        car.printDetails();
        break;
      }
    }

    System.out.println("************************** TASK 3 FINISHED **************************");

    // TASK-4: Print the details of all cars whose make is Honda.
    for (Car car: cars) {
      if (car.make.equals("Honda")) {
        car.printDetails();
      }
    }

    System.out.println("************************** TASK 4 FINISHED **************************");

    // TASK-5: Print the id of all cars whose year is 2020.
    for (Car car: cars) {
      if (car.year == 2020) {
        System.out.println(car.id);
      }
    }

    System.out.println("************************** TASK 5 FINISHED **************************");

    // TASK-6: Print the details of all cars whose color is white.
    for (Car car: cars) {
      if (car.color == Color.WHITE) {
        car.printDetails();
      }
    }

    System.out.println("************************** TASK 6 FINISHED **************************");

    // TASK-7: Print the id of the car whose km is the highest.
    Car targetCar = cars.get(0);
    for(int i = 1; i < cars.size(); i++) {
      if (cars.get(i).km > targetCar.km) {
        targetCar = cars.get(i);
      }
    }
    System.out.println(targetCar.id);

    System.out.println("************************** TASK 7 FINISHED **************************");

    // TASK-8: Print the id of the car whose price is the lowest.
    targetCar = cars.get(0);
    for(int i = 1; i < cars.size(); i++) {
      if (cars.get(i).price < targetCar.price) {
        targetCar = cars.get(i);
      }
    }
    System.out.println(targetCar.id);

    System.out.println("************************** TASK 8 FINISHED **************************");

    // TASK-9: Print the id of all Toyota Corolla.
    for (Car car: cars) {
      if (car.make.equals("Toyota") && car.model.equals("Corolla")) {
        System.out.println(car.id);
      }
    }

    System.out.println("************************** TASK 9 FINISHED **************************");

    // TASK-10: Print the id of all cars whose km is smaller than 300.000 
    //          and color is WHITE or BLACK.
    for (Car car: cars) {
      if (car.km < 300000 && (car.color == Color.WHITE || car.color == Color.BLACK)) {
        System.out.println(car.id);
      }
    }

    System.out.println("************************** TASK 10 FINISHED **************************");

    // TASK-11: A client is looking for a car. Her tolerated km is 250.000.
    //          Print the id and the km of all matched cars.
    for (Car car: cars) {
      if (car.isKmTolerated(250000)) {
        System.out.println(String.format("id: %s, km: %s", car.id, car.km));
      }
    }

    System.out.println("************************** TASK 11 FINISHED **************************");

    // TASK-12: A client is looking for a car WHITE car. His tolerated km is 250.000.
    //          Print the id of all matched cars.
    for (Car car: cars) {
      if (car.color == Color.WHITE && car.isKmTolerated(250000)) {
        System.out.println(car.id);
      }
    }

    System.out.println("************************** TASK 12 FINISHED **************************");

  }

}
