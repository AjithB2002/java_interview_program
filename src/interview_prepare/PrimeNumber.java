package interview_prepare;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int  flag = 0;
        for (int i = 2; i < a / 2; i++) {
            if (a % i == 0) {
                System.out.println( a + "is not a prime number");
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println( a + "is a prime number");
        }
    }
}
