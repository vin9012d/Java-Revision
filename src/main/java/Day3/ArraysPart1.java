package main.java.Day3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class ArraysPart1 {

    public static void main (String[] args){
         // no of ways to defined the array
        // 1 using new key work
        int[] intArray = new int[10]; // intilal size is compoulsary and fixed


        // direclty providing the values
        int[] intArary1 = {1,2,3,4,5};

        // length static variable

        System.out.println(intArary1.length);

        // retrive the element using index
        // intArray[0]

        //set the element using index
         intArray[0] =5;


        // interate through the array

        for(int i=0;i<intArray.length;i++){
            System.out.println("Simple for loop "+intArray[i]);
        }

        for(int a: intArary1){
            System.out.println("Enhanced for loop "+ a);
        }

        // Using streams (Java 8+)
        IntStream.of(intArary1).forEach(val -> System.out.println("stream: " + val));

        // Iterating with index using streams
        IntStream.range(0, intArary1.length)
                .forEach(i -> System.out.println("stream idx " + i + ": " + intArary1[i]));


        // Multi-dimensional arrays
        int[][] matrix = new int[3][4];          // 3 rows, 4 cols
        int[][] jaggedArray = new int[3][];       // jagged: rows can have different lengths
        jaggedArray[0] = new int[2];
        jaggedArray[1] = new int[5];
        jaggedArray[2] = new int[3];


        // reverse the array
        // sort the array in asc  and desc
        // sort lexographically when there is a string array


        // ===== 4. Arrays UTILITY CLASS (java.util.Arrays) =====

        // --- toString ---
        System.out.println(Arrays.toString(intArary1));        // [1, 2, 3, 4, 5]
        System.out.println(Arrays.deepToString(matrix));       // for multi-dimensional

        // --- fill ---
        int[] filled = new int[5];
        Arrays.fill(filled, 7);                                // [7, 7, 7, 7, 7]
        Arrays.fill(filled, 1, 3, 99);                        // fill index 1 to 2 with 99

        // --- copyOf & copyOfRange ---
        int[] copy = Arrays.copyOf(intArary1, 3);              // [1, 2, 3] — first 3 elements
        int[] copyBigger = Arrays.copyOf(intArary1, 8);        // [1,2,3,4,5,0,0,0] — pads with 0
        int[] rangeCopy = Arrays.copyOfRange(intArary1, 1, 4); // [2, 3, 4] — from index 1 to 3

        // --- equals & deepEquals ---
        int[] a1 = {1, 2, 3};
        int[] a2 = {1, 2, 3};
        System.out.println(a1 == a2);                          // false (reference check)
        System.out.println(Arrays.equals(a1, a2));             // true (content check)
        // Arrays.deepEquals() for multi-dimensional arrays

        // --- Ascending sort (primitive) — uses Dual-Pivot Quicksort, O(n log n) avg ---
        int[] sortMe = {5, 3, 1, 4, 2};
        Arrays.sort(sortMe);                                   // [1, 2, 3, 4, 5]

        System.out.println(sortMe); // print just address
        System.out.println(sortMe.toString()); // print just address
        System.out.println(Arrays.toString(sortMe)); // [1, 2, 3, 4, 5]

        // Partial sort
        int[] partial = {5, 3, 1, 4, 2};
        Arrays.sort(partial, 1, 4);


        Integer[] descArr = {5, 3, 1, 4, 2};

        Arrays.sort(descArr, Collections.reverseOrder());
        System.out.println(Arrays.toString(descArr)); // [5, 4, 3, 2, 1]

        Arrays.sort(descArr, (a,b) -> a-b);
        System.out.println(Arrays.toString(descArr));

        // --- Lexicographic sort (String array) ---
        String[] words = {"banana", "apple", "cherry"};
        Arrays.sort(words);                                    // [apple, banana, cherry] — natural order is lexicographic

        // Case-insensitive sort
        String[] mixed = {"banana", "Apple", "cherry"};
        Arrays.sort(mixed, String.CASE_INSENSITIVE_ORDER);


        // --- binarySearch — array MUST be sorted first, O(log n) ---
        int[] sorted = {1, 2, 3, 4, 5};
        int idx = Arrays.binarySearch(sorted, 3);              // returns 2 (index)
        int notFound = Arrays.binarySearch(sorted, 6);



    }
    
}
