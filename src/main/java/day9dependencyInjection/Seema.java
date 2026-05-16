package main.java.day9dependencyInjection;

public class Seema {


    public  static void main (String[] args){


        int[] ip = {-1, -3, -5,-9,100,1000,-100000};
        int MAX=Integer.MIN_VALUE;
        int MIN=Integer.MAX_VALUE;

    for (int i = 0; i < ip.length; i++) {
      if (ip[i] > MAX) {

        MAX = ip[i];

      }
        if (ip[i] < MIN) {
            MIN = ip[i];
        }
            }
        System.out.println("max element is:  "+MAX);
        System.out.println("min element is:  "+MIN);


    }
}
