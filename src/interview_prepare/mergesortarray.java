package interview_prepare;

public class mergesortarray {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};  // Step 1: Initialize the first sorted array
        int[] arr2 = {2, 4, 6, 8};  // Step 2: Initialize the second sorted array
        int[] mergedArray = new int[arr1.length + arr2.length];  // Step 3: Create an array to hold the merged result

        int i = 0, j = 0, k = 0;  // Step 4: Initialize pointers for arr1, arr2, and mergedArray

        // Step 5: Merge the arrays by comparing elements from arr1 and arr2
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mergedArray[k++] = arr1[i++];  // If the element in arr1 is smaller, add it to mergedArray
            } else {
                mergedArray[k++] = arr2[j++];  // If the element in arr2 is smaller or equal, add it to mergedArray
            }
        }

        // Step 6: Copy remaining elements from arr1, if any
        while (i < arr1.length) {
            mergedArray[k++] = arr1[i++];
        }

        // Step 7: Copy remaining elements from arr2, if any
        while (j < arr2.length) {
            mergedArray[k++] = arr2[j++];
        }

        // Step 8: Print the merged sorted array
        System.out.println("Merged sorted array: ");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }
}
