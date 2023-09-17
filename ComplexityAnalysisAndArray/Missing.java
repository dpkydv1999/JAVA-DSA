// Time complexity : O(n)
// Space Complexity : O(1)

public class Missing {

   public static void main(String[] args) {
    int[] arr = {1,2,3,5,6,7};
    int n= arr.length;

    //sum of natural numbers in an array - O(1)
    int sum_natural_num = ((n+1)*(n+2))/2;
    int sum = 0;

    //sum of current elements present in an array - O(n)
    for(int i=0; i<n; i++){
        sum += arr[i];

    }
    int missing_elem = 0;
    missing_elem = sum_natural_num - sum;
    System.out.println("Missing number is:" +missing_elem);
   } 
}
