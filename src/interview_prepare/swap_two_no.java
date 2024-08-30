package interview_prepare;

public class swap_two_no {
    public static void main(String[] args) {
        int a = 5, b = 10;
        System.out.println("Before swap: a = " + a + ", b = " + b);
        
        // Swap logic
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println(a +"and"+b);
    }
}
