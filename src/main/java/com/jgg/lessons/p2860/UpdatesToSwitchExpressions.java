package com.jgg.lessons.p2860;

public class UpdatesToSwitchExpressions {

  public static void main(String[] args) {

    // regular switch implementation
    int day = 3;
    String dayType;
    switch (day) {
      case 1:
      case 7:
        dayType = "Weekend";
        break;
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
        dayType = "Weekday";
        break;
      default:
        dayType = "Invalid day";
    }
    System.out.println(dayType);

    // updated switch implementation
    day = 3;
    dayType = switch (day) {
      case 1, 7 -> "Weekend";
      case 2, 3, 4, 5, 6 -> "Weekday";
      default -> "Invalid day";
    };
    System.out.println(dayType);

  }
}
