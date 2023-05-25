package com.deep.java;

public class InitializerExamples {
    static int count;
    int i;
      {
        System.out.println("Static initializer");
       //compilation error
      // i=6;
       count = count +1 ;
        System.out.println("Count when staic initializer is run is ==>" + count);
    }

    public static void main(String[] args) {
        InitializerExamples examples= new InitializerExamples();
        InitializerExamples examples2= new InitializerExamples();
        InitializerExamples examples3= new InitializerExamples();
    }
}
