package com.deep.java.threads;

import java.util.concurrent.*;

public class ExecuterServiceExamples {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService= Executors.newSingleThreadExecutor();
        executorService.execute(new Runnable() {        //    @Override
            public void run() {System.out.println("From Executerservice");}
        });
        /**start main */
        executorService.shutdown();

        ExecutorService executorService1=Executors.newSingleThreadExecutor();

        ExecutorService executorService2=Executors.newFixedThreadPool(10);

        ExecutorService executorService3= Executors.newScheduledThreadPool(10);

        Future future= executorService2.submit(new Runnable() {
            //@Override
            public void run() {
                System.out.println(" From executerservice1");
            }
        });

        future.get();

        Future futureFromCallable = executorService2.submit(new Callable() {
            public String call() throws Exception{
                return "RESULT";
            }
        });

        System.out.println("futureFromCallable.get()=" + futureFromCallable.get());

        /**end main */
    }
}
