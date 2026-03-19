package main.java.Day4Collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class CollectionsPart3List {



    // LinkedList Class
    // internally uses doubly linked list data structures , we can add and remove from both the end
    // maintain insertation order and allow duplicate  elements
    // allow to add multiple null values
    public static  void main (String[] args) {

        List<String> linkedList = new LinkedList<>();
        linkedList.add(null);
        linkedList.add(null);
        System.out.println(linkedList);

        LinkedList<String> ll = new LinkedList<>();

// ===== ADD =====
        ll.addFirst("a");     // head — throws exception if fails
        ll.addLast("b");      // tail — throws exception if fails
        ll.offerFirst("a");   // head — returns false if fails
        ll.offerLast("b");    // tail — returns false if fails

// ===== REMOVE =====
        ll.removeFirst();     // head — throws NoSuchElementException if empty
        ll.removeLast();      // tail — throws NoSuchElementException if empty
        ll.pollFirst();       // head — returns null if empty
        ll.pollLast();        // tail — returns null if empty

// ===== LOOK WITHOUT REMOVING =====
        ll.getFirst();        // head — throws NoSuchElementException if empty
        ll.getLast();          // tail — throws NoSuchElementException if empty
        ll.peekFirst();       // head — returns null if empty
        ll.peekLast();        // tail — returns null if empty

        LinkedList<String> l3 = new LinkedList<>(List.of("a", "b", "c", "d"));

        l3.add(2, "inserted");   // insert at index 2 → [a, b, inserted, c, d]
        l3.remove(1);            // remove at index 1 → [a, inserted, c, d]
        l3.get(2);               // get element at index 2
        l3.set(2, "changed");    // replace at index 2


        l3.add(500, "x");
// Step 1: walk 500 nodes to find position → O(n)
// Step 2: insert by changing pointers    → O(1)
// Total: O(n)

// ArrayList does the same thing:
// Step 1: jump to index 500 directly     → O(1)
// Step 2: shift remaining elements right  → O(n)
// Total: O(n)



        // sorting is same as list full copy paste

        LinkedList<String> l2 = new LinkedList<>(List.of("banana", "apple", "cherry"));

// Sort ascending
        Collections.sort(l2);
// or
        l2.sort(Comparator.naturalOrder());

// Sort descending
        l2.sort(Comparator.reverseOrder());

// Reverse
        Collections.reverse(l2);          // in-place, void
        List<String> view = l2.reversed(); // returns view (Java 21+)




        LinkedList<Student> students = new LinkedList<>();
// ... add students

// By rollNo asc
        students.sort((a, b) -> a.rollNo - b.rollNo);

// By rollNo desc
        students.sort((a, b) -> b.rollNo - a.rollNo);

// Multi-field
        students.sort(
                Comparator.comparing((Student s) -> s.name)
                        .thenComparingInt(s -> s.rollNo)
        );
    }




    public  static  class Student{
        private String name;
        private int rollNo;
        private int age;


        public Student(String name, int age, int rollNo){
            this.name = name;
            this.age = age;
            this.rollNo= rollNo;
        }

        public String getName(){
            return name;
        }

        public int getRollNo(){
            return rollNo;
        }

        public int getAge(){
            return age;
        }

        @Override
        public String toString() {
            return "{" + name + ", age=" + age + ", roll=" + rollNo + "}";
        }


    }


}
