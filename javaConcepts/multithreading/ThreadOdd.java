package javaConcepts.multithreading;

public class ThreadOdd extends Thread{
     Object lock;
    ThreadChance chance = ThreadChance.ODD;
    ThreadOdd(Object lock){
        this.lock = lock;
    }
    @Override
    public  void run(){

        synchronized(lock){
             // Print odd numbers
             
            for(int i = 1; i < 10; i = i + 2){
                if(chance == ThreadChance.EVEN){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                 }
                System.out.println("Thread odd : i = " + i);
                chance = ThreadChance.EVEN;
                lock.notify();
            }
        }
       

       
        
    }
}
