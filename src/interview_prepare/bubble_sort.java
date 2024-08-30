package interview_prepare;
// Bubble sort in Java

public class bubble_sort {

    public static void main(String[] args) {
        int arr[] ={10,7,9,11,5};
        int length = arr.length;
        System.out.println("unsorted array ");
        for(int i=0;i<length;i++){
        System.out.print(arr[i]  + " ");
        }
       for(int i=0;i<length;i++){
        for(int j = 1;j<length-i;j++){
             if (arr[j-1] > arr[j]) {
                int temp =arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
             }
        }
       }
    

    System.out.println("sorted array ");
    for(int i=0;i<length;i++){
    System.out.print(arr[i]  + " ");
}
}
}


// class GFG {
//     public static void main(String args[])
//     {
//         int[] arr = { 5, -2, 23, 7, 87, -42, 509 };
//         System.out.println("The original array is: ");
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//         Arrays.sort(arr);
//         System.out.println("\nThe sorted array is: ");
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//     }
// }
