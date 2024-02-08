package dsaRevision.Arrays;

// Question:
// Given an array of integers, write a program to find the sum of all positive numbers in the array.

public class SumofPositiveNumbers {
    public static void main(String[] args) {
        int[] numbers = {-5, 3, -8, 7, -2, 10, 4};

        int sumOfPositives = calculateSumOfPositives(numbers);

        System.out.println("The sum of positive numbers in the array is: " + sumOfPositives);
    }

    private static int calculateSumOfPositives(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        int sum = 0;

        for (int num : arr) {
            if (num > 0) {
                sum += num; // Add positive numbers to the sum
            }
        }

        return sum;
    }
}
