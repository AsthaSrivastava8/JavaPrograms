package gfg.oracle;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};

        int n = 44;
        System.out.println(myBinarySearch(arr, 0, arr.length - 1, n));
    }

    private static int myBinarySearch(int arr[], int start, int end, int n) {
        if (start > end)
            return -1;
        int mid = start + (end - start) / 2;
        if (arr[mid] == n)
            return mid;

        if (arr[mid] > n)
            return myBinarySearch(arr, start, mid - 1, n);

        return myBinarySearch(arr, mid + 1, end, n);
    }
}
