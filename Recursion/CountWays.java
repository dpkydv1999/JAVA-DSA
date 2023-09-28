import java.util.Scanner;

public class CountWays {
    public static int countNum(int n){
        int result =0;
        //1. base condition
        if(n<=1){
            return n;
        }
        else{
            result = countNum(n-1) + countNum(n-2); 
        }
        return result;
    } 
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of stairs: ");
        int n = sc.nextInt();

        //function calling
        int result = countNum(n+1);
        System.out.println("Number of ways is: " +result);
    }
    
}
