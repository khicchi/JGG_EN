package com.jgg.lessons.p0600;

public class AccessingAnObjectDataAndMethods {

  public static void main(String[] args){

    Student student = new Student();
    System.out.println("student.firstName = " + student.firstName);
    System.out.println("student.id = " + student.id);
    System.out.println("student.isScienceMajor = " + student.isScienceMajor);
    System.out.println("student.mainBlock = " + student.mainBlock);


    Student jane = new Student();
    jane.firstName = "Jane";    jane.lastName = "Doe";
    jane.id = 323424;           jane.entranceYear = 2023;
    jane.isScienceMajor = true; jane.mainBlock = 'C';

    System.out.println(jane.getFullName());
    System.out.println(jane.passesLesson(55));
  }

}
