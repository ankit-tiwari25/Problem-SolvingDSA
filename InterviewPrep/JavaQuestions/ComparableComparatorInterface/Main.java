package InterviewPrep.JavaQuestions.ComparableComparatorInterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "Ankit", "Tiwari"));
        list.add( new Student(2, "Aman", "ABC"));
        list.add( new Student(3, "B", "ABC"));
        list.add(  new Student(4, "C", "ABC"));
        list.add(  new Student(5, "D", "ABC"));

        NameComparator nc = new NameComparator();
        IdComparator ic = new IdComparator();

        Collections.sort(list, ic);

        System.out.println(list);


    }
}
