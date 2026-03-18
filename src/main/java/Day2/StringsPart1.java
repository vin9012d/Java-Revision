package main.java.Day2;

public class StringsPart1 {



    /*
    JAVA STRING INTERNING & new String() – INTERVIEW REVISION NOTES
===============================================================

1. What is String Interning?
----------------------------
String Interning is a mechanism in Java where identical String values share a single object in a special memory area called the String Pool.

The goal is memory optimization. If multiple variables contain the same literal value, Java stores only one copy and reuses it.

Example:

String s1 = "Java";
String s2 = "Java";

Both variables refer to the same object stored in the String Pool.

Memory Concept:

String Pool
-----------
"Java"

s1 -----> "Java"
s2 -----> "Java"

This saves memory and improves performance.

Key Point:
String Pool stores only unique string literals.



2. What is the String Pool?
---------------------------
The String Pool is a special area inside the Heap memory where Java stores string literals.

Example:

String a = "Hello";
String b = "Hello";

Only one object exists in the pool.

String Pool
-----------
"Hello"

a ---> "Hello"
b ---> "Hello"



3. What happens with new String()?
----------------------------------
When we use the new keyword, Java always creates a new object in Heap memory.

Example:

String s = new String("Java");

Internally two things may happen:

Step 1:
The literal "Java" is placed in the String Pool if it does not already exist.

Step 2:
A new String object is created in Heap memory.

Memory Representation:

String Pool
-----------
"Java"

Heap
----
String object -> "Java"

Variable:
s ----> Heap object



4. Important Rule about new
---------------------------
The keyword "new" guarantees creation of a new object.

Example:

String s1 = new String("Java");
String s2 = new String("Java");

Memory:

String Pool
-----------
"Java"

Heap
----
Object1 -> "Java"
Object2 -> "Java"

Result:

s1 == s2  → false

Because both references point to different heap objects.



5. Why Java does not reuse the Pool object when using new
----------------------------------------------------------
Because using "new" explicitly requests a fresh object.

If Java reused the pool object, then the following code would behave incorrectly:

String s1 = new String("Java");
String s2 = new String("Java");

Expected behavior:

s1 == s2  → false

Therefore, Java must create separate heap objects.



6. What does intern() do?
-------------------------
The intern() method returns the reference of the String Pool object.

If the string already exists in the pool:
- it returns the existing pooled reference.

If it does not exist:
- it adds the string to the pool.

Example:

String s1 = new String("Java");
String s2 = s1.intern();

Memory:

String Pool
-----------
"Java"

Heap
----
new String("Java")

References:

s1 -> heap object
s2 -> pool object



7. Object Creation Summary
--------------------------

Code                         Objects Created
------------------------------------------------
String s = "Java";           1 object (pool)
new String("Java");          heap object + pool literal
s.intern();                  returns pool object
StringBuilder                only heap objects



8. Important Interview Points
------------------------------

1. String literals go to the String Pool.
2. String Pool exists inside the Heap (since Java 7).
3. new String() always creates a new object in Heap.
4. String objects are immutable.
5. String Pool works safely because Strings cannot be modified.
6. intern() returns the pooled version of a String.



9. Common Interview Questions
------------------------------

Q1:
String s1 = "Java";
String s2 = "Java";

s1 == s2 ?

Answer:
true (both reference the same pool object)


Q2:
String s1 = new String("Java");
String s2 = "Java";

s1 == s2 ?

Answer:
false (heap vs pool)


Q3:
String s1 = new String("Java").intern();
String s2 = "Java";

s1 == s2 ?

Answer:
true (both reference pool object)


END OF NOTES

PART -2
JAVA == vs equals() – INTERVIEW REVISION NOTES
==============================================

1. Basic Difference
-------------------

In Java, == and equals() are used to compare objects, but they behave differently.

==  -> compares references (memory addresses)
equals() -> compares values (content)


Example:

String s1 = "Java";
String s2 = "Java";

s1 == s2        -> true
s1.equals(s2)   -> true

Reason:
Both variables refer to the same object in the String Pool.



2. Heap vs Pool Example
-----------------------

String s1 = new String("Java");
String s2 = "Java";

s1 == s2        -> false
s1.equals(s2)   -> true

Explanation:

String Pool
-----------
"Java"

Heap
----
new String("Java")

s1 -> heap object
s2 -> pool object

== compares reference → different objects
equals() compares value → same content



3. Two new String() Objects
---------------------------

String s1 = new String("Java");
String s2 = new String("Java");

s1 == s2        -> false
s1.equals(s2)   -> true

Reason:
Two different heap objects.



4. String Interning Case
------------------------

String s1 = new String("Java").intern();
String s2 = "Java";

s1 == s2        -> true
s1.equals(s2)   -> true

Reason:
Both references point to the same String Pool object.



5. Compile Time Optimization
-----------------------------

String s1 = "HelloWorld";
String s2 = "Hello" + "World";

s1 == s2        -> true

Explanation:
The Java compiler optimizes constant expressions at compile time.
So "Hello" + "World" becomes "HelloWorld".

Both references point to the same pool object.



6. Runtime Concatenation Case
-----------------------------

String s1 = "HelloWorld";

String a = "Hello";
String b = "World";

String s2 = a + b;

s1 == s2        -> false
s1.equals(s2)   -> true

Reason:
a + b happens at runtime, creating a new object in Heap.



7. StringBuilder Case
---------------------

String s1 = "Java";

StringBuilder sb = new StringBuilder("Java");
String s2 = sb.toString();

s1 == s2        -> false
s1.equals(s2)   -> true

Reason:
toString() creates a new String object in Heap.

Let's understand how StringBuilder works
    Let's understand how StringBuilder works

1. StringBuilder sb = new StringBuilder("Java");

   Internally:
   - A StringBuilder object is created in the Heap.
   - It maintains an internal character array.

   char[] value = {'J','a','v','a'}
   count = 4


2. sb.append('c');

   The same internal array is updated (if capacity allows).

   char[] value = {'J','a','v','a','c'}
   count = 5

   No new object is created.


3. String s1 = sb.toString();

   A new String object is created in the Heap.
   The characters are copied from StringBuilder's internal array.

   s1 -> "Javac"


4. String s2 = sb.toString();

   Another new String object is created in the Heap.

   s2 -> "Javac"


5. Comparison

   s1 == s2       → false
   (because they are different objects in Heap)

   s1.equals(s2)  → true
   (because the contents are the same)



8. equals() with null
----------------------

String s1 = null;

s1.equals("Java");   -> NullPointerException

Safer comparison:

"Java".equals(s1)

This avoids NullPointerException.



9. Object Class Behavior
------------------------

Default equals() in Object class behaves like ==.

Example:

class Person {
    String name;
}

Person p1 = new Person();
Person p2 = new Person();

p1.equals(p2)  -> false

Reason:
Object.equals() compares references unless overridden.



10. Wrapper Class Example
-------------------------

Integer a = 100;
Integer b = 100;

a == b        -> true
a.equals(b)   -> true

Because values between -128 and 127 are cached in Integer pool.

But:

Integer a = 200;
Integer b = 200;

a == b        -> false
a.equals(b)   -> true



11. String Comparison Best Practice
-----------------------------------

Always prefer equals() when comparing strings.

Correct:

if (s1.equals(s2))

Safer version:

if ("Java".equals(s1))



12. Quick Interview Table
-------------------------

Comparison Type        ==                  equals()
------------------------------------------------------
Primitive              compares value      not used
Objects                compares reference  compares value
Strings                reference compare   content compare
Custom objects         reference compare   depends on override



13. Common Interview Questions
------------------------------

Q1:

String s1 = "Java";
String s2 = new String("Java");

s1 == s2 ?

Answer:
false


Q2:

String s1 = "Java";
String s2 = "Ja" + "va";

s1 == s2 ?

Answer:
true (compile time optimization)


Q3:

String s1 = "Java";
String a = "Ja";
String b = "va";
String s2 = a + b;

s1 == s2 ?

Answer:
false (runtime concatenation)


Q4:

String s1 = new String("Java").intern();
String s2 = "Java";

s1 == s2 ?

Answer:
true


END OF NOTES
     */

}
