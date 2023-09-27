public class BinarySearch {
    
    public static int binarySearch(int arr[], int low, int high, int x){
        int result = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]==x){
                return mid;
            }
            else if(arr[mid]<x){
                //traverse the right side of an array
                //recursive calls
                return binarySearch(arr, mid+1, high, x);
            }
            else{
                //traverse the left side of an array
                //recursive calls
                return binarySearch(arr, low, mid-1, x);
            }
        }
        return result;
    }
    
    
    //Driver Code
    public static void main(String[] args) {
        int arr[] = {2,4,6, 10, 12 ,13, 15,20, 22, 24, 25};
        int low = 0;
        int high = arr.length-1;
        int x = 22;

        //function call
        int result = binarySearch(arr, low, high, x);
        System.out.println("The searched element is at index: " +result);
    }
    
}
