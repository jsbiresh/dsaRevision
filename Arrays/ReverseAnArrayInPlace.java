import java.util.Arrays;
import java.util.Stack;

public class ReverseAnArrayInPlace {


    // Using Two Pointers
    private static int[] findReverse(int[] array) {
        int start = 0;
        int end = array.length-1;
        while (start <= end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        return array;
    }


    // Using Recursion
    private static int[] findReverseRec(int[] array, int start, int end) {

        if (start > end) {
            return array;
        }

        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;

        return findReverseRec(array, start+1, end-1);
    }


    // Using Stack
    private static int[] findReverseStack(int[] array) {
        Stack<Integer> stack = new Stack<>();
        for (int item: array) {
            stack.push(item);
        }
        int index = 0;
        while (!stack.isEmpty()) {
            array[index] = stack.pop();
            index++;
        }
        return array;
    }


    public static void main(String args[]) {

        int[] array = { 4, 11, 6, 2, 8, 9, 1 };

        System.out.println(Arrays.toString(array));
        // Two Pointers
        // System.out.println(Arrays.toString(findReverse(array)));
        // Recursion
        // System.out.println(Arrays.toString(findReverseRec(array, 0, array.length-1)));
        // Stack
        System.out.println(Arrays.toString(findReverseStack(array)));
    }
}