package com.deep.java.threads;


    class SpreadSheet {
        int cell1, cell2, cell3;

        int setandGetSum(int a1, int a2, int a3) {
            cell1 = a1;
            sleepForSomeTime();
            cell2 = a2;
            sleepForSomeTime();
            cell3 = a3;
            sleepForSomeTime();
            return cell1 + cell2 + cell3;
        }


        void sleepForSomeTime() {
            try {
                Thread.sleep(10 * (int) (Math.random() * 100));
            } catch (InterruptedException e) {
                //throw new RuntimeException(e);
                e.printStackTrace();
            }
        }

        class SyncronizedSyntaxExample {
            static int count;
            int instanceValue;

            synchronized void syncronizedExample1() {

            }

            void syncronizedExample2() {
                synchronized (this) {

                }
            }

            synchronized static int getCount() {
                return count;
            }

            static int getCount2() {
                synchronized (SyncronizedSyntaxExample.class) {
                    return count;
                }
            }

        }
    }
    public class ThreadExampleSyncronized implements Runnable{
        SpreadSheet spreadSheet= new  SpreadSheet();

        @Override
        public void run() {
            for (int i = 0; i <4 ; i++) {
                System.out.println(spreadSheet.setandGetSum(i,i+2,i*3)+" ");
            }

        }

        public static void main(String[] args) {

            /***/

            ThreadExampleSyncronized r = new ThreadExampleSyncronized();
            Thread one=new Thread(r);
            Thread two=new Thread(r);

            one.start();
            two.start();
        }

    }

