package main.java.Day4Collections;

import java.util.List;

public class CollectionsPart9HeapImplementation {

  public static void main(String[] args) {

    Heap<Integer> heap = new Heap<>();
    heap.add(10);
    heap.add(20);
    heap.add(5);
    heap.add(30);
    heap.add(40);
    heap.add(2);

    // get sorted array from the heap
    List <Integer> al = heap.sortArray();
    System.out.println("sorted list is " + al);

    heap.add(10);
    heap.add(20);
    heap.add(5);
    heap.add(30);
    heap.add(40);
    heap.add(2);


    System.out.println(heap.list);
    Integer n1 = heap.remove();
    System.out.println("removed " + n1);

    n1 = heap.remove();
    System.out.println("removed " + n1);

    n1 = heap.remove();
    System.out.println("removed " + n1);
    System.out.println(heap.list);
    n1 = heap.remove();
    System.out.println("removed " + n1);
    System.out.println(heap.list);
    n1 = heap.remove();
    System.out.println("removed " + n1);
    n1 = heap.remove();
    System.out.println("removed " + n1);
    n1 = heap.remove();
    System.out.println("removed " + n1);

    System.out.println(heap.list);
  }
}
