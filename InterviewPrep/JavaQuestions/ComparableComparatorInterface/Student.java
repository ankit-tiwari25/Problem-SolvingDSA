package InterviewPrep.JavaQuestions.ComparableComparatorInterface;

public class Student implements Comparable<Student>{
    private int id;
    private String firstName;
    private String lastName;
    
    
    public Student() {
    }
    public Student(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    //According to first name in descending order
    /*
     *  @Override
    public int compareTo(Student o) {
        // TODO Auto-generated method stub
       return o.getFirstName().compareTo(this.getFirstName());
    }
     */
    
   
    @Override
    public String toString() {
        return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]\n";
    }

    // According to id in ascending order
    @Override
    public int compareTo(Student o) {
        // TODO Auto-generated method stub
        return this.getId() - o.getId();
    }

    
    
}
