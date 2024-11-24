package com.jgg.lessons.p0330;

public class NestedIfStatementExamples {

  public static void main(String[] args){
    int sizeChoice = 2; // defines SIZE
    int typeChoice = 3; // defines TYPE
    // Given the inputs above,
    // SIZE => 1 is Small, 2 is Medium, 3 is Large
    // TYPE => 1 is "Black", 2 is "Latte", 3 is "Cappuccino"
    // There is no guarantee that the inputs will be in their ranges
    // Print for correct ranges: "Your <SIZE> <TYPE> is ready. Enjoy!"
    // Print for incorrect ranges: "We do not have such choice!"

    if ((sizeChoice >= 1 && sizeChoice <= 3) &&
        (typeChoice >= 1 && typeChoice <=3)) {
      String sizeString;
      if (sizeChoice == 1)
        sizeString = "Small";
      else if (sizeChoice == 2)
        sizeString = "Medium";
      else
        sizeString = "Large";

      String typeString;
      if (typeChoice == 1)
        typeString = "Black";
      else if (typeChoice == 2)
        typeString = "Latte";
      else
        typeString = "Cappuccino";

      System.out.println("Your " + sizeString + " " +
                                typeString + " is ready. Enjoy!");
    }
    else {
      System.out.println("We do not have such choice!");
    }
  }

}
