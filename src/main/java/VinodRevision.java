package main.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.ToIntFunction;

public class VinodRevision {

  public static void main(String[] args) {

    int[] arr = new int[5];
    arr[0] = 1;
    arr[1] = 5;
    arr[2] = 12;
    arr[3] = 3;
    arr[4] = 4;
    System.out.println(arr); // printing address
    System.out.println(Arrays.toString(arr)); // [1, 5, 2, 3, 4]
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5]

   // Arrays.sort(arr, (int a,int b) -> a-b); // error because arr is an int[] ( primitive array,
                                    // but custom comparators (lambdas) only work with object arrays, not primitives


    Integer[] arr1 = new Integer[5];
    arr1[0] = 1;
    arr1[1] = 5;
    arr1[2] = 12;
    arr1[3] = 3;
    arr1[4] = 4;
    Arrays.sort(arr1);
    System.out.println(Arrays.toString(arr1));

    Arrays.sort(arr1,(a,b)-> a-b); // asc
    Arrays.sort(arr1,(a,b)-> b-a); // desc
    System.out.println(Arrays.toString(arr1));

    Arrays.sort(arr1, (a,b)-> Integer.compare(a,b)); // avoid overflow
    // Can be replaced with 'Comparator.comparingInt'  ->  Arrays.sort(arr1, Integer::compare);
    System.out.println(Arrays.toString(arr1));
    Arrays.sort(arr1, (a,b)-> Integer.compare(b,a)); // avoid overflow

    System.out.println(Arrays.toString(arr1));

    Arrays.sort(arr1,Comparator.comparingInt(s->s));
    System.out.println(Arrays.toString(arr1));
    Arrays.sort(arr1,Comparator.comparingInt(s->-s));
    System.out.println(Arrays.toString(arr1));

    // reverse array
    Arrays.sort(arr1, Collections.reverseOrder());
    System.out.println(Arrays.toString(arr1));


    Arrays.sort(arr1,(a,b)-> a-b); // asc
    System.out.println(Arrays.toString(arr1));

    // Arrays.sort(arr1, Comparator.comparingInt(s->s).reversed()); // Bad return type in lambda expression: Object cannot be converted to int

    Arrays.sort(arr1, Comparator.comparingInt((Integer s) -> s).reversed());




  }
}
