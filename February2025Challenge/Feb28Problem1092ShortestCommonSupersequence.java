import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Feb28Problem1092ShortestCommonSupersequence {
     public String shortestCommonSupersequence(String str1, String str2) {
         String res = "";
        try{
            Callable<String> task = () -> generateLCS(str1, str2);
            FutureTask<String> future = new FutureTask<>(task);
            new Thread(future).start();
            res = future.get();
        }
        catch(Exception e){

        }
        return res;
    }
}
