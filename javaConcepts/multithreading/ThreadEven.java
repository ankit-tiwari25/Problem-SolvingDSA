package javaConcepts.multithreading;

public class ThreadEven extends Thread{
     Object lock;
    ThreadEven(Object lock){
        this.lock = lock;
    }
    ThreadChance chance = ThreadChance.EVEN;
    @Override
    public  void run(){
        synchronized(lock){
            // Print even numbers
            
        for(int i = 0; i < 10; i = i + 2){
            if(chance == ThreadChance.ODD){
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            System.out.println("Thread Even : i = " + i);
            chance = ThreadChance.ODD;
                lock.notifyAll();       
             }
        }

        
    }
}
