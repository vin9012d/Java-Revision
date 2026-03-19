package main.java.Day4Collections;

import java.util.Comparator;
import java.util.PriorityQueue;

public class CollectionsPart6Queue {
    /*
    The Queue Interface in Java is part of the java.util package and is designed specifically for managing collections of elements in a FIFO manner. It extends the Collection Interface, meaning it inherits all the standard collection methods but adds its own specific methods suited to queue behavior.

At its core, a queue allows us to add elements to the end and remove elements from the front. This makes it ideal for scenarios like task scheduling, breadth-first search in graphs, or handling asynchronous data.

The Queue Interface itself doesn't have a concrete implementation. Instead, it's implemented by various classes, such as LinkedList, PriorityQueue, and others.

Basic Operations
add(E e): Adds the specified element to the queue. If the queue is full, it throws an IllegalStateException.
offer(E e): Similar to add, but it returns false if the element cannot be added immediately due to capacity restrictions.
remove(): Retrieves and removes the head of the queue. Throws an exception if the queue is empty.
poll(): Retrieves and removes the head of the queue, returning null if the queue is empty.
Peeking at Elements
element(): Retrieves, but does not remove, the head of the queue. Throws an exception if the queue is empty.
peek(): Retrieves, but does not remove, the head of the queue, returning null if the queue is empty.
     */
    public static class StudentComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            int n = Integer.compare(o1.rollNo, o2.rollNo);
            if (n != 0) return n;
            return o1.name.compareTo(o2.name);
        }
    }


    public static class Student{
        String name;
        int age;
        int rollNo;

        public Student(String name, int age, int rollNo){
            this.name =name;
            this .age = age;
            this.rollNo = rollNo;
        }
      @Override
        public String toString(){
            return "name is "+ name + " rollNO is "+ rollNo;
      }


    }

    public static void main(String[] args){
        /*
 A PriorityQueue is part of the Java Collections Framework and implements the Queue interface. Unlike a standard queue, where elements are processed in the order they arrive (FIFO), a PriorityQueue processes elements based on their natural ordering or a custom comparator.

When you add items to a PriorityQueue, they are stored in such a way that the highest (or lowest) priority element can be efficiently accessed. This means that when you poll from the queue, you get the element with the highest priority, not necessarily the one that was added first.

Key Characteristics
Ordering: Elements are ordered based on their priority, which is determined by their natural ordering or a comparator provided at queue creation.
Dynamic Size: Unlike arrays, PriorityQueues can grow dynamically as needed.
Not Thread-Safe: If you need to use a PriorityQueue in a concurrent environment, consider using PriorityBlockingQueue.
         */

        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("vinod");
        pq.add("ravi");
        pq.add("hitesh");
        System.out.println(pq);

       // PriorityQueue<Student>  st = new PriorityQueue<>(); // Exception in thread "main" java.lang.ClassCastException: class main.java.Day4Collections.CollectionsPart6Queue$Student cannot be cast to class java.lang.Comparable (main.java.Day4Collections.CollectionsPart6Queue$Student is in unnamed module of loader 'app'; java.lang.Compa
        PriorityQueue<Student> st = new PriorityQueue<>(new StudentComparator());
        st.add(new Student("rahul",27, 12));
        st.add(new Student("vinod",26,13));
        st.add(new Student("akash",12,12));

        System.out.println(st);

        /*
        NO null allowed
Insertion (add/offer): O(log n)
Removal (poll): O(log n)
Access (peek): O(1)
         */

    }
}
