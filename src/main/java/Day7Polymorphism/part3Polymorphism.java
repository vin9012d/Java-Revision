package main.java.Day7Polymorphism;
class Parent{

    public void age(){
        System.out.println("Parent age is 58");
    }

}

class Child extends Parent{

    public void age(){
        System.out.println("Childern age is 12");
    }
    public void childGf(){
        System.out.println("child has gf");
    }

}

class Mediator{

    public  void callAge(Parent p){
        p.age();
    }

}
public class part3Polymorphism {


        public static  void main(String[] args){
            Parent p=new Child();

            new Mediator().callAge(p); // decided at run time which method will be called
            // p.childGf(); Cannot resolve method 'childGf' in 'Parent'
            Child c = (Child)p; // need to downcast
            c.childGf();
            // recommended approach is using instance of

      /*
# Java `instanceof` – Short Interview Notes

## 1. What is `instanceof`?

* `instanceof` is a **binary operator** in Java
* It checks **runtime type** of an object
* Used mainly to ensure **safe downcasting**

---

## 2. Syntax

```java
object instanceof ClassName
```

* Returns `true` if object belongs to the class or its subclass
* Returns `false` otherwise

---

## 3. Why `instanceof` is Needed

* Prevents **ClassCastException**
* Used in **polymorphism scenarios**
* Helps identify actual object type at runtime

---

## 4. Example (Polymorphism Use Case)

```java
Parent p = new Child();

if (p instanceof Child) {
    Child c = (Child) p;
    c.childGf();
}
```

* Runtime check ensures casting is safe
* Best practice before downcasting

---

## 5. Without `instanceof` (Dangerous)

```java
Child c = (Child) p; // May throw ClassCastException
```

---

## 6. `instanceof` with Inheritance

```java
Child c = new Child();

c instanceof Child   // true
c instanceof Parent  // true
c instanceof Object  // true
```

* Works with parent classes
* JVM checks inheritance hierarchy

---

## 7. `instanceof` with `null`

```java
Parent p = null;
System.out.println(p instanceof Parent); // false
```

* Always returns `false`
* Does NOT throw NullPointerException

---

## 8. What `instanceof` Cannot Do

* ❌ Cannot be used with **primitive types**
* ❌ Cannot check **compile-time reference type**
* ❌ Cannot be used between **unrelated classes**

---

## 9. Interview Rules to Remember

* Casting without `instanceof` can crash at runtime
* Variables are resolved at compile time, methods at runtime
* `instanceof` checks actual object, not reference

---

## 10. One-Line Interview Answer ⭐

> **`instanceof` is used to check an object’s runtime type before downcasting to avoid `ClassCastException`.**

         */
            if (p instanceof Child) { // true
                Child d = (Child) p;
                d.childGf();
            }

            Parent f = new Parent();
            if(f instanceof Child){ // false
                System.out.println("child instance");
            }

            Parent newp = new Child();

            newp.age(); // decided at run time which method will be called
            // it will call the child class method because of polymorphism
            //// Method call is decided at run time (runtime polymorphism / dynamic method dispatch)
            // Reference type is Parent, but object type is Child
            // JVM checks the object created (Child) and calls the Child class method instead of Parent method





        }


}
