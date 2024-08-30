package interview_prepare;

public class fourthlargest {
    public static void main(String[] args) {
        int[] array = {15, 22, 9, 31, 18, 4, 11};

        if (array.length < 4) {
            System.out.println("Array must have at least 4 elements.");
        } else {
            int first = Integer.MIN_VALUE;
            int second = Integer.MIN_VALUE;
            int third = Integer.MIN_VALUE;
            int fourth = Integer.MIN_VALUE;

            // Find the first, second, third, and fourth largest elements
            for (int num : array) {
                if (num > first) {
                    fourth = third;
                    third = second;
                    second = first;
                    first = num;
                } else if (num > second) {
                    fourth = third;
                    third = second;
                    second = num;
                } else if (num > third) {
                    fourth = third;
                    third = num;
                } else if (num > fourth) {
                    fourth = num;
                }
            }

            System.out.println("The fourth largest element is: " + fourth);
        }
    }
}
