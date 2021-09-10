package gfg.amazon;

import java.util.Arrays;

public class TripletsAddTo0 {
    public static void main(String[] args) {
        int[] arr = {-1, 2, 3, 1};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            int j = i + 1;
            int k = arr.length - 1;
            while (j < k) {
                int s = arr[i] + arr[j] + arr[k];
                if (s == 0) {
                    System.out.print(true);
                    return;
                } else if (s < 0)
                    j++;
                else
                    k--;
            }
        }
        System.out.print(false);
    }
}
