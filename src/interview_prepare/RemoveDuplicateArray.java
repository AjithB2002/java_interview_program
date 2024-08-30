package interview_prepare;

// public class RemoveDuplicateArray {
//     public static void main(String[] args) {
//         int[] arr = { 1, 2, 2, 3, 4, 4, 5, 5, 6 };
//         int j = 0;
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] != arr[j]) {
//                 j++;
//                 arr[j] = arr[i];
//             }
//         }
//         // Print the length of the array after removing duplicates
//         System.out.println("Length of the array after removing duplicates: " + (j + 1));
        
//         // Optionally, print the array after removing duplicates
//         System.out.print("Array after removing duplicates: ");
//         for (int i = 0; i <= j; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }


import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 4, 4, 5, 5, 6 };
        Set<Integer> set = new HashSet<>();

        // Add elements to the set
        for (int num : arr) {
            set.add(num);
        }

        // Print the length of the array after removing duplicates
        System.out.println("Length of the array after removing duplicates: " + set.size());

        // Optionally, print the array after removing duplicates
        System.out.print("Array after removing duplicates: ");
        for (Integer num : set) {
            System.out.println(num + " ");
        }
        //_____________________________
        // Print the duplicates
        System.out.print("Duplicates: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        } 
    }
}
