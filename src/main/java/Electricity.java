package main.java;

public class Electricity {

    // if your home electricity usage per month is 308 units.
    // Rate of electricity usage per unit as following
    // for first 50unit 3 rs/unit
    // 51-100 unit 4 rs/unit
    //101-300 units 5 rs/unit
    // 301-400 unit 6 rs/unit
    public static  void  main(String[] args){

    int unit =49;
    int amount=0;
    int pendingUnit=0;

    while(unit!=0){
        if(unit<=50){
            amount=amount*3;
            pendingUnit=pendingUnit-50;
        }
    }
    System.out.println("bill is"+amount);
    System.out.println("pendingunit is"+pendingUnit);
}
}
