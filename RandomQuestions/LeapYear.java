package RandomQuestions;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2004; 

        if(year % 4 == 0){
            if(year % 100 == 0){
                // posibility hai leap year ki..
                 // ye number hai (100, 200, 300, 1700, 1800, 2100, 2200,1200, 1600, 2000, )
                // (1700, 1600, 2000)
                if(year % 400 == 0){
                    // 1600, 2000, 2400..
                    System.out.println("leap year hai");
                }else{
                     // ye number hai (100, 200, 300, 1700, 1800, 2100, 2200)
                     System.out.println("Not a leap year");
                }
              
               
            }else{
              // pakka leap year hai..
            //   4 se divide ho rhe hai.. or 100 se nahi ho rhe hai.
            // matlab last k digit ye sare hai.. (4,8,12,16,20,24,28,32,36,40)
                System.out.println("Leap year hai..");

            }
            
         }else{
          // Not a leap year..
          System.out.println("Not a leap year");
         }

      
    }
    
}
