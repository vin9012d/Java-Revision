package main.java.Day3;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysPart2ObjectSotring {

    public  static  class Student{
        private String name;
        private int rollNo;
        private int age;


        public Student(String name, int age, int rollNo){
            this.name = name;
            this.age = age;
            this.rollNo= rollNo;
        }

        public String getName(){
            return name;
        }

        public int getRollNo(){
            return rollNo;
        }

        public int getAge(){
            return age;
        }

        @Override
        public String toString() {
            return "{" + name + ", age=" + age + ", roll=" + rollNo + "}";
        }


    }

    public static void main(String[] args){

        Student[] students =new Student[5];
        students[0]=new Student("Vinod",27,23);
        students[1]= new Student("Seema",28, 24 );
        students[2] = new Student("Ravi", 47,29);
        students[3] = new Student("Swapnil",49,50);
        students[4] = new Student("Vinod", 25,22);

        System.out.println(Arrays.toString(students));

        // sort by roll no ascending

        Arrays.sort(students, (a,b) -> a.rollNo -b.rollNo);
        Arrays.sort(students, Comparator.comparingInt(s -> s.rollNo));

        // sort by roll no descending
        // method 1
        Arrays.sort(students, (a,b) -> b.rollNo-a.rollNo);


        // method 2
        Arrays.sort(students, Comparator.comparingInt( (Student s) -> s.rollNo).reversed());


        System.out.println(Arrays.toString(students));

        // sort by name ascending and descending
        // asc

        Arrays.sort(students,(a,b)-> a.name.compareTo(b.name));

        Arrays.sort(students,Comparator.comparing(s -> s.name));

        //desc

        Arrays.sort(students,(a,b)-> b.name.compareTo(a.name));
        Arrays.sort(students, Comparator.comparing((Student s)-> s.name).reversed());


        // custom sort by name and rollNo

        Arrays.sort(students, (a,b) -> {
          int num =a.name.compareTo(b.name);
          if(num !=0 ){
              return num;
          }
          return a.rollNo - b.rollNo;
        });
        //int a = Integer.MAX_VALUE;  // 2,147,483,647
        //int b = -10;
        //
        //int result = a - b;
        //// Expected: positive number (a is bigger)
        //// Actual:   2,147,483,647 - (-10) = 2,147,483,657
        //// But int max is 2,147,483,647 — it OVERFLOWS
        //// result becomes -2,147,483,639 (NEGATIVE!)
        // So Java thinks b is bigger than a, which is completely wrong. The sort will give you garbage ordering.


        // How Integer.compare avoids this:

        // public static int compare(int x, int y) {
        //    return (x < y) ? -1 : ((x == y) ? 0 : 1);
        //}

        //It never does subtraction at all. It just uses < and == comparisons, which can never overflow. It returns -1, 0, or 1 — that's it.

        Arrays.sort(students, (a, b) -> {
            int nameCompare = a.name.compareTo(b.name);
            if (nameCompare != 0) return nameCompare;  // different names? done
            return Integer.compare(a.rollNo, b.rollNo);  // same name? sort by roll
        });
        // Method 2: Comparator chaining (cleaner, preferred in production)
        Arrays.sort(students,
                Comparator.comparing((Student s) -> s.name)
                        .thenComparingInt(s -> s.rollNo)
        );

        // even method 2 at the end we can add reveresed() as well and any other methods we can chain there

        // Method 3: Name ASC → Roll DESC (mix directions)
        Arrays.sort(students,
                Comparator.comparing((Student s) -> s.name)
                        .thenComparingInt(s -> -s.rollNo)  // negative for desc
        );
        // or safer:
        Arrays.sort(students,
                Comparator.comparing((Student s) -> s.name)
        );


    }



}
