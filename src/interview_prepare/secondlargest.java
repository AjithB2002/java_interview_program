package interview_prepare;

public class secondlargest {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1}; // Step 1: Initialize the array with some values
        int firstLargest, secondLargest; // Step 2: Declare variables to hold the largest and second largest values

        // Step 3: Initialize firstLargest and secondLargest with the first two elements
        if (arr[0] > arr[1]) {
            firstLargest = arr[0]; // If the first element is larger, set it as firstLargest
            secondLargest = arr[1]; // Set the second element as secondLargest
        } else {
            firstLargest = arr[1]; // Otherwise, set the second element as firstLargest
            secondLargest = arr[0]; // Set the first element as secondLargest
        }

        // Step 4: Iterate through the rest of the array starting from the third element
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > firstLargest) { // If the current element is larger than firstLargest
                secondLargest = firstLargest; // Update secondLargest to be the old firstLargest
                firstLargest = arr[i]; // Update firstLargest to be the current element
            } else if (arr[i] > secondLargest && arr[i] != firstLargest) {
                // If the current element is between firstLargest and secondLargest, update secondLargest
                secondLargest = arr[i];
            }
        }

        // Step 5: Print the second largest element
        System.out.println("Second largest element: " + secondLargest);
    }
}
