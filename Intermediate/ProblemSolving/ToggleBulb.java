package ProblemSolving;
/*Question : A faulty wire connects N light bulbs. Given an initial state of all the bulbs find 
the no of times switches has to be altered to turn on every bulb when you toggle the
state every bulb on right flips its state.
Eg : [1 0 1 0]
ans = 3 */
public class ToggleBulb {
    public static void main(String[] args) {
        int[] bulbs = {1,0,1,0};
        System.out.println(toggleBulb(bulbs));

    }
    
    public static int toggleBulb(int[] bulbs){
        int i = 0;
        int n = bulbs.length;

        int count = 0;

        while(i < n){
            int initial_state = bulbs[i];

            if(initial_state == 0){
                if((count == 0) || (count % 2 == 0)){
                    count++;
                }
            }

            if(initial_state == 1){
                if(count % 2 != 0){
                    count++;
                }
            }
            i++;
        }
        return count;
    }
}
