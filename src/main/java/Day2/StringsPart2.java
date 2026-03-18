package main.java.Day2;

public class StringsPart2 {

    /*
    JAVA StringBuilder vs StringBuffer – Short Interview Revision
==============================================================

1. Basic Definition
-------------------

StringBuilder:
A mutable sequence of characters used to create and modify strings efficiently.
It is NOT thread-safe.

StringBuffer:
A mutable sequence of characters similar to StringBuilder, but it IS thread-safe.


2. Key Difference
-----------------

The main difference is synchronization.

StringBuilder -> Not synchronized (faster)
StringBuffer  -> Synchronized (thread-safe but slower)


3. Performance
--------------

StringBuilder is faster because it does not use synchronization.

StringBuffer is slower because methods are synchronized to support multi-threading.


4. Thread Safety
----------------

StringBuilder:
Not thread-safe.
Should be used in single-threaded environments.

StringBuffer:
Thread-safe.
Can be safely used when multiple threads access the same object.


5. Internal Working
-------------------

Both use a mutable internal character array.

char[] value
int count

Operations like append(), insert(), delete() modify the same array instead of creating new objects.


6. Example
----------

StringBuilder example:

StringBuilder sb = new StringBuilder("Java");
sb.append(" Developer");

Result:
"Java Developer"


StringBuffer example:

StringBuffer sb = new StringBuffer("Java");
sb.append(" Developer");


7. Memory Behavior
------------------

Both objects are created in Heap memory.
Neither StringBuilder nor StringBuffer uses the String Pool.


8. When to Use
--------------

Use StringBuilder:
- When thread safety is not required
- For better performance
- Most common in modern applications

Use StringBuffer:
- When multiple threads modify the same string object


9. Quick Interview Table
------------------------

Feature           StringBuilder       StringBuffer
---------------------------------------------------
Thread-safe       No                  Yes
Synchronization   No                  Yes
Performance       Faster              Slower
Introduced in     Java 5              Java 1.0
Memory location   Heap                Heap


10. Simple Rule
---------------

Single-threaded environment  -> Use StringBuilder
Multi-threaded environment   -> Use StringBuffer


     */
}
