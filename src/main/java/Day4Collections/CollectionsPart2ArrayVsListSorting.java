package main.java.Day4Collections;

/*
 * ================================================================
 *  SORTING CHEAT SHEET — Arrays vs Lists (SDE-3 Ready)
 * ================================================================
 *
 *  Key rule: Comparators ONLY work with Object types (Integer, String, Student)
 *            Primitive arrays (int[]) → NO comparator, just Arrays.sort()
 *
 * ================================================================
 *  1. PRIMITIVE ARRAY (int[])
 * ================================================================
 *
 *  Ascending:
 *      Arrays.sort(arr);
 *
 *  Descending:
 *      Arrays.sort(arr);           // sort first
 *      // then two-pointer reverse manually — no shortcut
 *
 *  Reverse:
 *      // manual two-pointer swap only
 *
 *  Custom sort:
 *      ❌ NOT POSSIBLE — no comparator for primitives
 *      Convert to Integer[] first if you need custom sort
 *
 *  Algorithm: Dual-Pivot Quicksort — O(n log n) avg, O(n²) worst, NOT stable
 *
 *
 * ================================================================
 *  2. OBJECT ARRAY (Integer[], String[], Student[])
 * ================================================================
 *
 *  Ascending:
 *      Arrays.sort(arr);                                    // uses natural order (Comparable)
 *      Arrays.sort(arr, Comparator.naturalOrder());         // explicit
 *
 *  Descending:
 *      Arrays.sort(arr, Collections.reverseOrder());        // cleanest for Integer/String
 *      Arrays.sort(arr, (a, b) -> b - a);                   // lambda (overflow risk)
 *
 *  Reverse (without sorting):
 *      Collections.reverse(Arrays.asList(arr));             // in-place via list view
 *
 *  Custom sort (Student by rollNo):
 *      Arrays.sort(students, (a, b) -> a.rollNo - b.rollNo);                        // asc
 *      Arrays.sort(students, (a, b) -> b.rollNo - a.rollNo);                        // desc
 *      Arrays.sort(students, Comparator.comparingInt((Student s) -> s.rollNo));      // asc
 *      Arrays.sort(students, Comparator.comparingInt((Student s) -> s.rollNo).reversed()); // desc
 *
 *  Multi-field (name asc → rollNo asc):
 *      Arrays.sort(students, (a, b) -> {
 *          int cmp = a.name.compareTo(b.name);
 *          return cmp != 0 ? cmp : Integer.compare(a.rollNo, b.rollNo);
 *      });
 *      // or cleaner:
 *      Arrays.sort(students,
 *          Comparator.comparing((Student s) -> s.name)
 *                    .thenComparingInt(s -> s.rollNo)
 *      );
 *
 *  Algorithm: TimSort — O(n log n) guaranteed, STABLE
 *
 *
 * ================================================================
 *  3. LIST (List<Integer>, List<String>, List<Student>)
 * ================================================================
 *
 *  Ascending:
 *      Collections.sort(list);                              // in-place
 *      list.sort(Comparator.naturalOrder());                // same thing
 *
 *  Descending:
 *      Collections.sort(list, Collections.reverseOrder());
 *      list.sort(Comparator.reverseOrder());
 *
 *  Reverse (without sorting):
 *      Collections.reverse(list);                           // in-place, returns void
 *      list.reversed();                                     // returns VIEW, original unchanged (Java 21+)
 *
 *  Custom sort (Student by rollNo):
 *      list.sort((a, b) -> a.rollNo - b.rollNo);                                   // asc
 *      list.sort((a, b) -> b.rollNo - a.rollNo);                                   // desc
 *      list.sort(Comparator.comparingInt((Student s) -> s.rollNo));                 // asc
 *      list.sort(Comparator.comparingInt((Student s) -> s.rollNo).reversed());      // desc
 *
 *  Multi-field (name asc → rollNo asc):
 *      list.sort((a, b) -> {
 *          int cmp = a.name.compareTo(b.name);
 *          return cmp != 0 ? cmp : Integer.compare(a.rollNo, b.rollNo);
 *      });
 *      // or cleaner:
 *      list.sort(
 *          Comparator.comparing((Student s) -> s.name)
 *                    .thenComparingInt(s -> s.rollNo)
 *      );
 *
 *  Algorithm: TimSort — O(n log n) guaranteed, STABLE
 *             (Collections.sort internally calls list.sort which uses Arrays.sort)
 *
 *
 * ================================================================
 *  QUICK REFERENCE TABLE
 * ================================================================
 *
 *  ┌─────────────────┬────────────────────────────────────┬────────────────────────────────────┐
 *  │ What            │ Array                              │ List                               │
 *  ├─────────────────┼────────────────────────────────────┼────────────────────────────────────┤
 *  │ Sort asc        │ Arrays.sort(arr)                   │ list.sort(naturalOrder())          │
 *  │ Sort desc       │ Arrays.sort(arr, reverseOrder())   │ list.sort(reverseOrder())          │
 *  │ Reverse         │ Collections.reverse(asList(arr))   │ Collections.reverse(list)          │
 *  │ Custom asc      │ Arrays.sort(arr, (a,b)->a.x-b.x)  │ list.sort((a,b)->a.x-b.x)         │
 *  │ Custom desc     │ Arrays.sort(arr, (a,b)->b.x-a.x)  │ list.sort((a,b)->b.x-a.x)         │
 *  │ Multi-field     │ Arrays.sort(arr, comparing().then) │ list.sort(comparing().then)        │
 *  │ Primitive asc   │ Arrays.sort(intArr)                │ N/A (List<Integer> is object)      │
 *  │ Primitive desc  │ sort + manual reverse              │ N/A                                │
 *  └─────────────────┴────────────────────────────────────┴────────────────────────────────────┘
 *
 *
 * ================================================================
 *  REMEMBER THESE GOTCHAS
 * ================================================================
 *
 *  1. (a - b) overflow        → use Integer.compare(a, b) for large values
 *  2. Comparator + .reversed() → needs explicit type: (Student s) -> s.field
 *  3. int[] + Comparator       → compile error, primitives don't support it
 *  4. Arrays.asList(int[])     → WRONG, treats entire int[] as one element
 *                                 Use Arrays.asList(Integer[]) or stream it
 *  5. Stable sort matters      → TimSort preserves order of equal elements
 *                                 Important for multi-field sorts
 *  6. Collections.reverse()    → in-place, void return
 *     list.reversed()          → returns view, original unchanged (Java 21+)
 *
 */

public class  CollectionsPart2ArrayVsListSorting {
    // This file is just notes — no main method needed
}