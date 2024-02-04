package dsaRevision.Arrays;


// Problem: Find Peak Element

// A peak element in an array is an element which is greater than or equal to its neighbors. For an input array that may have multiple peaks, find the index of any peak element.
// Input: [1, 3, 20, 4, 1, 0]
// Output: Index 2 (peak element is 20)


public class PeakElement {
    public static int findPeakElement(int[] nums) {
        int left = 0, right = nums.length - 1;
    
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
    
        return left;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 3, 20, 4, 1, 0};
        int ans = findPeakElement(arr);
        System.out.println(ans);
    }
    
}