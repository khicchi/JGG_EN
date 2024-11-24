package com.jgg.lessons.p0590;

  public class ThiefFoxSolution {

    public static void main(String[] args){
      Fox fox1 = new Fox();
      fox1.foxNumber = 1;     fox1.isWearCoat = true;
      fox1.hasATorch = true;  fox1.coatColor = "BLACK";   fox1.bagCount = 0;

      Fox fox2 = new Fox();
      fox2.foxNumber = 2;     fox2.isWearCoat = true;
      fox2.hasATorch = true;  fox2.coatColor = "BLACK";   fox2.bagCount = 2;

      Fox fox3 = new Fox();
      fox3.foxNumber = 3;      fox3.isWearCoat = true;
      fox3.hasATorch = true;   fox3.coatColor = "BLACK";   fox3.bagCount = 3;

      Fox fox4 = new Fox();
      fox4.foxNumber = 4;     fox4.isWearCoat = false;
      fox4.hasATorch = true;   fox4.coatColor = "GRAY";    fox4.bagCount = 3;

      System.out.println("Fox number " + fox1.foxNumber + " is suspect: " + isSuspect(fox1));
      System.out.println("Fox number " + fox2.foxNumber + " is suspect: " + isSuspect(fox2));
      System.out.println("Fox number " + fox3.foxNumber + " is suspect: " + isSuspect(fox3));
      System.out.println("Fox number " + fox4.foxNumber + " is suspect: " + isSuspect(fox4));

    }

    public static boolean isSuspect(Fox fox){
      return fox.isWearCoat && fox.coatColor.equals("BLACK") && fox.hasATorch && fox.bagCount == 3;
    }
  }
