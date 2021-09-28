package gfg.oracle;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class MaxDistinctElements {
    public static void main(String[] args) {
        int[] arr = {7, 3, 5, 8, 5, 3, 3};
        int k = 2;
        int distinctElementCount = 0;
        HashMap<Integer, Integer> frequency = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (frequency.get(arr[i]) == null)
                frequency.put(arr[i], 1);
            else {
                int count = frequency.get(arr[i]);
                frequency.put(arr[i], count + 1);
            }
        }

        PriorityQueue<Map.Entry<Integer, Integer>> minHeap =
                new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));
        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() == 1)
                distinctElementCount++;
            else
                minHeap.add(entry);
        }

        while (k > 0 && !minHeap.isEmpty()) {
            Map.Entry<Integer, Integer> entry = minHeap.poll();
            k -= entry.getValue() - 1;
            if (k >= 0)
                distinctElementCount++;
        }

        if (k > 0)
            distinctElementCount -= k;
        System.out.print(distinctElementCount);

    }
}
