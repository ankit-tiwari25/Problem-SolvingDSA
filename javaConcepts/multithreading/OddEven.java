package javaConcepts.multithreading;

public class OddEven {
    private static boolean isEven  = true;
    private static final Object lock = new Object();
    public static void main(String[] args) {
        Runnable printEven = (()-> {
            for(int i = 0; i <= 10; i = i + 2){
                synchronized(lock){
                    if(!isEven){
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                    }
                    System.out.print(" " + i);
                    isEven = false;
                    lock.notify();
                }
            }
        });

        Runnable printOdd = (()->{
            for(int i = 1; i <= 10; i = i + 2){
                synchronized(lock){
                    if(isEven){
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                    }
                    System.out.print(" " + i);
                    isEven = true;
                    lock.notify();
                }
            }
        });

        Thread evenThread = new Thread(printEven);
        Thread oddThread = new Thread(printOdd);
        evenThread.start();
        oddThread.start();
    }
}
