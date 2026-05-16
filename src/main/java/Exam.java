package main.java;

import com.sun.jdi.IntegerType;

import java.util.*;

public class Exam {
  // 1  max occurancce and min number
  // 2,  find the max  and min occurance element ( note: also print its frequence as well)
  // 3 find the max and min ele from the array
  // 4. Sort the array in descending  order
  // 5 sort the array in ascending order
  // 6. sort the List in descending order
  // 7. sort the list in ascending order
  // crate the following patter
  // * * * *
  // * * * *
  // * * * *
  // * * * *

  // create the 2d array 4 * 4
  // Z and N traverse on it



 // if your home electricity usage per month is 308 units.
 // Rate of electricity usage per unit as following
   // for first 50unit 3 rs/unit
   // 51-100 unit 4 rs/unit
   //101-300 units 5 rs/unit
   // 301-400 unit 6 rs/unit






















    public static void main(String args[]){




        int[] ip = {1,1,1,2,2,2,2,3,3,3,3,4,5,6};
        int c=1;
        int MAX=1;
        int ans=1;


        for(int i=0;i<ip.length-1;i++){

            if(ip[i+1]==ip[i]){
                c++;
            }
            else{
                c=1;
            }
            if(c>=MAX){
            MAX = c;
            ans=ip[i];
            }
//            else if(c==MAX && ip[i+1]>ans)
//                ans =ip[i+1];
      }
        System.out.println("my ans is  "+ans+" +its frq is "+MAX);


        int n1=4;
        int[][] a=new int[n1][n1];
        int count=1;

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){

                a[i][j]=count;
                count=count+1;
            }
        }

        for(int i=0;i<a.length;i++){
      System.out.println(Arrays.toString(a[i]));
        }
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length; j++) {
        if (j == 0 || j == n1 - 1 || i + j == n1 - 1) {
          System.out.print(a[i][j]+" ,");
        }

        }
     // System.out.println();
        }


        int[] arr = {2, 1, 4, -1, 6}; //

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;



        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min)
                min=arr[i];

        }
        System.out.println("max element: "+max);
        System.out.println("min element: "+min);

    Arrays.sort(arr);



        Integer[] arr5 = {2,1,4,-1,6};
        Arrays.sort(arr5, Collections.reverseOrder());

    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }

    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();

    for(int i=0;i<n;i++){
        String b="";
        for(int j=0;j<n;j++){
        b = b + "* ";
        }

        System.out.println(b);
    }





    int[] arr6 = {1,2,3,4,5,6};
    int[] rev={0,0,0,0,0,0};
    int j=0;

    for(int i=arr6.length-1;i>=0;i--){
        rev[j]=arr6[i];
        j++;
    }

    System.out.println(Arrays.toString(rev));
  }

    /*
  public static void main(String args[]) {
    int[] arr = {3, 3, 2, 2, 1, 1};
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < arr.length; i++) {
      if (map.containsKey(arr[i])) map.put(arr[i], map.get(arr[i]) + 1);
      else map.put(arr[i], 1);
    }
    System.out.print(map);

    int maxFreq = 0;
    int element = 0;

    for (Integer i : map.keySet()) {
      if (map.get(i) > maxFreq) {
        maxFreq = map.get(i);
        element = i;
      } else if (map.get(i) == maxFreq && element > map.get(i)) {
        element = map.get(i);
      }
    }
    System.out.println("Max occuring freq element is:" + element +" its freq is "+maxFreq);


    //question 2

    int[] arr1 = {1,1,2,2,2,3,3,3,3};
    HashMap<Integer, Integer> map1 = new HashMap<>();

    for (int i = 0; i < arr1.length; i++) {
      if (map1.containsKey(arr1[i])) map1.put(arr1[i], map1.get(arr1[i]) + 1);
      else map1.put(arr1[i], 1);
    }
    System.out.println("question 2"+map1);
    int minElement = 0;
    int maxElement = 0;
    int maxFreq1 = 0;
    int minFreq1= Integer.MAX_VALUE;

    for (int i1 : map1.keySet()) {
      if (map1.get(i1) > maxFreq1) {
        maxFreq1 = map1.get(i1);
        maxElement = i1;
      }
      if (map1.get(i1)<minFreq1) {
        minFreq1 = map1.get(i1);
        minElement=i1;
          }

  }
      System.out.println(
              "Element that occurs max times is" + maxElement + " " + "and it's freq is" + maxFreq1);
      System.out.println(
              "Element that occurs min times is" + minElement + " " + "and it's freq is" + minFreq1);

  }*/

      }







