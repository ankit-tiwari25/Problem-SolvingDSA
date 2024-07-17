package ContestQuestions.Leucine;


public class GR extends Dog{
    public void makeNoise(){
        super.makeNoise();;
        System.out.println("GR");
    }
     public static void main(String[] args) {
        Dog obj = new GR();
        obj.makeNoise();
     }    
}
