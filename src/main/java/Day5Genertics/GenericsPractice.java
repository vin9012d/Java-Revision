package main.java.Day5Genertics;

import java.util.List;

public class GenericsPractice {


    public static class Box<T> {
        T box;
        public T getBox(){
            return box;
        }
        public void setBox(T box){
            this.box = box;
        }

    }


    public static class UpperBoundGenericBox<T extends Number> {    // allows only number and its child class
        T box;
        public T getBox(){
            return box;
        }
        public void setBox(T box){
            this.box = box;
        }

    }

    public void printListWildUpperBound(
            List<? extends Number> list) {

        for(Number n : list) {
            System.out.println(n);
        }
    }

    public void printListWildLowerBound(
            List<? super Number> list) {

        for(Object n : list) {
            System.out.println(n);
        }
    }

    public void printListWildL(
            List<?> list) {

        for(Object n : list) {
            System.out.println(n);
        }
    }
    public static void main(String[] args){

        Box<String> box =new Box<>();
        box.setBox("meow");

      //   UpperBoundGenericBox<String> b1 = new UpperBoundGenericBox<>(); // Type parameter 'java.lang.String' is not within its bound; should extend 'java.lang.Number'

        UpperBoundGenericBox<Integer> b1 = new UpperBoundGenericBox<>();
        UpperBoundGenericBox<Double> b2 = new UpperBoundGenericBox<>();

      // Wild card with upper bound and lower boud
        // Upper bound






    }
}
