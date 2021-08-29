package pepCoding;

public class Sort0And1 {
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1};
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            if (arr[start] == 1) {
                int temp = arr[start];
                arr[end] = arr[start];
                arr[start] = temp;
                end--;
            } else
                start++;
        }

        for (int ele : arr)
            System.out.print(ele + " ");
    }
}
