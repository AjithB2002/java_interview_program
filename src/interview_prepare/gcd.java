package interview_prepare;

// public class gcd {
//     public static void main(String[] args) {
//         int num1 = 12, num2 = 18;
//         int gcd = 1;
        
//         for (int i = 1; i <= num1 && i <= num2; ++i) {
//             if (num1 % i == 0 && num2 % i == 0) {
//                 gcd = i;
//             }
//         }
        
//         System.out.println("GCD of " + num1 + " and " + num2 + " is " + gcd);
//     }
// }
public class gcd {
    public static void main(String[] args) {
        int num1 = 12, num2 = 18;
        while (num1 != num2) {
            if (num1 > num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
        }
        System.out.println("GCD: " + num1);
    }
}