package com.jgg.homework.p0510;

public class HierarchicalMethodCallsSolution {

  public static void main(String[] args){

    // TASK: Create initiateProcess() method as a root method.
    // initiateProcess() should call executeMainTask() method.
    // executeMainTask() method should call these methods in order;
    // performPreTask(), performMainOperation() and performPostTask().
    // Each method should be public static and void.
    // Each method should print what it is responsible for.
    // Call root method

    initiateProcess();
  }

  // Root method
  public static void initiateProcess() {
    System.out.println("Initiating process...");
    executeMainTask();
  }

  public static void executeMainTask() {
    System.out.println("Executing main task...");
    performPreTask();
    performMainOperation();
    performPostTask();
  }

  public static void performPreTask() {
    System.out.println("Performing pre-task operations...");
  }

  public static void performMainOperation() {
    System.out.println("Performing main operation...");
  }

  public static void performPostTask() {
    System.out.println("Performing post-task operations...");
  }

}
