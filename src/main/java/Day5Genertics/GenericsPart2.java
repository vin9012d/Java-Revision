package main.java.Day5Genertics;

public class GenericsPart2 {




        // A generic method to create a pair
        public static <K, V> Pair1<K, V> createPair(K key, V value) {
            return new Pair1<>(key, value); // Java internally convert this to return new Pair1<String, Integer>(key, value);
            // it converts because of return type hass generic Pair1<K, V>
        }
    public static <T extends Number> void printNumber(T number) {
        System.out.println(number);
    }

    public static <T extends Number & Comparable<T>> void compareNumbers(T a, T b) {
        if (a.compareTo(b) > 0) {
            System.out.println(a + " is greater than " + b);
        } else if (a.compareTo(b) < 0) {
            System.out.println(a + " is less than " + b);
        } else {
            System.out.println(a + " is equal to " + b);
        }
    }

        public static void main(String[] args) {
            Pair1<String, Integer> pair = createPair("One", 1);
            System.out.println("Key: " + pair.getKey() + ", Value: " + pair.getValue());

            /*
            What Are Bounded Type Parameters?
Bounded type parameters allow you to restrict the types that can be used as arguments for a type parameter.
This is particularly useful when you want to ensure that the types passed to your generic classes or methods are of a certain type or subclass.
 In Java, you can use the extends keyword to specify an upper bound for a type parameter.

For example, consider a scenario where you want to create a method that works with numbers.
 You might want to ensure that the method can accept only types that extend Number, like Integer, Double, or Float.

             */
            // Usage
            // Usage
            printNumber(10); // Integer
            printNumber(10.5); // Double
          //  printNumber("dfdsfds"); //Required type:T Provided: String reason: no instance(s) of type variable(s) exist so that String conforms to Number

          /*
          Multiple Bounds
Sometimes, you may want to impose multiple bounds on a type parameter. For instance,
 you might want a type to be a subclass of a specific class and also implement one or more interfaces.
 In Java, you can achieve this by using the & operator.


           */

            // Usage
            compareNumbers(10, 5); // Integer
            compareNumbers(10.5, 20.0); // Double



            /*
            At its core, type erasure is the process by which the Java compiler removes all generic type information during the compilation of your code.
            This means that when your code runs, the generic types you defined are replaced with their bounds or Object if no bounds are specified.

For example, consider the following generic class:
class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

After type erasure, the Java compiler transforms it to something like this:

class Box {
    private Object item;

    public void setItem(Object item) {
        this.item = item;
    }

    public Object getItem() {
        return item;
    }
}

The generic type T is replaced with Object, and this allows Java to maintain backward compatibility with non-generic code.
This is crucial because it means that older Java code that does not use generics can still work seamlessly with new generic code.


             */

        }




    public static class Pair1<K, V> {
        private K key;
        private V value;

        public Pair1(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }

}
