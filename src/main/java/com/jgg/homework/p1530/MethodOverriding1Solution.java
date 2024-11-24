package com.jgg.homework.p1530;

public class MethodOverriding1Solution {

  public static void main(String[] args){

    // TASK-1: Create class <A>, create print() method
    //         which accepts no parameter and returns String "this is class A"

    // TASK-2: Create class <B> which extends class <A>

    // TASK-3: Override print() method by returning String "this is class B"

    // TASK-4: Create an object of class <A>, call print() method
    A aObject = new A();
    System.out.println(aObject.print()); // Output: "this is class A"

    // TASK-5: Create an object of class <B>, call print() method
    B bObject = new B();
    System.out.println(bObject.print()); // Output: "this is class B"

    // TASK-6: Explain why "this is class B" printed
    //         when the print() method is called via class <B> object

    /* When a method is overridden in a subclass, the version of the method
       that gets called is determined by the actual type of the object, not the type of the reference.
       This is known as dynamic method dispatch or runtime polymorphism.

       In this case, the print() method in class B overrides the print() method in class A.
       When you call the print() method on an object of class B,
       the overridden version of the method in class B is executed,
       even though the method was originally defined in class A.

       Thus, when you create an instance of B and call the print() method,
        the JVM dynamically dispatches the call to the overridden method in class B,
        resulting in "this is class B" being printed.

        This demonstrates the principle of polymorphism in object-oriented programming,
        where the method that gets executed depends on the actual object type at runtime. */
  }

}

class A {
  // Method in class A
  String print() {
    return "this is class A";
  }
}

class B extends A {
  // Overriding method in class B
  @Override
  String print() {
    return "this is class B";
  }
}