package main.java.Day6Lambda;

public class LambdaPart1 {
  /*

  An interface which has only one abstract method is called as functional interface

  This functional interface can have any number of default, static methods , but can Contains only one abstract method.


  Functional intereface is also known as single abstract method interfaces or sam interfaces. It is a new feature in java 8, which helps to achieve functional programming approach.
  Note: Functional interface and extends another interface only when it does not have any abstract method.

  Note: its recommended that all functional interfaces have an informative @FunctionalInterface annotation.  This throws an erros if interface does not satisfy the condition

  @FurnctionalInterface
  interface Intr{
  void sayHello(String name);
  }
   */
  interface Intr {
    void sayHello(String name);

  }

  interface AddI {
    int add(int a, int b);
  }

  public static void main(String[] args) {
    // Implementing a functional interface using Annonymous Inner class;

    Intr i1 = new Intr() { // annonymous inner class
          @Override
          public void sayHello(String name) {}
        };
    i1.sayHello("rita");

    // Lambda expression in java

    Intr i2 =
        (String name) -> {
          System.out.println(name);
        };
    i2.sayHello("vinod");

    // in case of single parameter () is also an optional ( in case of zero or more than one () is
    // compoulsary
    Intr i3 =
        name -> {
          System.out.println(name);
        };
    i3.sayHello("meow");

    // when there is a single statement in the body curly braces {} are not compoulsory
    Intr i4 = name -> System.out.println(name);
    i4.sayHello("seema");

    // even if thee is return but only one line statement we can skip {} and also skip return
    // keyword
    AddI a1 =
        (a, b) -> {
          return a + b;
        };

    AddI a2 = (a, b) -> a + b;
    a2.add(5,10);



    // Matching a Lambda Expression against the functional interface is divided into four steps:
    // 1. Interface should have only one abstract method
    // 2. Number of parameters of the Lambda Expression must match with the number of parameters of
    // the method inside the interface
    // 3.Type of parameters should also match
    // 4.return type of the Lambda Expression should also match with the medhod defined in the
    // interface

    // sending lambda function as an argument to the method
    fun1((n1, n2) -> n1 + n2);

    // returning lambda function from a method
    System.out.println(fun2().add(5, 9));
  }

  public static void fun1(AddI a1) {
    System.out.println(a1.add(5, 10));
  }

  public static AddI fun2() {
    return (n1, n2) -> n1 + n2;
  }
}
