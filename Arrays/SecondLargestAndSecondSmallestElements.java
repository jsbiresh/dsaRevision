import java.util.Arrays;
import java.util.PriorityQueue;

public class SecondLargestAndSecondSmallestElements {

    private static int[] findSecondSmallestAndSecondLargest(int[] array) {

        if (array.length < 2) {
            return new int[] { -1, -1 };
        }

        Arrays.sort(array);
        //
        System.out.println(Arrays.toString(array));

        int index = 0;
        int start = array[index];
        int[] result = new int[2];

        while (array[index] == start) {
            index++;
        }
        result[0] = array[index];

        index = array.length - 1;
        int end = array[index];
        // System.out.println(index);

        while (array[index] == end) {
            index--;
        }
        result[1] = array[index];
        return result;
    }

    private static int[] findSecondSmallestAndSecondLargestSimpleLinearSearch(int[] arr) {

        int n = arr.length;
        if (n < 2) {
            return new int[] { -1, -1 };
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }

            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        return new int[] { secondSmallest, secondLargest };
    }

    private static int[] findSecondSmallestAndSecondLargestPriorityQueue(int[] arr) {

        // Step 1: Check for edge case with fewer than 2 elements
        if (arr.length < 2) {
            System.out.println("Array is too small.");
            return new int[] { -1, -1 };
        }

        // Step 2: Create two priority queues - one for smallest elements and one for
        // largest elements
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(java.util.Collections.reverseOrder());

        // Step 3: Add elements to the heaps
        for (int num : arr) {
            minHeap.offer(num);
            maxHeap.offer(num);
        }

        // Step 4: Remove the smallest element from minHeap to get the second smallest
        minHeap.poll();
        int secondSmallest = minHeap.poll();

        // Step 5: Remove the largest element from maxHeap to get the second largest
        maxHeap.poll();
        int secondLargest = maxHeap.poll();

        System.out.println("Second Smallest: " + secondSmallest);
        System.out.println("Second Largest: " + secondLargest);

        return new int[] { secondSmallest, secondLargest };

    }

    public static void main(String[] args) {

        int[] arr = { 5, 2, 9, 3, 6, 9, 9, 1, 7, 8, 4, 1, 1 };
        // 2, 8

        // int[] arr = { 5, 2, 9, 3, 6, 1, 7, 8, 4 };
        // Second Smallest: 2
        // Second Largest: 8

        // int[] arr = { 5, 2, 9, 3, 6, 9, 9, 1, 7, 8, 4, 1, 1 };
        // // Second Smallest: 2
        // // Second Largest: 8

        // int[] arr = { -5, -2, -9, -3, -6, -1, -7, -8, -4 };
        // // Second Smallest: -8
        // // Second Largest: -2

        // int[] arr = { 5, 2, 9, 3, 6, 1, 7, 8, 2, 4, 8 };
        // // Second Smallest: 2
        // // Second Largest: 8

        // int[] arr = { 42 };
        // There is no second smallest or second largest.

        System.out.println(Arrays.toString(arr));
        // System.out.println(Arrays.toString(findSecondSmallestAndSecondLargest(arr)));
        // System.out.println(Arrays.toString(findSecondSmallestAndSecondLargestSimpleLinearSearch(arr)));
        System.out.println(Arrays.toString(findSecondSmallestAndSecondLargestPriorityQueue(arr)));
    }
}
