package InterviewPrep.JavaQuestions.Java8Features.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StartsWith {
    public static void main(String[] args) {
        //Name starts with 'a' or "A"
        List<String> list = Arrays.asList("apple", "banana", "adfa", "cvx", "Aas");
        long count = list.stream().filter(x-> x.startsWith("a") || x.startsWith("A")).count();
        System.out.println(count);

        

    }
}
