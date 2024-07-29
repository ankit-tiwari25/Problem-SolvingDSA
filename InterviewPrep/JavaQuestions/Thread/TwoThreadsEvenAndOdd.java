package InterviewPrep.JavaQuestions.Thread;

public class TwoThreadsEvenAndOdd implements Runnable{
    private int threadId;
    
    public TwoThreadsEvenAndOdd(int threadId) {
        this.threadId = threadId;
    }

    public static void main(String[] args) {
        Runnable obj1 = new TwoThreadsEvenAndOdd(1);
        Runnable obj2 = new TwoThreadsEvenAndOdd(2);
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
      
           synchronized(TwoThreadsEvenAndOdd.class){
            for(int i = 0; i < 100; i++){
                if(i% 2 == threadId)
                {
                    System.out.println("Thread id : "+ threadId + " : i +  " + i);
                }
            }
           }
        
        
    }
}
