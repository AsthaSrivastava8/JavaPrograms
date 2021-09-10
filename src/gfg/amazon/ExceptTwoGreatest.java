package gfg.amazon;

public class ExceptTwoGreatest {
    public static void main(String[] args) {
        int[] a = {7, -2, 3, 4, 9, -1};
        mergeSort(a, 0, 5);
        for (int val : a)
            System.out.print(val + " ");
        System.out.println();
        for (int i = 0; i < a.length - 2; i++) {
            System.out.print(a[i] + " ");
        }
    }

    private static void mergeSort(int[] a, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(a, start, mid);
            mergeSort(a, mid + 1, end);
            merge(a, start, mid, end);
        }
    }

    private static void merge(int[] a, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= end) {
            if (a[i] < a[j])
                temp[k++] = a[i++];
            else
                temp[k++] = a[j++];
        }
        while (i <= mid)
            temp[k++] = a[i++];
        while (j <= end)
            temp[k++] = a[j++];

        for (i = start; i <= end; i++)
            a[i] = temp[i - start];
    }
}
