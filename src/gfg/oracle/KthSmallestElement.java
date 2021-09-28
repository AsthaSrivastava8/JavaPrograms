package gfg.oracle;

import java.util.PriorityQueue;

public class KthSmallestElement {
    public static void main(String[] args) {
        int[] arr = {1, 5, 12, 2, 11, 5};
        int k = 0;
        if (k > arr.length || k < 1) {
            System.out.print(-1);
            return;
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((e1, e2) -> e2 - e1);
        for (int i = 0; i < k; i++)
            maxHeap.add(arr[i]);
        for (int i = k; i < arr.length; i++) {
            if (arr[i] < maxHeap.peek()) {
                maxHeap.poll();
                maxHeap.add(arr[i]);
            }
        }
        System.out.print(maxHeap.peek());
    }
}
