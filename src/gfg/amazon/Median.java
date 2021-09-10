package gfg.amazon;

import java.util.Arrays;

public class Median {
    public static void main(String[] args) {
        int arr[] = {100, 78, 89, 91, 67};
        Arrays.sort(arr);
        int size = arr.length;
        int ans;
        if (size % 2 == 0) {
            int mid = size / 2;
            ans = (arr[mid] + arr[mid -1]) / 2;
        } else
            ans = arr[size / 2];
        System.out.println(ans);
    }
}
