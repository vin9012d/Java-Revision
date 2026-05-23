package main.java.Day6Lambda;

import main.java.Day4Collections.CollectionsPart8Map;

import java.util.*;
import java.util.stream.Collectors;

public class StreamPart1 {

    public static  void main(String[] args){
        // find duplicate elements using stream
        List<Integer> nums = Arrays.asList(1,2,3,4,2,5,1,6,3);
        Set<Integer> hashSet = new HashSet<>();


       Set<Integer> diplicates = nums.stream().filter((t)-> !hashSet.add(t)).collect(Collectors.toSet());
    System.out.println(diplicates);

/*
2. filter + map
Given
List<String> names =
    Arrays.asList("java", "spring", "js", "microservice");

    Using Stream API:

keep only strings with length > 4
convert them to uppercase
collect into list
 */

        List<String> names =
                Arrays.asList("java", "spring", "js", "microservice");
      List<String> stringList=  names.stream().filter((a)->a.length() >4).map((a)-> a.toUpperCase()).toList();

/*
Exercise 2 — Predicate + forEach

Given:

List<Integer> nums =
    Arrays.asList(10, 15, 20, 25, 30, 35);
Task
filter only even numbers
print them using forEach
 */

        List<Integer> numsList =
                Arrays.asList(10, 15, 20, 25, 30, 35);
    numsList.stream().filter(n -> n % 2 == 0).forEach(s -> System.out.println(s));

    /*
    Exercise 3 — Function

Given:

List<String> words =
    Arrays.asList("apple", "banana", "kiwi");
Task

Convert list into word lengths.
     */

        List<String> words =
                Arrays.asList("apple", "banana", "kiwi");
        List<Integer> integerList = words.stream().map((s)-> s.length()).toList();

    System.out.println(integerList);

    /*
    Exercise 4 — Sorting Objects

Create class:

class Student {
    int rollNo;
    String name;
    int marks;
}

Create 5 students.

Task

Using Streams:

filter students with marks > 60
sort by marks descending
print only names

Expected type of output:
     */

        List<Student > studentList = new ArrayList<>();
        studentList.add(new Student(1,"vinod", 500));
        studentList.add(new Student(2,"hitesh", 470));

        studentList.add(new Student(3,"rita", 480));
        studentList.add(new Student(4,"seema", 520));
        studentList.add(new Student(4,"rk", 30));
       List<Student> studentResultLIst = studentList.stream().filter((s)-> s.marks >60).sorted((Student s2, Student s1)-> Integer.compare(s1.marks, s2.marks)).toList();
    System.out.println(studentResultLIst);

    /*
    Exercise 5 — Collectors.groupingBy()

Given:

List<String> names =
 Arrays.asList(
     "Ram",
     "Ravi",
     "Aman",
     "Ankit",
     "Rohit"
 );
Task

Group by first character.
     */

        List<String> namesL =
                Arrays.asList(
                        "Ram",
                        "Ravi",
                        "Aman",
                        "Ankit",
                        "Rohit"
                );
//
       Map<Character,List<String>> mapName= namesL.stream().collect(Collectors.groupingBy(
          s->s.charAt(0)
        ));
        System.out.println(mapName);

        /*
        Exercise 6 — Harder One 🔥

Using Student class.

Task

Find:

highest marks student
average marks
names of failed students (<40) // it can be don usind filter so easy
total marks sum

Concepts:

max
mapToInt
average
sum
filter
         */
      // max marks student
       Student maxs = studentList.stream().max((Student s1, Student s2) -> Integer.compare(s1.marks, s2.marks)).get();
    System.out.println("max marks is " + maxs);

    // agerage marks

     Double average=   studentList.stream().mapToInt((s)->s.marks ).average().getAsDouble();
    System.out.println("average is "+ average);

    int totalMarks = studentList.stream().mapToInt((s)->s.marks).sum();
    System.out.println("total marks are "+totalMarks);


    /*
    1. groupingBy()

Used when:

one key can have MULTIPLE values

Example:
Group students by department.
     */

        /*
        2. partitioningBy()

Used when:

condition returns ONLY true/false

Internally key type always:

Map<Boolean, List<T>>
Example

Partition students into:

passed
failed
         */

        Map<Boolean, List<Student>> map =
                studentList.stream()
                        .collect(
                                Collectors.partitioningBy(
                                        s -> s.marks >= 40
                                )
                        );

        System.out.println(map);
  }

    static class Student {
        public int rollNo;
        public String name;
        public int marks;
        Student (int rollNo, String name, int marks){
            this.rollNo= rollNo;
            this.name = name;
            this.marks = marks;
        }
        public String toString(){
            return "studene name is "+ name +" marks are "+ marks;
        }
    }




}
