package interview_prepare;

import java.util.Scanner;

public class arnstrong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 3 digit");
        int n = sc.nextInt();

        int temp1 = n%10;
        n=n/10;
        int temp2 = n%10;
        n=n/10;
        int temp3 = n%10;

       int arm = temp1*temp1*temp1 + temp2*temp2*temp2 + temp3*temp3*temp3;

       if (arm == n) {
        
        System.out.println("The number is an Armstrong number.");
    } else {
        System.out.println("The number is not an Armstrong number.");
    }
         
    }
}
