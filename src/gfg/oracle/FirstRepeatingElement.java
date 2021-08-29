package gfg.oracle;

import java.util.HashSet;

public class FirstRepeatingElement {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3};
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        int min = Integer.MIN_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            if (set.contains(arr[i])) {
                min = i;
            } else {
                set.add(arr[i]);
            }
        }
        System.out.println(min == Integer.MIN_VALUE ? -1 : min + 1);
    }
}
