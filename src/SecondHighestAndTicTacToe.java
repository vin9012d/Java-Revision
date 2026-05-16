import main.java.Interview;

import java.util.HashMap;

public class SecondHighestAndTicTacToe {

  public static void main(String[] args) {

    System.out.println(print(1));


















    int arr[] = {1, 1, 2, 2, 2};
    int tic[][]={{1,1,1},{0,1,0},{0,1,0}};
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < arr.length; i++) {
        if(map.containsKey(arr[i]))
            map.put(arr[i],map.get(arr[i])+1);
            else
        map.put(arr[i],1);
    }
    System.out.println(map);

    int secondMaxElement=0;
    int maxElement=0;
    int secondMaxFreq=0;
    int maxFreq=0;

    for(Integer i:map.keySet()){
        if(map.get(i)>maxFreq){
            secondMaxElement=maxElement;
            secondMaxFreq=maxFreq;
            maxFreq=map.get(i);
            maxElement=i;
        }
        else if(map.get(i)>secondMaxFreq){
            secondMaxElement=i;
        }
    }
    System.out.println("Second most freq element is "+secondMaxElement+" and its freq is"+secondMaxFreq);


            if((tic[0][0] == 1 && tic[0][1] ==1 && tic[0][2]==1)||
            (tic[0][0] == 1 && tic[1][0] ==1&& tic[2][0]==1) ||
            (tic[2][0] == 1 && tic[2][1] ==1&& tic[2][2]==1) ||
                    (tic[0][2] == 1 && tic[1][2] ==1&& tic[2][2]==1) ||
                    (tic[0][0] == 1 && tic[1][1] ==1&& tic[2][2]==1)){
                System.out.println("1 is winning");

            }
            else if((tic[0][0] == 1 && tic[0][1] ==1 && tic[0][2]==0)||
                    (tic[0][0] == 1 && tic[1][0] ==1&& tic[2][0]==0) ||
                    (tic[2][0] == 1 && tic[2][1] ==1&& tic[2][2]==0) ||
                    (tic[0][2] == 1 && tic[1][2] ==1&& tic[2][2]==0) ||
                    (tic[0][0] == 1 && tic[1][1] ==1&& tic[2][2]==0)){
                System.out.println("0 is winning");

            }
            else{
                System.out.println("Draw");
            }
            int i1=1;
            while(i1<=10){
                System.out.println(i1);
                i1=i1+1;
            }
        }

//        static void print(int n){
//         if(n<=10){
//             System.out.print(n+" ");
//             n=n+1;
//             print(n);
//
//
//         }
//        }



        static  int print(int n){
          if (n == 3){
              return 3;
          }

          int returnedNumber = print(n+1);
          System.out.println(returnedNumber);
          return n;

        }



    }


