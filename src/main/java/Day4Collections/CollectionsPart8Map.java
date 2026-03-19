package main.java.Day4Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CollectionsPart8Map {
    /*
    What is a HashMap?
A HashMap is a part of the Java Collections Framework that implements the Map interface. It's designed to store data in key-value pairs, where each key is unique. The beauty of a HashMap lies in its performance: it provides average constant time complexity O(1) for basic operations like adding, removing, and retrieving elements.

Key Characteristics:
Key-Value Pairs: Data is stored as pairs, where each key maps to a specific value.
Unique Keys: Each key can only appear once; however, values can be duplicated.
Null Values: HashMaps allow for one null key and multiple null values.
Unordered: The order of entries is not guaranteed, meaning you can’t rely on the order of keys.
     */

    public static  void main (String[] args){
        Map<String, Integer> mp = new HashMap<>();

         mp.put("a",1);
         mp.put("b",1);

         mp.put("a", mp.getOrDefault("a",1) +1);
        Integer keyA =mp.get("a");
        System.out.println(keyA);
        System.out.println(keyA);
        System.out.println(mp);

        // traverse

        for(String keys : mp.keySet()){
            System.out.println("key inside map is "+ keys);
            System.out.println("value inside map is "+ mp.get(keys));
        }

        for(Integer val : mp.values()){
            System.out.println("value inside map is "+ val);
        }

        for(Map.Entry<String,Integer> entry: mp.entrySet()){
            System.out.println("key is " + entry.getKey() + " value is "+ entry.getValue());
        }

        mp.remove("Orange");
        System.out.println(mp.size());

        // to clear
        mp.clear();
        System.out.println(mp);



 // LinkedHashMap is same is HashMap just it maintains the insertion order


  // TreeMap
  /*
  A TreeMap in Java is part of the Collections Framework and implements the Map interface. It uses a red-black tree structure, which ensures that the keys are sorted in their natural order or by a specified comparator. This sorting is what makes TreeMap stand out among its peers like HashMap or LinkedHashMap.

Characteristics of TreeMap
Sorted Order: Unlike HashMap, TreeMap maintains a sorted order of its keys. When you iterate over the keys, you will always receive them in ascending order.
Performance: The time complexity for basic operations like add, remove, and containsKey is O(log n) due to the underlying red-black tree structure.
Null Keys/Values: TreeMap does not allow null keys. However, it does allow null values.
Understanding these characteristics helps you decide when to use TreeMap over other map implementations.
if keys is not comparabale then comprator must be passed or implemneted in object or else throws the runtime error
   */

        Map < String, Integer> mp2 = new TreeMap<>();
        mp2.put("a",1);
        mp2.put("d",1);
        mp2.put("b",1);
        System.out.println(mp2); // {a=1, b=1, d=1}

     //    TreeMap <Student, Integer> mp3 = new TreeMap<>(); // runTime Exception Exception in thread "main" java.lang.ClassCastException: class main.java.Day4Collections.CollectionsPart8Map$Student cannot be cast to class java.lang.Comparable (main.java.Day4Collections.CollectionsPart8Map$Student is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
        TreeMap <Student, Integer> mp3 = new TreeMap<>();

        mp3.put(new Student("vinod",1,2), 1);
        mp3.put(new Student("rahul",1,2), 1);
        mp3.put(new Student("hitesh",1,2), 1);
        System.out.println(mp3);



    }

    public static  class Student implements  Comparable<Student>{
        String name;
        int age;
        int rollNo;

        public Student(String name, int age, int rollNo){
            this.name =name;
            this.age = age;
            this.rollNo = rollNo;
        }


        @Override
        public int compareTo(Student o) {
            int n = Integer.compare(this.rollNo, o.rollNo);
            if(n==0){
                return this.name.compareTo(o.name);
            }
            return n;

        }

        @Override
        public String toString(){
            return "student name is "+name +"  rollNO is "+ rollNo;
        }
    }

    /*
    What is a Hashtable?
At its core, a Hashtable is a data structure that implements a mapping from keys to values. It allows you to store data in key-value pairs, enabling quick retrieval based on the key.

A few key characteristics of a Hashtable:

Key-Value Pair Mapping: Each key is associated with a value, and you can retrieve the value by providing the corresponding key.
Fast Access: It uses hashing to enable fast data access. Ideally, you can expect average time complexity of O(1) for insertions and lookups.
Thread Safety: Unlike HashMap, which is not synchronized, Hashtable is synchronized, making it thread-safe. This means it can be accessed by multiple threads without running into concurrency issues.
However, it’s important to note that Hashtable does not allow null keys or null values, which can lead to potential pitfalls if not managed properly.
     */
}
