package com.deep.java.arrays;

import java.util.List;

public class GenericSample {
    static class  MyList{
        private List<String> values;

        void add(String value){
            values.add(value);
        }

        void  remove(String value){
            values.remove(value);
        }
    }

    static class MyListGeneric<T>{
        private List<T> values;

        void add(T value){
            values.add(value);
        }
        void remove(T value){
            values.remove(value);
        }
        T get(int index){
            return values.get(index);
        }
    }

    static class MyListRestricted<T extends  Number>{
        private List<T> values;

        void add(T value){
            values.add(value);
        }

        void remove(T value){
            values.remove(value);
        }
        T get(int index){
            return values.get(index);
        }
    }

    static <x extends Number> x doSomething( x number){
        x result = number;
        return result;
    }
    public static void main(String[] args) {
       /*Non generic*/
        MyList myList = new MyList();
        myList.add("Value 1");
        myList.add("Value 2");
        //System.out.println("homework");

        /*Generic*/
        MyListGeneric<String> myListString = new MyListGeneric<String>();
        myListString.add("Value 1");
        myList.add("Value 2");
        //System.out.println("homework");

        MyListGeneric<Integer> myListInteger = new MyListGeneric<>();
        myListInteger.add(1);
        myListInteger.add(2);

        MyListRestricted<Integer> restrictedListInteger= new MyListRestricted<Integer>();
        restrictedListInteger.add(1);
        restrictedListInteger.add(2);
        //System.out.println("homework");
      //  MyListRestricted<String> restrictedListString= new MyListRestricted<String>();

Integer i = 5;
Integer k = doSomething(i);

    }
}
