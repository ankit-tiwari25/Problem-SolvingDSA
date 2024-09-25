package Demo;

public class UpperHalfButterflyPattern {
    public static void main(String[] args) {
        
        int n = 5;
        int total = n * 2;

        for(int i = 1; i<= n; i++){ // rows
            //star  space  star
            //star  (star == i)
            for(int j = i; j > 0; j--){
                System.out.print("*");
            }

            //Space sp = n - 2 *(i)      
            for(int j =total- (2 * i); j >0; j--){
                System.out.print(" ");
            }
            //star  (star == i)
            for(int j = i; j > 0; j--){
                System.out.print("*");
            }

            System.out.println();
            
        }

    }
}
