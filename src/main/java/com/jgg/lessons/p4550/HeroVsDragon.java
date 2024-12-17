package com.jgg.lessons.p4550;

import java.util.Random;
import java.util.Scanner;

public class HeroVsDragon {

  public static void main(String[] args) throws InterruptedException {
    Scanner scanner = new Scanner(System.in);

    // Getting the Hero name
    System.out.print("Enter the Hero name: ");
    String heroName = scanner.nextLine();

    // Strength values
    int heroHealth = 100;
    int dragonHealth = 100;

    System.out.println("\nBattle is starting!\n");

    // Battle loop
    while (heroHealth > 0 && dragonHealth > 0) {
      // Damages
      int heroDamage = getRandomDamage();
      int dragonDamage = getRandomDamage();

      // Updating the strengths
      heroHealth -= dragonDamage;
      dragonHealth -= heroDamage;

      // Status information
      if (heroHealth >= dragonHealth)
        System.out.println(heroName + ": " + heroHealth + " >>>>> Dragon: " + dragonHealth);
      else
        System.out.println("Dragon: " + dragonHealth + " >>>>> " + heroName + ": " + heroHealth);

      Thread.sleep(1500);
    }

    // Determining the winner
    if (heroHealth == dragonHealth) {
      System.out.println("No winner!");
    }
    else if (heroHealth <= 0 && dragonHealth <= 0) {
      System.out.println("No winner! Both died :(");
    }
    else {
      if (heroHealth > 0)
        System.out.printf("Congrats %s! You have beaten the Dragon!%n", heroName);
       else
        System.out.println("The dragon won the battle! You may have come later...");
    }

    scanner.close();
  }

  private static int getRandomDamage() {
    return new Random().nextInt(6) + 5; // Damage between 5 and 10 (inclusive)
  }

}
