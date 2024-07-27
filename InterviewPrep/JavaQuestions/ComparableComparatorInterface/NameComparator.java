package InterviewPrep.JavaQuestions.ComparableComparatorInterface;

import java.util.Comparator;

public class NameComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        // TODO Auto-generated method stub
        System.out.println("Inside name comparator");
        return o1.getFirstName().compareTo(o2.getFirstName());
    }
    
}
