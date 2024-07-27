package InterviewPrep.JavaQuestions.ComparableComparatorInterface;

import java.util.Comparator;

public class IdComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        // TODO Auto-generated method stub
        return o1.getId() - o2.getId();
    }
    
}
