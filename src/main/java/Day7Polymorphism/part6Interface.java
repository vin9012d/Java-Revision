package main.java.Day7Polymorphism;

public class part6Interface {

    // In java interface can have following methods
    // private
    // default no access modifier

    // default word if we use then we must have to give body as well, we can override if we want in implementation


    // in abstract class we dont have a method with default keyword

    // in interface if there is no access modifier for the method then java compiler makes it public abstract before the method;
    //and for variable it adds public static final
    /*
    ) One interface can extend how many interfaces?

Unlimited (multiple interfaces allowed)

interface A { }
interface B { }
interface C { }

interface D extends A, B, C {
}

One class can implement how many interfaces?

Unlimited again.

interface A { }
interface B { }
interface C { }

class Test implements A, B, C {
}

Case 1: Two interfaces have the same method

interface A {
    void show();
}

interface B {
    void show();
}

Now a class implements both:
class Test implements A, B {

    public void show() {
        System.out.println("Hello");
    }
}

What happens?

No problem at all ✅

Because:

both interfaces only declare the method
class just gives one implementation

Case 2: One interface extends another and both have same method
interface A {
    void show();
}

interface B extends A {
    void show();
}
What happens?

Still no problem ✅

Because:

B is just repeating the same method
Class only needs to implement it once
class Test implements B {

    public void show() {
        System.out.println("Hello");
    }
}

When does a problem actually happen?

Only when both interfaces have default methods with the same name

Example:

interface A {
    default void show() {
        System.out.println("A");
    }
}

interface B {
    default void show() {
        System.out.println("B");
    }
}
Now class must override it:
class Test implements A, B {

    public void show() {
        System.out.println("Own implementation");
    }
}

Final rule (easy to remember)
Situation	Result
Same abstract method in 2 interfaces	No problem
Interface extends another with same method	No problem
Same default method in 2 interfaces	Must override
     */

    /*
    Default Method in Interface
Definition

A method with implementation inside interface

interface Test {
    default void m1() {
        System.out.println("Hello");
    }
}
Key Points
Has a method body
Class is NOT forced to override it
Can be overridden
Called using object
Used to add new methods without breaking old code


Static Method in Interface
Definition

A method that belongs only to the interface
interface Test {
    static void m1() {
        System.out.println("Hello");
    }
}

Key Points
Has a method body
Cannot be overridden
Not inherited by implementing class
Called using interface name
Used for utility/helper methods
Quick Comparison Table
Feature	Default Method	Static Method
Has body	        Yes	             Yes
Must override	    No	          No
Can override	    Yes            No
Inherited by class	Yes 	    No
How to call	object	InterfaceName.method()
     */

}
