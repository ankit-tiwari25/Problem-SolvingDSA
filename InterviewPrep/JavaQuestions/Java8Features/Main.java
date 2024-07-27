package InterviewPrep.JavaQuestions.Java8Features;

public class Main {
    public static void main(String[] args) {
        Engineer softwareEngineer = ()-> "Software Engineer!";
        Engineer mechanicalEngineer = ()-> "Mechanical Engineer!";

        System.out.println(softwareEngineer.engineerBranch());
        System.out.println(mechanicalEngineer.engineerBranch());

        Runnable runnable = ()->{
            System.out.println("Hello");
        };

        Thread t1 = new Thread(runnable);
        t1.start();
    }
}
