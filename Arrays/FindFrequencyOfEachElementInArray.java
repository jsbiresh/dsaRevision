import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindFrequencyOfEachElementInArray {

    // Using HashMap
    private static List<Integer> findFrequency(int[] arr) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num : arr) {
            if (hashMap.containsKey(num)) {
                hashMap.put(num, hashMap.get(num) + 1);
            } else {
                hashMap.put(num, 1);
            }
        }
        List list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            System.out.print(entry.getValue() + " ");
            list.add(entry.getValue());
        }
        System.out.println();
        return list;
    }

    private static int[] findFrequencyFrequencyArray(int[] array) {

        int maxElement = Integer.MIN_VALUE;
        for (int num : array) {
            maxElement = Math.max(maxElement, num);
        }
        int[] freqArr = new int[maxElement + 1];

        for (int num : array) {
            // freqArr[num] = freqArr[num] + 1;
            freqArr[num]++;
        }
        return freqArr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 2, 3, 3 };

        System.out.println(Arrays.toString(arr));
        // System.out.println(findFrequency(arr));
        System.out.println(Arrays.toString(findFrequencyFrequencyArray(arr)));

    }
}
