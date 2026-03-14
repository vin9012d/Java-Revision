package main.java.Day1;

import java.math.BigDecimal;
import java.math.BigInteger;

public class NumberParts4AirthmaticOperation {

    public static void main(String[] args) {

        // ===============================
        // INTEGER DIVISION
        // ===============================

        int a = 1;
        int b = 2;

        // Both operands are int
        // Java performs integer division → decimal part is discarded
        // Result = 0.5 but int cannot store decimal → becomes 0
        System.out.println(a / b); // 0


        // ===============================
        // FLOAT DIVISION
        // ===============================

        float f1 = 1.0f;
        float f2 = 2.0f;

        // At least one operand is float
        // Java performs floating-point division
        System.out.println(f1 / f2); // 0.5


        // ===============================
        // INT → FLOAT IMPLICIT CONVERSION
        // ===============================

        float f3 = 1;

        // int automatically converted to float
        System.out.println(f3); // 1.0


        // ===============================
        // FLOAT DIVISION AGAIN
        // ===============================

        float f4 = 3;
        float f5 = 2;

        // both float → floating division

        System.out.println(f4 / f5); // 1.5


        // ===============================
        // DOUBLE DIVISION
        // ===============================

        double d1 = 1.0;
        double d2 = 2.0;

        System.out.println(d1 / d2); // 0.5
        // 0.1f ≈ 0.10000000149
// +0.2f ≈ 0.20000000298
//=        0.30000000447
        System.out.println(0.1f+0.2f); // float rounds up only 6-7 digit of decimal


        // ===============================
        // INT → DOUBLE PROMOTION
        // ===============================

        double d3 = 1;
        double d4 = 2;

        // ints converted to double
        System.out.println(d3 / d4); // 0.5


        // ===============================
        // EXACT REPRESENTATION
        // ===============================

        double d5 = 4;
        double d6 = 2;

        // result = 2.0 (exactly representable in binary)
        System.out.println(d5 / d6); // 2.0
        System.out.println(d5);      // 4.0


        // ===============================
        // NON-TERMINATING BINARY FRACTION
        // ===============================

        double d7 = 3;
        double d8 = 2;

        // 3 / 2 = 1.5
        // 1.5 = 1 + 1/2
        // 1/2 = 0.1 in binary → exact
        System.out.println(d7 / d8); // 1.5


        // ===============================
        // FLOATING POINT PRECISION ISSUE
        // ===============================

        double d9 = 0.1;
        double d10 = 0.2;

        // 0.1 and 0.2 cannot be represented exactly in binary
        // stored values are approximate
        // Java prints shortest decimal representation
        System.out.println(d9);  // prints 0.1
        System.out.println(d10); // prints 0.2



        // ===============================
        // FLOATING POINT COMPARISON
        // ===============================

        // 0.2 internally ≈ 0.2000000000000000111
        // multiply by 10 ≈ 2.000000000000000111
        // rounded to closest double → 2.0
        // so comparison becomes 2.0 == 2.0
        System.out.println(0.2 * 10 == 2); // true


        // ===============================
        // FLOATING POINT ADDITION ERROR
        // ===============================

        // actual stored values
        // 0.1 ≈ 0.10000000000000000555
        // 0.2 ≈ 0.20000000000000001110

        // sum ≈ 0.3000000000000000444
        // Java prints shortest decimal that maps to same double
        System.out.println(d9 + d10); // 0.30000000000000004

        // ===============================
// BIGINTEGER (VERY LARGE INTEGERS)
// ===============================

// long max value = 9,223,372,036,854,775,807
// If numbers exceed this range we use BigInteger

        BigInteger big1 = new BigInteger("9223372036854775807123");
        BigInteger big2 = new BigInteger("1000000000000000000000");

// BigInteger is immutable → operations use methods
        BigInteger sum = big1.add(big2);
        BigInteger mul = big1.multiply(big2);
        BigInteger div = big1.divide(big2);

        System.out.println(sum);
        System.out.println(mul);
        System.out.println(div);

        // Used when numbers are extremely large, like:
        //
        //cryptography
        //factorial calculations
        //competitive programming
        //financial systems storing huge counts
        // Example 100! (factorial) this can not fit in long

        // ===============================
// BIGDECIMAL (PRECISE DECIMAL MATH)
// ===============================

// double has precision errors
        System.out.println(0.1 + 0.2); // 0.30000000000000004

// BigDecimal stores exact decimal values

        BigDecimal bd1 = new BigDecimal("0.1");
        BigDecimal bd2 = new BigDecimal("0.2");

        BigDecimal result = bd1.add(bd2);

        System.out.println(result); // 0.3

    }
}
