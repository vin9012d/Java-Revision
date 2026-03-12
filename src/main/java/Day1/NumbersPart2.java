package main.java.Day1;
public class NumbersPart2{

    public static void main(String[] args){
        byte b = 125;
        // byte c = b+12; -->cant do this because byte + int = int so cant store int in byte
        byte c = (byte) (b+12);
        System.out.println(c); // cycle follow

        int  i = b+12;
        System.out.println(i);

        byte d = 10;
        byte e = 20;

        // byte f = d + e; //cant do this because byte + int = int so cant store int in byte
        // byte/short/char arithmetic → promoted to int during airthmatic operations







    }


}
