package com.deep.java.enums;

public class Enum {
    enum Season{
        WINTER , SUMMER,SPRING,FALL
    }
    public static void main(String[] args) {
       // method enum{WINTER,SUMMER}; Complation error

        // Converting String to Enum
        Season season = Season.valueOf("FALL");
          // Converting enum to string
         System.out.println(season.name());

         System.out.println(Season.WINTER.ordinal());
        System.out.println(Season.SPRING.ordinal());
        System.out.println(Season.SUMMER.ordinal());

        for (Season season1 : Season.values()){
            System.out.println(season1.name());
        }

        //Comparing to enums
        Season season1 = Season.FALL;
        Season season2 = Season.FALL;

        System.out.println(season1 == season2); // true
        System.out.println(season1.equals(season1)); // true
    }
}
