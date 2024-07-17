package ContestQuestions.Leucine;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Solution8 {
    String name;
    int age;
    
    public Solution8(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + age;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Solution8 other = (Solution8) obj;
        
        return other.age == this.age && other.name.equals(this.name);
    }
    public static void main(String[] args) {
        Solution8 u1 = new Solution8("Martin", 27);
        // Solution8 u2 = new Solution8("John", 20);

        // HashSet<Solution8> set = new HashSet<>();
        Map<Solution8, String> map = new HashMap<>();

        map.put(u1, "Verified");
        u1.setName("John");

        System.out.println(map.get(u1));
    }
    
}
