package interview_prepare;
    

public class SumofDigits {
    public static void main(String[] args) {
        int num = 123453;
        int sum = 0;
        
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        
        System.out.println("Sum of digits: " + sum);
    }
}
