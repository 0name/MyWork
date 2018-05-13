package lesson20;

public class Sync {
    private int cnt;

    private static int staticCnt;

    private static final Object monitor = new Object();

    public static void staticIncrement(){
        synchronized (Sync.class) {
            staticCnt++;
        }
    }

    public void increment(){
        synchronized (this) {
            cnt++;
        }
    }

    public void decrement(){
        synchronized (this) {
            cnt--;
        }
    }

    public synchronized void incrementSynchronized() {
        cnt++;
    }

    public synchronized void decrementSynchronized() {
        cnt--;
    }

    public static void main(String[] args) {
        final Sync sync = new Sync();

        for (int i = 0; i<5; i++) {
            new Thread(){
                @Override
                public  void run() {
                    for (int j = 0; j < 100; j++)
                        sync.increment();
                }
            }.start();

            try {
                Thread.sleep(60000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
