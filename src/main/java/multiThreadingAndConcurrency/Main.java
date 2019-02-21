package multiThreadingAndConcurrency;

import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        long startTime = System.nanoTime();


       String[] filesList = {"D:\\11.txt","D:\\12.txt","D:\\13.txt","D:\\14.txt","D:\\15.txt"};
/*
         try {
            for (String str: filesList )
                Adder.doAdd(str , "D:\\total.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
*/
/*
        *//**  Using threads  *//*
        for (int i = 0; i<filesList.length; i++ ){
            AdderWithThreads adder = new AdderWithThreads(filesList[i] , "D:\\total.txt");
            Thread thread = new Thread(adder);
            thread.start();
            thread.join();
        }*/

/*

        */
/**  Using threads with join() methods to wait for the threads to finish  *//*
        Thread[] threads = new Thread[filesList.length];
        for (int i = 0; i<filesList.length; i++ ){
            AdderWithThreads adder = new AdderWithThreads(filesList[i] , "D:\\total.txt");
            threads[i] = new Thread(adder);
            threads[i].start();
        }
        for(Thread t : threads){
            t.join();
        }
*/


        /**  Using threads with join() methods to wait for the threads to finish  */
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 0; i<filesList.length; i++ ){
            AdderWithThreads adder = new AdderWithThreads(filesList[i] , "D:\\total.txt");
            executorService.submit(adder);
        }
        executorService.shutdown();
        executorService.awaitTermination(60, TimeUnit.SECONDS);

        /**  claculate Runtime   */
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("Running time: " + totalTime/100000);
    }
}
