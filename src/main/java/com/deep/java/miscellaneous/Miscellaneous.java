package com.deep.java.miscellaneous;

import java.util.Arrays;

public class Miscellaneous {
    public static void main(String[] args) {
        //New array  alwasy initialized with default values
        int marks2[]= new int[5];
       // System.out.println(marks2[0]);//0

        for (int mark: marks2){
            //System.out.println(mark);
        }
        //hashcode
        int marks5[]= {25,30,50,10,5};
                //System.out.println(marks5);
       // System.out.println(Arrays.toString(marks5));


        int[][] matrix3 = {{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(matrix3));

        //compare two array
        int[] numbers1 = {1,2,3};
        int[] numbers2 = {4,5,6};

        int[] numbers3 = {1,2,3};

        System.out.println(Arrays.equals(numbers1,numbers3));

    }

}
