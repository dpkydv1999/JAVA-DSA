//Time Complexity: O(logN)
//Space Complexity: O(1)

import java.util.Scanner;


public class BinarySearch {

    public static int binarySearch(int arr[], int target){
        int low = 0, high = arr.length-1;
        while(low<=high){
            int mid = low +(high-low)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid]<target){
                low= low+1;
            }
            else{
                high = mid - 1;

            }
        }
        return 0;


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
        int x = sc.nextInt();
        
        //function calling of binarySearch
        int result = binarySearch(arr, x);
        

        if(result==0){
            System.out.println("Searched elements not found in an array");
        }
        else{
            System.out.println("Searched element is found at location:" +result);
        }


    }
    
}
