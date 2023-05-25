package com.deep.java.arrays;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        int marks[]; // Not readable
        int[] runs; // Not readable
        int[] temperatures; // Recommended

        //int values[5]; // Compalaiton Error

        marks = new int[5];
        // Default Values
        // byte , short ,int , long - 0
        // float,double,bigdecimal - 0.0
        // boolean false
        // object - null

        marks[0] = 25;
        marks[1] = 30;
        marks[2] = 50;
        marks[3] = 10;
        marks[4] = 5;
        System.out.println(Arrays.toString(marks));
        //System.out.println(marks[0][1]);


        int[][] matrix = {{1,2,3},{4,5,6}};
        System.out.println(matrix[0][1]);
        System.out.println(matrix[1][2]);
        System.out.println(Arrays.deepToString(matrix));

        int marks4[] = {10,15};

        String[] daysofWeek = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        Arrays.sort(daysofWeek);
        for (String day:daysofWeek){
            System.out.println(day);
        }


        int[][] matrixA =new int[3][];

        int rollNos[] = {12,3,5,7};
        Arrays.sort(rollNos);
        System.out.println(Arrays.toString(rollNos));
    }
}
