package leaning_in_youtube;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int[] a= new int[6];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array element");
        for(int i=0;i<a.length;i++){
          a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
          System.out.println(a[i]);
        }

    }
    
}
