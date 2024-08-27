package Patterns;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++ ){
            //space
            for(int j = 1; j <= (n-i); j++){
                System.out.print(" ");
            }

            //star
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();


        }
    }
}

/*
n = 5

____*   row(i) = 1 : space  = 4   n-1  star = 1 == i 
___**   row(i) = 2 : space  = 3   n-2  star = 2
__***   row(i) = 3 : space  = 2   n-3  star = 3
_****   row(i) = 4 : space  = 1   n-4  star = 4
*****   row(i) = 5 : space  = 0   n-5  star = 5
            i              (n-i)       star = i
 




 */