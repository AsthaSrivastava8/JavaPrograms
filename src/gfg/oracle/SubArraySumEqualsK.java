package gfg.oracle;

import java.util.HashSet;

public class SubArraySumEqualsK {
    public static void main(String[] args) {
        int[] arr = {3, 34, 4, 12, 5, 2};
        int k = 9;
        find3Numbers(arr, arr.length, k);
    }

    static boolean find3Numbers(int A[], int arr_size, int sum) {

        for (int i = 0; i < arr_size - 2; i++) {
            HashSet<Integer> s = new HashSet<>();
            int curr_sum = sum - A[i];
            for (int j = i + 1; j < arr_size; j++) {
                if (s.contains(curr_sum - A[j])) {
                    System.out.printf("Triplet is %d, %d, % d ", A[i],
                            A[j], curr_sum - A[j]);
                    return true;
                }
                s.add(A[j]);
            }
        }
        return false;
    }
}

