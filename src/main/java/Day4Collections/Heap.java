package main.java.Day4Collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Heap<T extends Comparable<T>> {

  List<T> list;

  public Heap() {
    list = new ArrayList<>();
  }

  public T remove() {

    if (list.isEmpty()) {
      return null;
    }
    T removed = list.get(0);
    T temp = list.remove(list.size() - 1);
    if (list.isEmpty()) {
      return removed;
    }

    list.set(0, temp);
    downHeap(0);

    return removed;
  }

  public void add(T value) {
    list.add(value);
    upHeap(list.size() - 1);
  }

  private void downHeap(int current) {
    System.out.println(current);

    int left = leftIndex(current);
    int right = rightIndex(current);

    int min = current;

    if (left < list.size() && list.get(left).compareTo(list.get(min)) < 0) {
      min = left;
    }

    if (right < list.size() && list.get(right).compareTo(list.get(min)) < 0) {
      min = right;
    }

    if (min == current) {
      return;
    }

    //    if(list.get(left).compareTo(list.get(right)) >0){
    //      min = right;
    //    }else{
    //      min =left;
    //    }

    if (min != current) {
      swap(min, current);
      downHeap(min);
    }
  }

  private void upHeap(int current) {

    int parent = parent(current);
    if (parent == current) {
      return;
    }

    if (list.get(current).compareTo(list.get(parent)) < 0) {
      swap(current, parent);
      upHeap(parent);
    }
  }

  private int leftIndex(int current) {
    return (current * 2) + 1;
  }

  private int rightIndex(int current) {
    return (current * 2) + 2;
  }

  private int parent(int current) {
    return (current - 1) / 2;
  }

  public void swap(int min, int current) {
    T temp = list.get(min);
    list.set(min, list.get(current));
    list.set(current, temp);
  }

  public  List<T> sortArray(){
    List<T> al= new ArrayList<>();
    while(!list.isEmpty()){
      al.add(this.remove());

    }
    return al;

  }

}

// 11,12,13,16,10,18,5
//
//          5(0)
//    11(1)         10(2)
// 16(3)   12(4)  18(5)    13(6)

//          5(0)
//    11(1)         10(2)
// 16(3)   12(4)  18(5)    13(6)
