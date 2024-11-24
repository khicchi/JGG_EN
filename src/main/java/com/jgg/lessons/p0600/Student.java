package com.jgg.lessons.p0600;

  public class Student {

    public String firstName;
    public String lastName;
    public long id;
    public short entranceYear;
    public boolean isScienceMajor;
    public char mainBlock;

    public String getFullName() {
      return firstName + " " + lastName;
    }

    public boolean passesLesson(int score) {
      if (isScienceMajor) {
        if (score >= 60) {
          return true;
        }
        else {
          return false;
        }
      }
      else {
        if (score >= 50) {
          return true;
        }
        else {
          return false;
        }
      }
    }

  }

