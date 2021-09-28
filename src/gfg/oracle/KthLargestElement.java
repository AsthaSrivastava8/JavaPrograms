package gfg.oracle;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargestElement {
    public static void main(String[] args) {
        int[] nums = {3, 1, 5, 12, 2, 11};
        int k = 0; // 0-index
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Comparator.comparing(Integer::intValue));
        for (int i = 0; i < nums.length; i++)
            minHeap.add(nums[i]);

        for (int i = 0; i < k; i++)
            minHeap.poll();

        System.out.print(minHeap.peek());
    }
}
