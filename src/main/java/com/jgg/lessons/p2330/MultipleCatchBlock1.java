package com.jgg.lessons.p2330;

public class MultipleCatchBlock1 {

  public static void main(String[] args){
    int[] arr1 = {3, 7, 9}; // No exception
    System.out.println(divideAndReturn3thElement(arr1, 2)); // 4

    int[] arr2 = {3, 7, 9}; // ArithmeticException
    System.out.println(divideAndReturn3thElement(arr2, 0));

    int[] arr3 = {3, 7}; // ArrayIndexOutOfBoundsException
    System.out.println(divideAndReturn3thElement(arr3, 2));
  }

  static int divideAndReturn3thElement(int[] arr, int divisor) {
    try{
      int result = 0;

      for(int i = 0; i < arr.length; i++) {
        arr[i] = arr[i] / divisor;
      }

      return arr[2];
    } catch (ArithmeticException e) {
      System.out.println("Arithmetic Ex occurred. Check the inputs");
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Array size is smaller than 3");
    } catch (Exception e) {
      System.out.println("I am catching all un-caught exceptions");
    }

    return 0;
  }

}
