package ContestQuestions.Leucine;

 class A {
    void m1(){
        System.out.println("in M1 A");
    }
}

 class  B extends A {

    void m1(){
        System.out.println("M1 - B");
    }
    void m2(){
        System.out.println("M2 - B");
    }
}

public class Solutioin6 {
    public static void main(String[] args) {
        A a = new B();
        a.m2();
    }
}
