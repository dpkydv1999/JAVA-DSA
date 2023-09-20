//Approach: Modified Binary Search
//Time Complexity: O(log n)
//Space Complexity: O(1)

import java.util.Scanner;

public class SquareRoot {
    public static int findSquareRoot(int num){
        int low =0, high = num, result = -1;

        //modified binary search
        while(low<=high){
            int mid = low +(high-low)/2;
            long val = mid * mid;
        
            if(val==num){
                return mid;
            }
            else if(val<num){
                //store floor value, incase the number is not perfect square root, we can print the floor value 
                result = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return result;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of which you want the square root:");
        int num = sc.nextInt();

        //Function calling
        int result = findSquareRoot(num);
        System.out.println("Square root of a given number is:" +result);

    }  
}
