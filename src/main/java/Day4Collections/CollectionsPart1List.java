package main.java.Day4Collections;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionsPart1List {

    public static  void main (String[] args){

    // Lets Start with ArrayList first
        // Its part of the List family
        // initial default size is 10
        //once reaches to the initial capacity, New capacity = old + (old / 2)
        List<String> ls = new ArrayList<>();

        // its dynamic there is no fixed size, size can increase once it reachss to


        // Default — initial capacity 10 (not size, CAPACITY)

        // With custom initial capacity (use when you know approximate size — avoids resizing)
        List<String> ls2 = new ArrayList<>(100);

        // From existing collection
        List<String> ls3 = new ArrayList<>(List.of("a", "b", "c"));

        // From Arrays.asList — CAREFUL: returns fixed-size list
        List<String> fixed = Arrays.asList("a", "b", "c");  // can set(), CANNOT add()/remove()
        List<String> mutable = new ArrayList<>(Arrays.asList("a", "b", "c")); // fully mutable

        // List.of() — returns IMMUTABLE list (Java 9+)
        List<String> immutable = List.of("a", "b", "c");  // CANNOT add/remove/set
        // immutable.add("d"); → UnsupportedOperationException

        // List.copyOf() — immutable copy of existing list (Java 10+)
        List<String> copy = List.copyOf(ls3);

        // operations
        // add
        ls.add("vinod");
        ls.add("ravi");
        ls.add("hitesh");
        ls.add("rita");
        ls.add("seema");


        // Retrive

      String name =   ls.get(2); // index based retrival
        System.out.println("Name at index 2 is " +name);
       // name = ls.get(10); // Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 10 out of bounds for length 5
      //  System.out.println("name at index 10 is "+ name);

      // size of the list

        System.out.println(ls.size());

      // set element at specfic index

      ls.set(2,"new Hitesh"); // index and new value
      System.out.println(ls); // [vinod, ravi, new Hitesh, rita, seema]


      // iteration
      for(int i=0;i<ls.size();i++){
          System.out.println(ls.get(i));
      }



      for(String s: ls){
          // here we get copy of elements even if we modify it wil not affect original object
          System.out.println(s);
      }


      // sort asc, desc,  reverse

      List newLs = ls.reversed(); // does it modify current one or return new one
        System.out.println(newLs);


        // --- Ascending (natural order) ---
        Collections.sort(ls);                          // sorts in-place
        // or:
        ls.sort(Comparator.naturalOrder());  // sort in place

        System.out.println("Ascending: " + ls);


        // --- Descending ---
        Collections.sort(ls, Collections.reverseOrder());
        // or:
        ls.sort(Comparator.reverseOrder());

        System.out.println("Descending: " + ls);

        // --- Case insensitive ---
        ls.sort(String.CASE_INSENSITIVE_ORDER);

        // --- Custom comparator (by length) ---
        ls.sort(Comparator.comparingInt(String::length));

        // --- For List<Integer> ---
        List<Integer> numbers = new ArrayList<>(List.of(5, 3, 1, 4, 2));
        Collections.sort(numbers);                     // [1, 2, 3, 4, 5]
        numbers.sort(Comparator.reverseOrder());       // [5, 4, 3, 2, 1]

        // =======================================================
        // 7. REVERSE (your question — does it modify or return new?)
        // =======================================================

        // Collections.reverse() — modifies IN-PLACE, returns void
        List<String> original = new ArrayList<>(List.of("a", "b", "c"));
        Collections.reverse(original);
        System.out.println(original);                  // [c, b, a] — MODIFIED

        // List.reversed() (Java 21+) — returns a REVERSED VIEW, original unchanged
        List<String> orig2 = new ArrayList<>(List.of("a", "b", "c"));
        List<String> rev = orig2.reversed();
        System.out.println(orig2);                     // [a, b, c] — unchanged
        System.out.println(rev);                       // [c, b, a] — reversed view
        // ⚠️ It's a VIEW — changes to orig2 reflect in rev and vice versa
        // =======================================================
        // 10. CONVERSION (missing — very important)
        // =======================================================

        // List → Array
        String[] arr = ls.toArray(new String[0]);      // preferred way
        // new String[0] is just a type hint, Java allocates correct size internally

        // Array → List (already covered above)
        // Arrays.asList() → fixed-size
        // new ArrayList<>(Arrays.asList()) → mutable
        // List.of() → immutable

        // List → Stream
        ls.stream().filter(s -> s.length() > 3).forEach(System.out::println);

        // Stream → List
        List<String> filtered = ls.stream()
                .filter(s -> s.length() > 3)
                .collect(Collectors.toList());           // mutable list
        // or: .toList()                                // immutable list (Java 16+)

        // List → Set (remove duplicates)
        Set<String> set = new HashSet<>(ls);

        // Set → List
        List<String> fromSet = new ArrayList<>(set);

        // List<Integer> → int[]
        List<Integer> intList = List.of(1, 2, 3, 4, 5);
        int[] intArr = intList.stream().mapToInt(Integer::intValue).toArray();

        // int[] → List<Integer>
        int[] primitiveArr = {1, 2, 3, 4, 5};
        List<Integer> fromArr = Arrays.stream(primitiveArr).boxed().collect(Collectors.toList());




    }
}
