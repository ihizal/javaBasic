package com.deep.java.threads;

public class ThreadExamples {
    public static void main(String[] args) {

    class BattingStatisticsThread extends Thread{
        public void run() {
            for (int i=0 ; i<10;i++){
                System.out.println("Running batting statistics" +i);
            }
        }
    }
    class BowlingStatisticsThread implements Runnable {
        //@Override
        public void run() {
            for (int i=0 ; i<10;i++){
                System.out.println("Running bowling statistics" +i);
            }
        }
    }
/**start */
//approach 1
BattingStatisticsThread battingStatisticsThread = new BattingStatisticsThread();
battingStatisticsThread.start();

//approach 2
BowlingStatisticsThread bowlingStatisticsThread=new BowlingStatisticsThread();
Thread batting2= new Thread(bowlingStatisticsThread);
batting2.start();

/**End */
    }
}
