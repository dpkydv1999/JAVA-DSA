//Modification of Binary Search
//Time Complexity: O(log n)
//Space Complexity: O(1)

import java.util.Scanner;

public class LowerBound {
    //function definition
    public static int findFirstOccurence(int arr[], int target){
        int low=0, high=arr.length-1;
        int result = -1;

        while(low<=high){
            //to avoid overflow
            int mid = low +(high-low)/2;
            if(arr[mid]==target){
                result = mid;
                //traverse to the left side of array
                high = mid-1;
            }
            else if(arr[mid]>target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
            
        }
        return result;
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        // size of array entered by user
        System.out.println("Enter the number of elements in an array:");
        int n = sc.nextInt();

        //Array elements entered by user
        System.out.println("Enter the array elements:");
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        //Target element from the user
        System.out.println("Enter the target element:");
        int target = sc.nextInt();

        //function calling
        int result = findFirstOccurence(arr, target);

        if(result==-1){
            System.out.println("The target element is not found.");
        }
        else{
            System.out.println("The target element is found at index:" +result);
        }
    }    
}
