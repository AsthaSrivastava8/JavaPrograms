package gfg.oracle;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, -2, 5};
        int maxSum = a[0];
        int localSum = a[0];
        for (int i = 1; i < a.length; i++) {
            if (0 > localSum)
                localSum = a[i];
            else
                localSum += a[i];
            if (localSum > maxSum)
                maxSum = localSum;
        }
        System.out.println(maxSum);
    }
}
