package main.java.Day7Polymorphism;

public class part1 {
    int a = 5;
    int b = 10;
    int c = 15;
    String name = "vinod";

    public static void main() {
        part1 obj = new part1(); // here when we create a new object then
        // step 1: Class loading phase
        /*
        When the JVM loads the class:
        public class part1
        Only the class structure is loaded:

variable names
their types
method definitions

But no object exists yet, so these variables are not assigned their values yet.
         */

        // step 2: Object creation phase (runtime)
        //When you create an object:

        /*
        part1 obj = new part1();
        Then Java does this internally:

Memory is allocated for the object
Default values are assigned
int a = 0
int b = 0
int c = 0
String name = null
After that, the instance initializers run
int a = 5;
int b = 10;
int c = 15;
String name = "vinod";
So "vinod" gets assigned at runtime when the object is created ✔️

         */
        // Step 3: 3️⃣ Important point
        //If you never create an object:
        /*
        // no object created
        Then "vinod" will never be assigned, because instance variables belong to objects, not the class.
         */

        // Step 4: One more correction in your code ⚠️
        //Your main method should be:
        /*
        public static void main(String[] args) {
    part1 obj = new part1();
}
Only then the object will be created and "vinod" will be assigned.
         */


    }
}
