package com.jgg.homework.p1530;

public class MethodOverriding2Solution {

  public static void main(String[] args){

    // TASK-1: Create <Vehicle> class with calculateConsumption() method
    //         which accepts <km> as int parameter and returns 0

    // TASK-2: Create <DieselVehicle> class which extends class <Vehicle>

    // TASK-3: Create an object of class <DieselVehicle> and
    //         call calculateConsumption() method by passing 220 as argument, print returned value
    DieselVehicle dieselVehicle = new DieselVehicle();
    int dieselConsumption = dieselVehicle.calculateConsumption(220);
    System.out.println("DieselVehicle consumption for 220 km: " + dieselConsumption); // 0

    // TASK-4: Override calculateConsumption() method in <DieselVehicle> class by returning <km/11>

    // TASK-5: Call calculateConsumption() method via newly created <DieselVehicle> object,
    //         print returned value
    dieselConsumption = dieselVehicle.calculateConsumption(220);
    System.out.println("DieselVehicle consumption for 220 km: " + dieselConsumption); // 20

    // TASK-6: Create <MyCar> class which extends <DieselVehicle>

    // TASK-7: Create an object of <MyCar> class and call calculateConsumption() method
    //         by passing 220 as argument, print returned value
    MyCar myCar = new MyCar();
    int myCarConsumption = myCar.calculateConsumption(220);
    System.out.println("MyCar consumption for 220 km: " + myCarConsumption); // 20

    // TASK-8: Override calculateConsumption() method in <MyCar> class by returning <km/15>

    // TASK-9: Call calculateConsumption() method via newly created <MyCar> object,
    //         print returned value
    myCarConsumption = myCar.calculateConsumption(220);
    System.out.println("MyCar consumption for 220 km: " + myCarConsumption); // 14

  }

}

class Vehicle {
  // Method in class Vehicle
  int calculateConsumption(int km) {
    return 0;
  }
}

class DieselVehicle extends Vehicle {
  // Overriding method in class DieselVehicle
  @Override
  int calculateConsumption(int km) {
    return km / 11;
  }
}

class MyCar extends DieselVehicle {
  // Overriding method in class MyCar
  @Override
  int calculateConsumption(int km) {
    return km / 15;
  }
}
