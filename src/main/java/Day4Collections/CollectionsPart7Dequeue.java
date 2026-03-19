package main.java.Day4Collections;

import java.util.ArrayDeque;

public class CollectionsPart7Dequeue {

    /*
    ArrayDeque (pronounced "array double-ended queue") is part of the Java Collections Framework and implements the Deque interface. Unlike some other collection types, it doesn't have a fixed size, which means it can grow and shrink as needed. This makes it an excellent choice when you require a queue that is not constrained by a specific size.

Key Features
Dynamic Resizing: ArrayDeque can expand and contract as needed, which makes it more versatile than an array or a fixed-size collection.
Performance: It offers constant time performance for adding and removing elements at both ends, making it very efficient for queue operations.
Null Handling: ArrayDeque does not permit null elements, which helps to avoid ambiguity and potential NullPointerExceptions.
When to Use ArrayDeque
When dealing with scenarios that require frequent additions or removals from both ends of a collection, ArrayDeque is particularly useful. Examples include:

Implementing a task scheduling system.
Building a simple undo mechanism in applications.
Managing a playlist where you can add or remove songs from either end.
     */

    public  static  void main (String[] args){

        ArrayDeque<String> adq = new ArrayDeque<>();
        adq.add("vinod");
        adq.addFirst("importan task");
        adq.addLast("non importan tasks");
        adq.addLast("code review");
        adq.offerFirst("Zero"); // Using offer method
        adq.offerLast("Third");

        System.out.println(adq);

        String firstElement = adq.removeFirst(); // Will throw an exception if empty
        String lastElement = adq.pollLast();      // Returns null if empty

        for (String item : adq) {
            System.out.println(item);
        }

        while (!adq.isEmpty()) {
            System.out.println("Processing: " + adq.pollFirst());
        }
        // when queue is empty
       //  String firstGet = adq.getFirst(); //Exception in thread "main" java.util.NoSuchElementException
       // String lastGet =adq.getLast(); //Exception in thread "main" java.util.NoSuchElementException


        adq.addFirst("first");
        adq.addFirst("second");
        String firstGet = adq.getFirst();
        String lastGet =adq.getLast();
        System.out.println("firt and last get is "+ firstGet +" "+ lastGet);


    }
}
