package main.java;


import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDay4Part2 {
     static class  Student implements  Comparable<Student>{
         public  String name;
         public Integer age;
         Student(String name, Integer age){
             this.name =name;
             this.age = age;
         }
         public int compareTo(Student o){
             int diff = this.age - o.age;
             if(diff !=0){
                 return diff;
             }
             return this.name.compareTo(o.name);
         }

     }

    static class  Student1 {
        public  String name;
        public Integer age;
        Student1(String name, Integer age){
            this.name =name;
            this.age = age;
        }

    }

    public static void main(String[] args){

         // method  1 where student has compareTo implemented using implements comparable

        TreeSet<Student> list = new TreeSet<>();

        list.add(new Student("vinod",25));
        list.add(new Student("ravi",25));
        list.add(new Student("hitesh",26));
        list.add(new Student("rita",27));

       System.out.println(list);


        // method 2: comparator in the constructor
        TreeSet<Student1> list1 = new TreeSet<>(new Comparator<Student1>() {
            @Override
            public int compare(Student1 o1, Student1 o2) {
                int diff = Integer.compare(o1.age,o2.age);
                if(diff !=0 ){
                    return diff;
                }
                return o1.name.compareTo(o2.name);
            }
        });

        TreeSet<Student1> list12 = new TreeSet<>((s1, s2) -> Integer.compare(s1.age, s2.age));


        // method 3 : outside object
        TreeSet<Student1> list2 = new TreeSet<>(new rollNoComprator());
  }



  static  class rollNoComprator implements Comparator<Student1>{

      @Override
      public int compare(Student1 o1, Student1 o2) {
          return 0;
      }
  }
}


/*
comprabale has method compareTo wheres comparator has method compare
 */