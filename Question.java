import java.util.ArrayList;
import java.util.List;
// AnkitTiwari
//  0 1 2 3 4
//A   t   a
//n i T w r
//k   i   i
// AnkitTiwari
//  0 1 2
//0 A n k
//1   i 
//2 t T i
//3   w 
//4 a r i
public class Question {
    public static void main(String[] args) {
        List<List<Character>> result = new ArrayList<>();
        String str = "AnkitTiwariHit";
        int idx = 0;
        for(int i = 0; i <str.length(); i++){
            List<Character> row = new ArrayList<>();

            if(i % 2 == 0  ){
                // 3 characters
                for(int j = 0; j < 3; j++){
                    if(idx < str.length()){
                        row.add(str.charAt(idx) );
                        idx++;
                    }
                    
                }
            }
            // System.out.println(row);
            else{
                // row odd
                // space char space
                for(int j = 0; j < 3; j++){
                  if(j % 2 == 0){
                    row.add(' ');
                  }else{
                      
                      if( idx < str.length()){
                        row.add(str.charAt(idx));
                      idx++;
                    }
                  }
                }
            }
            result.add(row);
        }
        display(result);
        // System.out.println("After Transpose");
        // List<List<Character>> transpose = tansposeList(result);
        // System.out.println(transpose);
    }
  public static  List<List<Character>> tansposeList(List<List<Character>> list){

    System.out.println("Within Transpose");
    display(list);

    // transpose mat[i][i] = arr[j][i]
        List<List<Character>> ans = new ArrayList<>();
       for(int i = 0; i < list.size(); i++){
           
           List<Character> ansRow = new ArrayList<>(); // A 
           for(int j = 0; j < list.get(i).size(); j++){
            List<Character> row = list.get(i); // A n k
               ansRow.add(row.get(j));
           }
       }

       // 0 0, 1 0, 2 0 
       return ans;
   }
   public static void display(List<List<Character>> list){
    for(int i = 0; i < list.size(); i++){
        List<Character> row = list.get(i);
        for(char x : row){
            System.out.print( x + " ");
        }
        System.out.println();
    }
   }
}
