public class SumDigits {
    //function definition
    public static int sumOfDigits(int num){
        if(num == 0){
            return 0;
        }
        else{
            return (num%10) + sumOfDigits(num/10);
        }
    } 
    
    
    
    
    //Driver code
    public static void main(String[] args) {
        int num = 123456;
        int result = sumOfDigits(num);
        System.out.println("The sum of digits is: " +result);
    }
    
}
