package com.jgg.homework.p1400;

public class InheritanceSolution {

  public static void main(String[] args){

    // TASK-1: Create class <A> with an instance field; int a

    // TASK-2: Create class <B> which extends class <A> and defines an instance field; int b

    // TASK-4: Create class <C> which extends class <A> and defines an instance field; int c

    // TASK-5: Create an object of class <C> and print <a> of parent class via <C> object
    C cObject = new C();
    System.out.println("Initial value of a in C object: " + cObject.a); // Output: 0

    // TASK-6: Update <a> of class <A> via <C> object and print <a> of parent class via <C> object
    cObject.a = 10;
    System.out.println("Updated value of a in C object: " + cObject.a); // Output: 10

    // TASK-7: Create an object of class <B> and print <a> of parent class via <B> object
    B bObject = new B();
    System.out.println("Initial value of a in B object: " + bObject.a); // Output: 0

    // TASK-8: Explain why <a> of class <A> is 0 when printed via <B> object.
    //         Don't you think we updated the <a> with <C> object?
    /* The a field in class A is an instance variable,
       meaning each instance of a class that extends A (like B or C) has its own separate copy of a.
       When you create an object of class C and update a in that object,
       it only affects the a field in that particular instance of C.
       It does not affect the a field in any other instance of A or its subclasses.

       Therefore, when you create a new object of class B,
       it has its own a field which is initialized to 0 by the default constructor of class A.
       The update made to the a field in the C object does not carry over to the B object
       because they are separate instances, each with its own a field. */
  }

}

class A {
  int a;
}

class B extends A {
  int b;
}

class C extends A {
  int c;
}
