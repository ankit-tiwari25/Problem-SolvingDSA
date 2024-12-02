package Patterns;

public class HollowRhombus {
    public static void main(String[] args) {
        
        int n = 15;
        
        for(int i = 0; i <= n/2; i++){
            //print space
            int sp1 = n/2;
            for(int j = sp1 - i; j > 0; j--){
                System.out.print("_");
            }
            sp1--;
            System.out.print("*");
            int sp2 = 2* ( i - 1) + 1;
            for(int j = 0; j <sp2; j++){
                System.out.print("_");
            }
            if(i != 0){
                System.out.print("*");
            }
            
            System.out.println();
        }

        for(int i = 0; i < n/2; i++){
            //print space
            int sp1 = i + 1;
            for(int j = 0; j < sp1; j++){
                System.out.print("_");
            }
            sp1++;
            System.out.print("*");
            int sp2 = (n/2) -  2* ( i);
            for(int j = 0; j <sp2; j++){
                System.out.print("_");
            }
            if(i != (n/2)-1){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }

    

}
