package main.java.Day6Lambda;

public class LambdaPart2MethodReference {

    /*

    Method reference is a simplified form (short-cut) of Lambda Expression:

    Type of method references:
    1. References to a static method
    2. Reference to an instance ( non-static) method.
    3. Reference to a constructor

     */
    @FunctionalInterface
    interface Intr1 {
        void sayHello(String name);
    }
    interface Intr2 {
        int convertToNumber(String s);
    }
    interface Intr3 {
        void sayHello();
    }
    public static void func1(String s){
    System.out.println(s);
  }

  public static int func2(String s){
        return Integer.parseInt(s);
  }
    public  void func3(String s){
        System.out.println(s);
    }
 LambdaPart2MethodReference(){
    System.out.println("LambdaPart2MethodReference constructor called");
 }



  public static void main(String[] args) {
    //        1. References to a static method
    //        classNaem:: methodName

    // You can refer to static method defined in the claas as an implementation of a functional interface.
      Intr1 i1 = LambdaPart2MethodReference :: func1;

      i1.sayHello("meow meow meow meow");

     Intr2 i2 = LambdaPart2MethodReference :: func2;
    System.out.println(i2.convertToNumber("500"));

    Intr2 i3 = Integer::parseInt;
    System.out.println(i3.convertToNumber("679"));

    // using lambda expression

    Intr2 i4 = s-> Integer.parseInt(s);
    System.out.println(i4.convertToNumber("5453"));





    // 2. Reference to an instance ( non-static ) method
      // object :: methodName

      Intr1 i5 = new LambdaPart2MethodReference() :: func3;
      i5.sayHello("meow");

      Intr1 i6 = System.out :: print;
      i6.sayHello("mdfdf");





      // Reference to a constructor:
      // className :: new

      Intr3 i8 = LambdaPart2MethodReference :: new;
      i8.sayHello();




  }
}
