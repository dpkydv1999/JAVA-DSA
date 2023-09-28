import java.util.Scanner;

public class PowerOfElement {
    public static long powerFind(int a, int b){
        long result = 0, finalResult = 0;
        int mid = 0;
        //1. base condition
        if(b==1){
            return a;
        }
        //2. recursive function calls
        else{
            mid = b/2;
            result = powerFind(a, mid);
            finalResult = result *result;
            if(b%2==0){
                return finalResult;
            }
            else{
                return a*finalResult;
            }
        }

    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a and b: ");

        int a = sc.nextInt();
        int b = sc.nextInt();

        //function calling
        long result = powerFind(a,b);
        System.out.println("Power of a^b is: " +result);
    }  
}
