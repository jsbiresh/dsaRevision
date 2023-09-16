public class BinarySearch {

    // Using Iterative Binary Search
    private static int binarySearch(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        int mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    // Using Recursive Binary Search
    private static int binarySearchRec(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        return helper(array, target, start, end);
    }

    // Using Recursive Binary Search
    private static int helper(int[] array, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (array[mid] == target) {
            return mid;
        } else if (array[mid] < target) {
            return helper(array, target, start + 1, end);
        } else {
            return helper(array, target, start, end - 1);
        }
    }

    public static void main(String[] args) {
        // int[] sortedArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        // int[] sortedArray = { 1, 2, 3, 4, 5 };
        int[] sortedArray = { 1, 2, 2, 2, 3, 3, 4, 4, 4, 5 };
        // int[] sortedArray = { 1, 2, 3, 4, 5 };

        int target = 5;
        // int index = binarySearch(sortedArray, target);
        int index = binarySearchRec(sortedArray, target);

        // *********************************
        if (index != -1) {
            System.out.println("Found at Index: " + index);
        } else {
            System.out.println(index + ", Target Not Found.");
        }
        // *********************************
    }
}
