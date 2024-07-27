package InterviewPrep.JavaQuestions;

class Parent{
    public void run(){
        System.out.println("Parent is running");
        walk();
    }
    public void walk(){
        System.out.println("Parent is walking...");
    }
}

class Child extends Parent{
    @Override
    public void run() {
        // TODO Auto-generated method stub
        super.run();
        System.out.println("Child is running...");
    }
    @Override
    public void walk() {
        // TODO Auto-generated method stub
        super.walk();
        System.out.println("Child is walking...");
    }
}
public class ParentChildRelationship {
    public static void main(String[] args) {
        Parent p = new Child();
        p.run();
    }
}
