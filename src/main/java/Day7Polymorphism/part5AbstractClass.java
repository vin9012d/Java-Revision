package main.java.Day7Polymorphism;

public class part5AbstractClass {
    /*
    What is an Abstract Class?
An abstract class in Java is a class that cannot be instantiated on its own. Instead, it serves as a base for other classes to extend.
Think of it as a partially completed house: it has the foundation and structure, but it needs walls, windows, and a roof to be livable.

In Java, you declare an abstract class using the abstract keyword.
 This allows you to define both concrete methods (methods with implementation) and abstract methods (methods without implementation).

 abstract class Shape {
    String color;

    // Constructor
    Shape(String color) {
        this.color = color;
    }

    // Concrete method
    void displayColor() {
        System.out.println("Color: " + color);
    }

    // Abstract method
    abstract double area();
}

Benefits of Using Abstract Classes
Utilizing abstract classes provides several advantages:

Code Reusability: You can define common behavior in the abstract class, reducing redundancy in subclasses.
Polymorphism: You can treat different subclasses as their abstract class type, allowing for flexible and generic programming.
Enforcing Standards: By defining abstract methods, you ensure that all subclasses implement certain methods, maintaining a consistent interface.



class Circle extends Shape {
    double radius;

    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius; // Area of circle
    }
}

class Rectangle extends Shape {
    double width;
    double height;

    Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height; // Area of rectangle
    }
}

Best Practices
To make the most out of abstract classes, consider these best practices:

Use When Common Functionality Exists: Abstract classes are ideal when you have a set of related classes that share common behavior.
Keep It Simple: An abstract class should not become too complex. If it has too many responsibilities, consider breaking it down or using interfaces where appropriate.
Document the Abstract Methods: Since subclasses must implement abstract methods, clear documentation helps ensure correct implementation.


 * Calculates the area of the shape.
 *
 * @return the area as a double

    abstract double area();
     */



/*

    What Are Abstract Methods?
    Abstract methods are methods that are declared without an implementation.
    They serve as a blueprint for subclasses, forcing them to provide specific behavior.
     Just like we discussed with abstract classes, abstract methods are crucial for enforcing a contract in your class hierarchy.

    When you declare an abstract method, you're saying, "Any subclass must implement this method."
    This is particularly useful when you have a common interface that various subclasses should follow but each subclass might implement the method differently.

    Syntax of Abstract Methods
Here’s how to declare an abstract method in Java:

abstract class Animal {
    abstract void makeSound(); // abstract method
}

Key Differences
Abstract Method: Belongs to an abstract class and can have a mix of abstract methods and concrete methods.
Interface: Can only have abstract methods (prior to Java 8) and is a contract that classes can implement. Interfaces allow multiple inheritance and can be used to achieve loose coupling.
When to Use Which
Use abstract methods in an abstract class when you want to share common code and enforce certain behaviors in subclasses.
Use interfaces when you want to define a contract that can be implemented by any class, regardless of where it sits in the class hierarchy.

Understanding these concepts will give you a solid foundation as you move into the next chapter.

 */
}
