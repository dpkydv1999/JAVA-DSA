//Time Complexity: O(k)
//Space Complexity: O(k)

public class PrintMultiples {

    public static void printMult(int n, int k){
        //1. base condition
        if(k==1){
            System.out.println(n);
            return;
        }
            printMult(n, k-1);
            System.out.println(n*k);        
    }

    //Driver code
    public static void main(String[] args) {
        int n = 24;
        int k = 5;

        printMult(n,k);
        System.out.println();
    }
    
}
