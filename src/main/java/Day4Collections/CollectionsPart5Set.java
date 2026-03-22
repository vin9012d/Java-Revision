package main.java.Day4Collections;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsPart5Set {

/*
At its core, the Set Interface in Java represents a collection that does not allow duplicate elements. It's part of the Java Collections Framework and extends the Collection interface. Sets are particularly useful when you care more about the presence or absence of an item than its position within the collection.

Here's a quick rundown of the key characteristics of sets:

No Duplicates: If you try to add a duplicate element, the set will ignore it.
Unordered: The elements are not stored in any particular order. This means that if you iterate through a set, you may not get the elements back in the same order you added them.
Null Elements: Depending on the specific set implementation, you can include null elements, but only one.
The Set interface has several implementations, including HashSet, LinkedHashSet, and TreeSet(No null elements allowed). These implementations offer different behaviors and performance characteristics, which we'll touch on later.

 */

    public static  void main(String[] args) {

        Set<String> s1 = new HashSet<>();
  /*
  HashSet: Offers average O(1) time complexity for add, remove, and contains operations but can degrade to O(n) in the worst case due to hash collisions.

  Constructors
Default Constructor: This creates an empty HashSet with an initial capacity of 16 and a load factor of 0.75.
Initial Capacity: You can specify the initial capacity, which might help in optimizing memory usage if you know the approximate size of your set.
Load Factor: This is a measure of how full the set is allowed to get before its capacity is automatically increased.
   */
         // add
        s1.add("vinod");
        s1.add("ravi");
        s1.add("hitesh");

        // remove object
        s1.remove("vinod");
        System.out.println(s1);

        // iteration
        for(String s: s1){
            System.out.println("String name is "+ s);
        }


        // check if element exists
        boolean name = s1.contains("hitesh"); // Returns true
        System.out.println(name); // true
        name = s1.contains("vino");
        System.out.println(name); // true

        // size
        System.out.println(s1.size());

        //clear
        s1.clear();
        System.out.println(s1.size());

        /*
        Memory Overhead
A HashSet consumes more memory than some other collection types because of the overhead associated with storing hash codes and pointers for collision handling. If memory is a constraint, consider alternatives.
         */

 // LinkedHashSet similar to Hashset it just preserves the insertion order as well

        /*
        For HashSet and LInkedHasSet if we are adding a custom object then how does it identify duplicate?
        Using hashCode() and equals() method
        if we dont override these above method then object cant be identified as duplicate, and it will be added into the set
        by default hashcode value for each object is on the basis of memory allocation , it gives integer number i,e 356573597, 1735600054
        Student s1 = new Student();
Student s2 = new Student();
Student s3 = s1;

System.out.println(s1.equals(s2)); // false
System.out.println(s1.equals(s3)); // true

how can we ovrride it
class Student {
    int id;
    String name;

    @Override
    public boolean equals(Object obj) {
        Student s = (Student) obj;
        return this.id == s.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}


How does TreeSet identify duplicates?

TreeSet does NOT use equals() or hashCode()

It uses comparison

That means:

compareTo() (if class implements Comparable)
OR

Comparator

class Student implements Comparable<Student> {
    int id;
    String name;

    public int compareTo(Student s) {
        return this.id - s.id;
    }
}


way 2

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

TreeSet<Student> set = new TreeSet<>(new Comparator<Student>() {
    public int compare(Student s1, Student s2) {
        return s1.id - s2.id;
    }
});

        */

 // Treeset
 /*
 At its core, a TreeSet is a Set implementation that uses a red-black tree under the hood to store its elements. This means that all elements in a TreeSet are sorted in their natural order or by a Comparator provided at set creation. The key characteristics that distinguish TreeSet include:

Sorted Order: Elements are stored in a sorted manner, ensuring that the smallest element is always at the beginning and the largest at the end.
No Duplicates: Like other Set implementations, a TreeSet does not allow duplicate elements.
Performance: While it may not be as fast as HashSet for insertions and lookups, it provides logarithmic time complexity for basic operations like add, remove, and contains.
  */

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Adding elements
        System.out.println("Added 40: " + numbers.add(40)); // true
        System.out.println("Added 20: " + numbers.add(20)); // false

        // Checking elements
        System.out.println("Contains 20: " + numbers.contains(20)); // true

        // Removing elements
        System.out.println("Removed 20: " + numbers.remove(20)); // true
        System.out.println("Removed 50: " + numbers.remove(50)); // false

        // Navigating the set
        System.out.println("First element: " + numbers.first()); // 10
        System.out.println("Last element: " + numbers.last()); // 40
        System.out.println("Higher than 25: " + numbers.higher(25)); // 30
        System.out.println("Lower than 25: " + numbers.lower(25)); // 20

    }








}
