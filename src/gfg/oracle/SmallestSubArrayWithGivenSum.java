package gfg.oracle;

public class SmallestSubArrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 2, 3, 2};
        int sum = 7;
        int length = findMinSubArray(arr, sum);
        System.out.print(length > 0 ? length : "Not found");
    }

    private static int findMinSubArray(int[] arr, int sum) {
        int windowSum = 0, minLength = Integer.MAX_VALUE;
        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum += arr[windowEnd];
            while (windowSum >= sum) {
                minLength = Math.min(minLength, windowEnd - windowStart + 1);
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;

    }
}
