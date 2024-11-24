package com.jgg.lessons.p1410;

  public class DieselEngine extends Engine {
    private boolean hasTurbocharger;

    public void printHorsePower() {
    System.out.println(horsepower);
    }

    public void getDisplacement() {
    System.out.println(displacement);
    }

    public void getNumberOfEngines() {
      //System.out.println(numberOfEngines);
      // numberOfEngines is not accessible
    }
  }
