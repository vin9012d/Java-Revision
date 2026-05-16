package main.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
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

    Arrays.sort(arr1, (a, b) -> a - b); // asc
    Arrays.sort(arr1, (a, b) -> b - a); // desc
    System.out.println(Arrays.toString(arr1));

    Arrays.sort(arr1, (a, b) -> Integer.compare(a, b)); // avoid overflow
    // Can be replaced with 'Comparator.comparingInt'  ->  Arrays.sort(arr1, Integer::compare);
    System.out.println(Arrays.toString(arr1));
    Arrays.sort(arr1, (a, b) -> Integer.compare(b, a)); // avoid overflow

    System.out.println(Arrays.toString(arr1));

    Arrays.sort(arr1, Comparator.comparingInt(s -> s));
    System.out.println(Arrays.toString(arr1));
    Arrays.sort(arr1, Comparator.comparingInt(s -> -s));
    System.out.println(Arrays.toString(arr1));

    // reverse array
    Arrays.sort(arr1, Collections.reverseOrder());
    System.out.println(Arrays.toString(arr1));

    Arrays.sort(arr1, (a, b) -> a - b); // asc
    System.out.println(Arrays.toString(arr1));
    Arrays.sort(arr1, Comparator.comparingInt(s->s));

    Arrays.sort(arr1, Comparator.comparingInt((Integer s) ->s).reversed()); // Bad return type in lambda
    // expression: Object cannot be converted to int



    Arrays.sort(arr1, Comparator.comparingInt((Integer s) -> s).reversed());

    int[] arr5 = new int[5];
    System.out.println(arr5);

    Integer[] arr6 = {1, 2, 7, 4, 5, 6};

    // now iternation is simple for loop and for each loop

    // lets not get the element that is als arr6[index] we can get it

    // now lets sort it in ascending order

    Arrays.sort(arr6);

    System.out.println(Arrays.toString(arr6));

    // descending order sorting

    //    Arrays.sort(arr6, ( a, b)->Integer.compare(b,a)); // It wont work because
    Arrays.sort(arr6, (a, b) -> a - b);

    int[] inputArr = {2, 3, 2, 3};
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < inputArr.length; i++) {
      if (map.containsKey(inputArr[i])) map.put(inputArr[i], map.get(inputArr[i]) + 1);
      else map.put(inputArr[i], 1);
    }

    System.out.println(map);
    int freq = 0;
    int resultElement = 0;
    for (Integer key : map.keySet()) {
      if (map.get(key) > freq) {
        freq = map.get(key);
        resultElement = key;
      } else if (map.get(key) == freq) {
        if (key < resultElement) {
          resultElement = key;
        }
      }

      // System.out.println(resultElement);
    }
    System.out.println(resultElement);

    // 1. you have to find the most repetative element
    // 2 you have to find the least repetative element

    int[] ip = {1, 1, 3, 3, 2, 2, 4, 4, 5, 5, 5, 5, 6, 6, 6, 9};
    HashMap<Integer, Integer> map1 = new HashMap<>();

    for (int i = 0; i < ip.length; i++) {
      if (map1.containsKey(ip[i])) map1.put(ip[i], map1.get(ip[i]) + 1);
      else map1.put(ip[i], 1);
    }
    System.out.println("we are priniting map1" + map1);
    int maxFreq = 0;
    int minFreq = Integer.MAX_VALUE;
    int maxElement = 0;
    int minElement = 0;

    for (int key : map1.keySet()) {
      if (map1.get(key) > maxFreq) {
        maxElement = key;
        maxFreq = map1.get(key);
      }

      if (map1.get(key) < minFreq) {
        minElement = key;
        minFreq = map1.get(key);
      }
    }

    System.out.println("Element with max freq is:" + maxElement);
    System.out.println("Element with min  freq is:" + minElement);

    // int arr
    // you have to find the biggest element
    // you have to find the smallest element
    // max = INTEGER.MIN_VALUE;
    // las[i] > max  = max = las[i]



































    int[] last = {-1, -3, -5,-9};
    int max=Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;
    int minEle=0;
    int maxEle=0;

    for (int i = 0; i < last.length; i++) {
      if(last[i]<maxEle)
        maxEle=last[i];
    }
    System.out.println("max elelelele"+maxEle);


  }
}