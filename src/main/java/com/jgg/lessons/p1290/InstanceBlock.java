package com.jgg.lessons.p1290;

  public class InstanceBlock {

    public static void main(String[] args){

      Student student = new Student("Jane");
      System.out.println(student.getSchoolName());
    }
  }

  class Student{
    private String name;
    private String schoolName;

    // Instance block
    {
      schoolName = "XYZ College";
      System.out.println("Instance block executed");
    }

    Student(String name) {
      this.name = name;
      System.out.println("Constructor Executed");
    }

    public String getSchoolName() {
      return schoolName;
    }
  }
