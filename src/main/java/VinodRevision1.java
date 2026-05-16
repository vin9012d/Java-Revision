package main.java;

import java.security.spec.RSAOtherPrimeInfo;
import java.sql.Array;
import java.util.*;

class Person {
  public String name;
  public Integer age;
  public int height;

  Person(String name, Integer age, int height) {
    this.name = name;
    this.age = age;
    this.height = height;
  }

  public String toString() {
    return "name is " + name + " age is " + age + " height is " + height;
  }
}

public class VinodRevision1 {

  public static void main(String[] args) {

    int[] arr = {1, 2, 4, 3, 5};
    System.out.println(arr);

    for (int i : arr) {
      System.out.println(i);
    }
    Arrays.sort(arr);
    // Arrays.sort(arr, (a,b)->a-b); // error Operator '-' cannot be applied to 'T', 'T'
    //  becuase comparator does not work wit primitive
    Integer[] arr1 = {1, 2, 4, 3, 5};

    Arrays.sort(arr1, (a, b) -> a - b);

    for (int i : arr1) {
      System.out.println(i);
    }

    // now lets try for the revere
    Arrays.sort(arr1, Comparator.comparingInt((Integer a) -> a).reversed());
    Person[] persons = new Person[4];
    persons[0] = new Person("vinod", 28, 175);
    persons[1] = new Person("rita", 25, 150);
    persons[2] = new Person("hitesh", 22, 175);
    persons[3] = new Person("anand", 22, 175);

    // sort them in asecnding order or age;

    Arrays.sort(persons, Comparator.comparingInt(a -> a.age));
    System.out.println(Arrays.toString(persons));

    // sort them on the basis of their name string in lexographical  in asecnding order
    Arrays.sort(persons, Comparator.comparing(p -> p.name));

    System.out.println(Arrays.toString(persons));
    // sort them on the basis of their name string in lexographical in desc order
    Arrays.sort(persons, Comparator.comparing((Person p) -> p.name).reversed());
    System.out.println(Arrays.toString(persons));

    // sort by age if age is same then sort by name in desc order

    Arrays.sort(
        persons,
        (a, b) -> {
          int ageDiff = a.age.compareTo(b.age);
          if (ageDiff != 0) {
            return ageDiff;
          }
          return b.name.compareTo(a.name);
        });

    System.out.println(Arrays.toString(persons));

    ///  great bro now lets try same thig with list as well

    //    List<Integer> ls = new ArrayList<>();
    //    ls.add(1);
    //    ls.add(2);
    //    ls.add(13);
    //    ls.add(5);
    //    ls.add(15);
    //
    //    // ASC
    //
    //    //        Collections.sort(ls);
    //    System.out.println(ls); // [1, 2, 5, 13, 15]
    //    ls.sort((a, b) -> a - b);
    //    System.out.println(ls); // [1, 2, 5, 13, 15]
    //
    //    // DESC
    //    Collections.sort(ls, Comparator.comparingInt(a->-a));
    //    System.out.println(ls);
    //    ls.sort(Comparator.comparingInt(a->-a));
    //    ls.sort(Comparator.comparingInt((Integer a)->a).reversed());
    //    ls.sort(Comparator.reverseOrder());
    //
    //
    //
    //
    //    Collections.sort(ls, Comparator.comparingInt((Integer a)->a).reversed());
    //    System.out.println(ls);
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //    //
    //    List<Integer> a1 = new ArrayList<>();
    //    a1.add(5);
    //    a1.add(10);
    //    a1.add(9);
    //
    //    a1.sort((a,b)->a-b);
    //
    //    Collections.sort(a1, (a,b)-> a-b);
    //    Collections.sort(a1,(a,b)-> Integer.compare(b,a));
    //    Collections.sort(a1, Comparator.comparingInt( a -> a));

    // lets reverse string name;
    String name = "vinodbhai";
    char[] charArr = name.toCharArray();
    System.out.println(Arrays.toString(charArr));
    // sort the char array
    // Arrays.sort(charArr);
    //  System.out.println(Arrays.toString(charArr));

    int i = 0;
    int j = charArr.length - 1;
    while (i != j) {
      char temp = charArr[i];
      charArr[i] = charArr[j];
      charArr[j] = temp;
      i++;
      j--;
    }
    System.out.println(Arrays.toString(charArr));
    String reversedName = new String(charArr);
    System.out.println(reversedName);

    // print all string elements
    for (int k = 0; k < charArr.length; k++) {
      System.out.println(name.charAt(k));
    }

  // now one map example take
  Map<Character, Integer> map = new HashMap<>();

    for(int k=0;k<name.length();k++){

         map.put(name.charAt(k), map.getOrDefault(name.charAt(k),0)+1);


    }

    for(Character key: map.keySet()){
      System.out.println("key is "+key +" value is "+ map.get(key));
    }

    System.out.println(map);
  }
}
