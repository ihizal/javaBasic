package com.deep.java;

import java.io.ObjectOutputStream;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       // ObjectOutputStream objectOutputStream= new ObjectOutputStream();
  //      objectOutputStream.writeObject(); // serialize and write to file
//
      tokenize("ac;bd;def;e",";");
      String sst="a ;b ;c ; d; d";
      sst.split(";");


       System.out.println(sst);
    }
private  static  void tokenize (String string , String regex ){
        String[] tokens = string.split(regex);
        System.out.println(Arrays.toString(tokens));

}
}

