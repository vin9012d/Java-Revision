package main.java.Day5Genertics;

public class GenericsPart1 {
    /*
    At its core, generics enable you to create a single class, interface, or method that can operate on different types
     while providing compile-time type safety. Before generics were introduced in Java 5, developers often used raw types,
      which could lead to several issues, such as unchecked type casts and potential ClassCastException at runtime.
     */


    public static void main(String[] args){

        Box box =new Box();
        box.setItem(1);
        Integer num =(Integer) box.getItem(); // we had to explicitly typecase here , but we can solve this using generics
        GenericBox<Integer> gbox = new GenericBox<>();
        gbox.setItem(1);
        Integer n = gbox.getItem();






    }

    public  static  class Box{
        Object item;

        public void setItem(Object item) {
            this.item = item;
        }
        public Object getItem(){
            return item;
        }
    }
/*
In this Box class, we define a type parameter T. This enables the Box to hold any type of object,
 whether it's a String, an Integer, or any custom object. When you create an instance of Box, you specify the type
 */
    public static class GenericBox<T> {
        private T item;

        public void setItem(T item) {
            this.item = item;
        }

        public T getItem() {
            return item;
        }
    }
// This convess Pair class can have 2 generic variables
    public class Pair<K, V> {
        private K key;
        private V value;

        public Pair(K key, V value) {
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

    // Generic Methods
    public class GenericMethodExample {
        // A generic method that prints an array of any type

        public static <T> void printArray(T[] array) { // here it says this method accepts <T> one generic variables in the parameter
            for (T element : array) {
                System.out.println(element);
            }
        }

        public static void main(String[] args) {
            Integer[] intArray = {1, 2, 3, 4, 5};
            String[] strArray = {"Hello", "World"};

            printArray(intArray); // Prints integers
            printArray(strArray); // Prints strings
        }
    }



}
