package Lection19;

public class Multithreading {
    public static void main(String[] args) {
        Thread thread = new HelloThread();
        thread.start();

        Thread thread1 = new Thread(new HelloThread1());
        thread1.start();
    }

    public static class HelloThread extends Thread{
        @Override
        public void run(){
            System.out.println("Hello, multithreaded World!");
        }

    }

    public static class HelloThread1 implements Runnable{

        @Override
        public void run() {
            System.out.println("Hello, multithreaded World1!");
        }
    }
}
