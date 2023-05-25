package com.deep.java.arrays;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class VarArguments {
    public int sum(int... numbers){
        int sum = 0;
        for (int number:numbers){
            sum += number;
        }
        return sum;
    }
    public static void main(String[] args) {
        VarArguments example= new VarArguments();
        System.out.println(example.sum(1,4,5,0));

        System.out.println(example.sum(1,4,5,20));

        System.out.println(example.sum());

    }

    private int computerSimpleInterest(int principal,float interest , int years) {
        assert (principal>0);
                return 100;
    }

    //garbage collector
    void method(){
        Calendar calendar = new GregorianCalendar(2000,10,30);
        System.out.println(calendar);
        System.gc();
    }


}
