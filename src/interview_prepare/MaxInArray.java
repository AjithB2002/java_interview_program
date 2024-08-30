package interview_prepare;


public class MaxInArray {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 1, 9};
        int max = numbers[0];
        
        for (int i = 1; i < numbers.length; ++i) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        
        System.out.println("Maximum value in the array: " + max);
    }
}
