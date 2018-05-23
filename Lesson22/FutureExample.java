package Lesson22;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class FutureExample {

    private static String result;

    public static void main(String[] args) {

    }

//    private static void runnable() throws InterruptedException {
//        Thread t = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                synchronized (FutureExample.class){
//                    result = "Runnable";
//                }
//            }
//        });
//
//        t.start();
//        t.join();
//
//        System.out.println(result);
//    }
//
//    private static void callable(){
//        String prefix = "prefix";
//
//        FutureTask<String> task = new FutureTask<>(new Callable<String>(){
//            @Override
//            public String
//        }
//    }
}
