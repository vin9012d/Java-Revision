package main.java.Day1;

public class NumbersPart3AirthmaticOperation {

    public static void main (String[] args){

        // Rule 1: 1️⃣ Binary Numeric Promotion (Main Rule)
        //
        //In any arithmetic operation (+ - * / %), Java promotes operands to a common larger type before calculation.
        //
        //Promotion order  byte → short → char → int → long → float → double

        //Rule 2:  byte, short, char always become int

        //Even if both operands are small types, Java converts them to int before calculation.
        byte b1 = 5;
        byte b2 = 10;
       //  byte b3 = b1 +b2; // compiler error Required type: byte provided int
        int a =  b1+b2; // no error
        byte b3 = (byte)(b1+b2); // no error explicity type casting


       char c1='a';
       char c2 ='b';
       // char c3 = c1+c2; // compiler error Required type: char , provided int

        int i1 = Integer.MAX_VALUE;
        int i2 = Integer.MAX_VALUE;
        System.out.println("i1 "+i1 +" i2 "+i2);
        int i3 = i1+i2; // cycle (Overflow) concept will be applied
        System.out.println("i1 "+i1 +" i2 "+i2 +" = "+i3);


        long l1 = 1000L;
        //  int i4 = 10+1000L; // Compiler error Required type:int Provided: long
        // int + long =long

        // float + int = float
        float f1 = 0.1f + 10;

       //  int i4 = 0.1f+10; // compiler error required type int provided float


      //   float + double = double

      //  float f2 = 0.1f+0.2; // Required type: float , provided double

      float f3 = 1+2;    // upcasting
        long d4= 1L;
      double d3= 0.2 + d4 ;
      // long d5 = d3+d4; //Required type: long provided double

        //if both operands are integers, result is integer.
        int i6 = 10 / 3;
        System.out.println(i6); // 3

        // For decimal
        double b = 10 / 3.0; // 3.333

        //6️⃣ char behaves like an integer
        //
        //char uses Unicode numeric value.
        //
        //Example:
        char c = 'A';
        c++;

        System.out.println(c); // B
        System.out.println('A' + 1); // 66

        //7️⃣ Compile-time constant exception (very important, often missed)

        //If calculation is constant at compile time and result fits into smaller type, Java allows it.

       // Example:
        byte b4 = 10 + 20;  // allowed

       // But
        byte b5 = 10;
        byte b6 = 20;
      //  byte b7 = a + b; // error

        // Why compile-time?

        //Because the compiler already knows the type mismatch before running the program.
        // Java rule: byte + byte → int


     // += automatically casts the result to the type of the left variable.
        byte b8 = 10;
        b8 += 20;   // allowed because java internally does b = (byte)(b + 20); ( typecasting for += )


        // but
        byte b9 = 10;
        // b9 = b9 + 20;   // compile-time error // b + 20 → int




    }
}
