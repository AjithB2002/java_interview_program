package leaning_in_youtube;
import java.util.Scanner;

public class swichcase {

    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    // System.out.println("enter the Number in 1 to 7");
    // int n = sc.nextInt();
    // switch (n) {
    //     case 1:
    //         System.out.println("Sunday");
    //         break;
    //     case 2:
    //         System.out.println("Monday");
    //         break;
    //     case 3:
    //         System.out.println("Tuesday");
    //         break;
    //     case 4:
    //         System.out.println("wednesday");
    //         break;
    //     case 5:
    //         System.out.println("Thursday");
    //         break;
    //     case 6:
    //         System.out.println("Friday");
    //         break;
    //     case 7:
    //         System.out.println("Saturday");
    //         break;
    
    //     default:
    //         System.out.println("undafined value");
    //         break;
    // }
    System.out.println("Enter the Alphabets letter eg: a,b,c,d,e,f,..");
    char n = sc.next().charAt(0);
    switch (n) {
        case 'a':
            System.out.println("Vowels");
            break;
        case 'e':
            System.out.println("VVowels");
            break;
        case 'i':
            System.out.println("Vowels");
            break;
        case 'o':
            System.out.println("Vowels");
            break;
        case 'u':
            System.out.println("Vowels");
            break;
        default:
            System.out.println("Consonant");
            break;
    }

    }
}