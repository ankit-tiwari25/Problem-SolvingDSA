package javaConcepts.multithreading;

public class Main {
    private static Object lock;
    public static void main(String[] args) {
        lock = new Main();
        ThreadEven threadEven = new ThreadEven(lock);
        ThreadOdd threadOdd = new ThreadOdd(lock);
        threadEven.start();        
        threadOdd.start();
    }
}
