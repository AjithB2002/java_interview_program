package leaning_in_youtube;
import java.util.Scanner;

public class example {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the no");
        // int n = sc.nextInt();
        int n=5;
        outer:
        for (int i = 1; i <= n; i++) {
            inner:
            for (int j = 1; j <= n; j++) {
                  if (i==2 && j==2 || i==4 && j==2) {
                   break;
                }
                else if(i==3 && j==4){
                        break;
                }
                System.out.print("* ");
              
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}
