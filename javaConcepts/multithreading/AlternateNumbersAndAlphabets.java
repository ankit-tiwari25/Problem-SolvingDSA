package javaConcepts.multithreading;

public class AlternateNumbersAndAlphabets {
    private static boolean isLetterTurn = true;
    private static final Object lock = new Object();

     public static void main(String[] args) {
        Runnable printLetters = new Runnable(){
            @Override
            public void run(){
                
                    for(char ch = 'A'; ch <= 'Z'; ch++){
                        synchronized(lock){
                            if(!isLetterTurn){
                                try {
                                    lock.wait();
                                } catch (InterruptedException e) {
                                    // TODO Auto-generated catch block
                                    e.printStackTrace();
                                }
                            
                            }
                            System.out.print(" " + ch);
                            isLetterTurn = false;
                            lock.notify();
                        }
                     }
            }
        };

        Runnable printNumbers = new Runnable() {
            public void run(){
                
                    for(int i = 1; i <= 26; i++){
                        synchronized(lock){
                        if(isLetterTurn){
                            try {
                                lock.wait();
                            } catch (InterruptedException e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                            }
                        }
                        System.out.print(" " + i);
                        isLetterTurn = true;
                        lock.notify();

                        }
                }
            }
        };

        Thread t1 = new Thread(printLetters);
        Thread t2 = new Thread(printNumbers);

        t1.start();
        t2.start();

        
    }
}
