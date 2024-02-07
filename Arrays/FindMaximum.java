package dsaRevision.Arrays;

public class FindMaximum {

        public static int findMaxElement(int[] arr) {
            if (arr.length == 0) {
                // Handle the case when the array is empty
                throw new IllegalArgumentException("Array is empty");
            }
    
            int maxElement = arr[0]; // Assume the first element is the maximum
    
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > maxElement) {
                    // If the current element is greater than the assumed maximum, update maxElement
                    maxElement = arr[i];
                }
            }
    
            return maxElement;
        }
    
        public static void main(String[] args) {
            // Example usage:
            int[] numbers = {5, 8, 2, 10, 3};
            int maxNumber = findMaxElement(numbers);
            System.out.println("The maximum element is: " + maxNumber); // Output: 10
        }
}

