package Multithreading.PlainThreads;

public class AliveJoin {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(){
            @Override
            public void run(){
                Thread curThread = Thread.currentThread();

                //System.out.println(curThread.getName() + " isAlive: " + curThread.isAlive());
                System.out.println(curThread.getName() + " state: " + curThread.getState());
            }
        };

        //System.out.println("Before start isAlive:" + t.isAlive());
        System.out.println("Before start state:" + t.getState());

        t.start(); // запуск потока

        t.join(); // ждет завершения потока

        //System.out.println("After joint isAlive: " + t.isAlive() );
        System.out.println("After joint state: " + t.getState() );
    }
}
