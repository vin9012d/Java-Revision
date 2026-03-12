package main.java.Day1;

public class Numbers{

    public static void main (String[] args){

        System.out.println("Hello, World");

        // Number data types in java
/*
        What Are Primitive Types?
        In Java, primitive types are the most basic data types that hold simple values. There are eight primitive types you need to know:

        byte: 8-bit signed integer default value 0
        short: 16-bit signed integer default value 0
        int: 32-bit signed integer default value 0
        long: 64-bit signed integer default value 0.0L
        float: 32-bit floating-point default value is 0.0f
        double: 64-bit floating-point default value is 0.0d
        char: 16-bit Unicode character default value is '\u0000' (null character)
        boolean: Represents true or false default value is false

        Each of these types has a specific size and range, which you’ll need to consider when choosing the right one for your variables. The choice of primitive type can impact both performance and memory consumption.
 1 bit = 0 or 1
 1 Byte = 8 bits
 1 KB = 1024 Bytes
 1 MB = 1024 KB

 when we store num 1 in byte
 8 bits = 1 byte
 00000001

 and when stored with int
 00000000 00000000 00000000 00000001
 32 bits = 4 bytes

Detailed Examination of Each Type
Numeric Types
Integer Types
We have three integer types: byte, short, int, and long. Each has its own size and can store different ranges of values.

byte: Ranges from -128 to 127
short: Ranges from -32,768 to 32,767
int: Ranges from -2,147,483,648 to 2,147,483,647
long: Ranges from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807


Floating-Point Types
For numbers that require decimal points, we use float and double.

float: Single-precision (32-bit) floating-point
double: Double-precision (64-bit) floating-point
Since double has more precision, it is typically the default choice for floating-point numbers. Here’s how to use them:

Java memory mainly has Stack and Heap.

Primitive types (int, byte, long, etc.) store the actual value directly.

Object variables store a reference (memory address), not the actual data.

Local variables are stored in Stack memory.

Objects are created in Heap memory using new.

Instance variables live inside objects in the Heap.

Static variables are stored in the Method Area (Metaspace) and shared across objects.
*/
        float f = 5.75f; // Use 'f' for float literals
        double d = 19.99; // No suffix needed for double

        System.out.println("Float: " + f);
        System.out.println("Double: " + d);

        /*
        Be careful with floating-point arithmetic. Due to precision issues, calculations might not yield expected results. For example, adding 0.1 and 0.2 might not equal 0.3. Always consider using BigDecimal for precise calculations.
         */

        int n = Integer.MAX_VALUE;
        System.out.println(n);

    }

        }