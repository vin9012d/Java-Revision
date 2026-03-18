package main.java.Day2;

public class StringsPart3 {
    // All important methods of String
    // length() to get the size of the string
    public static void main(String[] args) {
        String s1 = "vinod";
        System.out.println("Size of the string " + s1 + " is : " + s1.length()); // Size of the string vinod is : 5

        // char at to get the character  at specific index string.charAt(index)

        String s2 = "rahul";
        char c1= s2.charAt(2);
        System.out.println("char c1 is "+c1); // char c1 is h

      //   System.out.println(s2.charAt(-1)); // run time exception Exception in thread "main" java.lang.StringIndexOutOfBoundsException: Index -1 out of bounds for length
      //  System.out.println(s2.charAt(10)); // run time exception Exception in thread "main" java.lang.StringIndexOutOfBoundsException: Index 10 out of bounds for length 5

       // convert to charArray
        char[] charArray = s2.toCharArray();

     // containts sub string

        boolean b1 = s2.contains("al");
        boolean b2 = s2.contains("ul");
        System.out.println(b1 +" "+b2);

     // sub string
     String s3 = "new sub string concept";
     String sb1 = s3.substring(4); // from begin index to the length of the string.
        System.out.println(sb1);
     String sb2 = s3.substring(4,10); // include start index, exclude last index
        System.out.println(sb2);
//      String sb3 = s3.substring(0,100); // run time  Exception in thread "main" java.lang.StringIndexOutOfBoundsException: Range [0, 100) out of bounds for length 22

// first index of char and last index of char
        String s5 = "vinodbhaimotibhai";
       int i1=  s5.lastIndexOf('i');
       int i2 = s5.indexOf('i');
       System.out.println("i1 and i2 is "+i1 +" "+i2);
       int i3 = s5.indexOf("od");
        System.out.println("i3 "+i3);  // 3
        int i4= s5.indexOf(1); // if not found then -1  ( int equivalnet to char pass in the params
        System.out.println("i4 is "+i4);










        // replacce

        String bn = "banana";

        System.out.println(bn.replace('a', 'x')); // bxnxnx replace char
       String snew= bn.replace("ana","vinodbhai"); // bvinodbhaina ->replaces sequence of character
        System.out.println(snew);
        System.out.println(bn.replace('v','x')); // banana

        // split
        String name = "vinod bhai moti bhai chaudhari";
        String[] nameArray = name.split(" ");
        String s = "a,b,c";

        String[] arr = s.split(",");



        // to UpperCase() toLoserCase()
        String su = "Vinod";

        System.out.println(su.toUpperCase()); // VINOD
        System.out.println(su.toLowerCase()); // vinod

        // isEmpty() vs isBlank() (Java 11+)
        String s11 = "";
        String s12 = "   ";

        System.out.println(s11.isEmpty()); // true
        System.out.println(s12.isEmpty()); // false

        System.out.println(s12.isBlank()); // true



        // With string builder
        StringBuilder sb = new StringBuilder();
        // append method
        sb.append(1);
        sb.append(0.2f);
        sb.append('d');
        sb.append("meow meow");
        System.out.println(sb.toString()); // 10.2dmeow meow

        //  Inserts at specific index
        sb.insert(5, " Java"); // 10.2d Javameow meow

        System.out.println(sb); //10.2d Javameow meow


        //setCharAt()
        sb.setCharAt(0, 'H');
        System.out.println(sb); // H0.2d Javameow meow

        StringBuilder sb3 = new StringBuilder();
        System.out.println(sb3.capacity()); // 16 Default capacity = 16

        // newCapacity = (oldCapacity * 2) + 2 , default capacity is 16

        // delete char at
        sb.deleteCharAt(0);
        System.out.println(sb); // 0.2d Javameow meow
        sb.delete(1,3);
        System.out.println(sb); // 0d Javameow meow


        // reverse
        StringBuilder sb5 = new StringBuilder("abc");
        sb5.reverse();

        System.out.println(sb5); // cba

        // String builder is not thead safe wheres stringbuffer is thread safe.

    }



}
