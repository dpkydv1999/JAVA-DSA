//Time complexity: O(n)
//Space Complexity: O(1)

import java.util.*;

class LinearSearch{
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
        
        //Implementation of Linear Search
        int idx = -1;
        for(int i=0; i<n; i++){
            if(arr[i]==x){
                idx = i;
                break;
            }
        }

        if(idx==-1){
            System.out.println("Searched elements not found in an array");
        }
        else{
            System.out.println("Searched element is found at location:" +idx);
        }


    }

}