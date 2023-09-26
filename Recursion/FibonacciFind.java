//Time Complexity: O(2^n)
//Space Complexity: O(n)

import java.util.Scanner;

public class FibonacciFind {
    public static int fibonacciFinding(int n){
        int result = 0;
        //1. base case condition
        if(n==0 || n==1){
            return n;
        }
        else{
            //2. Recursive function calling
            result = fibonacciFinding(n-1) + fibonacciFinding(n-2);
            return result;
        }

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        //function calling 
        int result = fibonacciFinding(n);
        System.out.println("The final output is: " +result);
    }
    
}
