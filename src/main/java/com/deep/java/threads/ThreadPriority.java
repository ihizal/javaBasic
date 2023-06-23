package com.deep.java.threads;

public class ThreadPriority {
    public static void main(String[] args) throws InterruptedException {
        /*TODO look this change parameters on runtime
        Thread.MAX_PRIORITY(10);
        Thread.MIN_PRIORITY(1);
        Thread.NORM_PRIORITY(5);*/
        class ThreadExample extends Thread{

            public  void run(){
                for (int i = 0; i <10 ; i++) {
                    System.out.println(this.getName() + " Running =" +i);
                }
            }
        }
        /**start*/
        ThreadExample threadExample1=new ThreadExample();
        threadExample1.setPriority(8);


        ThreadExample threadExample2= new ThreadExample();
        ThreadExample threadExample3= new ThreadExample();
        ThreadExample threadExample4= new ThreadExample();


        threadExample3.start();
        threadExample2.start();
       threadExample3.join(); //wait for thread 3 to complete
        System.out.println("Thread 3 completed");
        threadExample4.start();

        System.out.println("Thread 3 start --->");
        threadExample4.join(9000);
        /**end*/
    }
}
