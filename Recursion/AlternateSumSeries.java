//Time Complexity: O(n)
//Space Complexity: O(n)

import java.util.Scanner;

public class AlternateSumSeries {
    
    //function definition
    public static int alternateSumFind(int num){
        //1. Base case condition
        if(num == 0){
            return 0;
        }
        //Recursive calls
        //Even number
        if(num%2==0){
            return alternateSumFind(num-1) - num;
        }
        //odd number
        else{
            return alternateSumFind(num-1) + num;
        }
    }   
    
    
    //Driver Code
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       
       int result = alternateSumFind(num);
       System.out.println("The alternation sum series of the number is:" +result);

    }
    
}
