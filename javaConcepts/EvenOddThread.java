package javaConcepts;

public class EvenOddThread {
    private static final int limit = 10;
    private static Object lock = new Object();
    private static boolean evenThread = true;
  
    public static void main(String[] args) {
        
     
        Thread threadEven = new Thread(new PrintEven());
        Thread threadOdd = new Thread(new PrintOdd());
        threadEven.start();
        threadOdd.start();
    }


static class PrintEven implements Runnable{

    @Override
    public void run() {
        // TODO Auto-generated method stub
        synchronized(lock){
            

            for(int i = 0; i < limit; i += 2){
                if(!evenThread){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                System.out.println("Even Thread : " + i);
                evenThread = false;
                lock.notifyAll();
            }
        }
        
    }
    
}

static class PrintOdd implements Runnable{

    @Override
    public void run() {
        // TODO Auto-generated method stub
        synchronized(lock){
          

            for(int i = 1; i < limit; i +=2){
                if(evenThread){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                System.out.println("Odd thread : " + i);
                evenThread = true;
                lock.notifyAll();
            }
        }
        
    }
    
}
}
