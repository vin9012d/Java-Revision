package main.java;

import java.util.*;

public class VinodRevision1 {

  public static void main(String[] args) {
    List<Integer> ls = new ArrayList<>();
    ls.add(1);
    ls.add(2);
    ls.add(13);
    ls.add(5);
    ls.add(15);

    // ASC

    //        Collections.sort(ls);
    System.out.println(ls); // [1, 2, 5, 13, 15]
    ls.sort((a, b) -> a - b);
    System.out.println(ls); // [1, 2, 5, 13, 15]

    // DESC
    Collections.sort(ls, Comparator.comparingInt(a->-a));
    System.out.println(ls);
    ls.sort(Comparator.comparingInt(a->-a));
    ls.sort(Comparator.comparingInt((Integer a)->a).reversed());
    ls.sort(Comparator.reverseOrder());




    Collections.sort(ls, Comparator.comparingInt((Integer a)->a).reversed());
    System.out.println(ls);


  }
}
