package pepCoding;

public class Sort0s1sAnd2s {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 1, 0, 0, 1, 0, 2, 0, 1, 2, 0, 2, 1, 1, 0, 2, 1, 0, 2, 1, 0, 2,};
        int low = 0, mid = 0, high = arr.length - 1, temp;
        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = arr[high];
                    arr[high] = arr[mid];
                    arr[mid] = temp;
                    high--;
            }
        }
        for (int ele : arr)
            System.out.print(ele + " ");
    }
}
