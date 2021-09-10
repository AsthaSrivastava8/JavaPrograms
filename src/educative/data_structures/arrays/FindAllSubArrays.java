package educative.data_structures.arrays;

import java.util.ArrayList;
import java.util.List;

public class FindAllSubArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            for (int k = i; k < size; k++) {
                List<Integer> list = new ArrayList<>();
                for (int j = i; j <= k; j++)
                    list.add(arr[j]);
                System.out.println(list);
            }
        }

    }
}
