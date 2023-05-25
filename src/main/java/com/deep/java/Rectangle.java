package com.deep.java;

import java.io.*;

public class Rectangle implements Serializable {
    int length;
    int breadth;
    transient int area;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
        area = length * breadth; // constructer
    }

    private  void writeObject(ObjectOutputStream os) throws IOException{
        os.defaultWriteObject();
    }
    private  void readObject(ObjectInputStream is) throws  IOException,ClassNotFoundException{
        is.defaultReadObject();
        area=this.length * this.breadth;
    }

    public class SerializationExample{
        public static void main(String[] args)  throws  IOException,ClassNotFoundException {
            //Serialization object
            FileOutputStream fileOutputStream=new FileOutputStream("Rectangle.txt");
            ObjectOutputStream objectOutputStream= new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(new Rectangle(5,6));
            objectOutputStream.close();

            // Deseriliazation an object
            FileInputStream fileInputStream = new FileInputStream("Rectangle.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Rectangle rectangle= (Rectangle) objectInputStream.readObject();
            objectInputStream.close();

            System.out.println(rectangle.length);
            System.out.println(rectangle.breadth);
            System.out.println(rectangle.area;
        }
    }
}
