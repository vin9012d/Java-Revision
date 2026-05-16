package main.java;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class Interview {

  public static void main(String[] args) {

    int totalUnit = 20000;
    int amount = 0;
    if (totalUnit < 100) {
      amount = totalUnit * 3;
      totalUnit = 0;
    } else if (totalUnit >= 100) {
      totalUnit = totalUnit - 100;
      amount = 100 * 3;
    }

    System.out.println("step1 " + amount);

    if (totalUnit != 0 && totalUnit >= 100) {
      amount = amount + (100 * 4);
      totalUnit = totalUnit - 100;
    } else {
      amount = amount + (totalUnit * 4);
      totalUnit = 0;
    }

    System.out.println("step2" + amount);
    System.out.println("totalunit" + totalUnit);

    if (totalUnit != 0 && totalUnit >= 100) {
      amount = amount + (100 * 5);
      totalUnit = totalUnit - 100;
    } else {
      amount = amount + (totalUnit * 5);
      totalUnit = 0;
    }

    if (totalUnit != 0) {
      amount = amount + (totalUnit * 6);
    }

    System.out.println(amount);



HashMap<Integer,Integer> map=new HashMap<>();
int[] arr={1,2,3,4,2,1};

for(int i=0;i<arr.length;i++){
  if(map.containsKey(arr[i]))
    map.put(arr[i],map.get(arr[i])+1);
    else
    map.put(arr[i],1);
}

System.out.println(map);
int max=-1;
int secondMax=-1;
for(Integer i:map.keySet()){

  if(map.get(i)<max){
    max=map.get(i);
    secondMax=max;
  }
  else if(secondMax<map.get(i)){
    secondMax=map.get(i);
  }

}

















    //    int[] arr = {1, 2, 3, 1};
    //    Map<Integer, Integer> map = new HashMap<>();
    //    for (int n : arr) {
    //
    //      map.put(n, map.getOrDefault(n, 0) + 1);
    //    }
    //    int maxEle = 0;
    //    int maxFreq = 0;
    //    int secondMaxEle = 0;
    //    int secondMaxFreq = 0;
    //    for (int key : map.keySet()) {
    //      int freq = map.get(key);
    //      if (freq > maxFreq) {
    //        maxFreq = freq;
    //        maxEle = key;
    //      } else if (freq == maxFreq && key < maxEle) {
    //
    //        maxEle = key;
    //      }
    //    }
    //
    //    for (int key : map.keySet()) {
    //      int freq = map.get(key);
    //      if (freq > secondMaxFreq && freq != maxFreq) {
    //        secondMaxFreq = freq;
    //        secondMaxEle = key;
    //      } else if (freq != maxFreq && freq == secondMaxFreq && key < secondMaxEle) {
    //        secondMaxEle = key;
    //      }
    //    }
    //
    //    System.out.println("Max element is: " + maxEle + " and its frqeuncy is: " + maxFreq);
    //    System.out.println(
    //        "Max element is: " + secondMaxEle + " and its frqeuncy is: " + secondMaxFreq);
    //    System.out.println("Have a Good Day :)");
  }
}
