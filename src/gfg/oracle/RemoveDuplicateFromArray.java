package gfg.oracle;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 4, 4, 4, 4, 4, 7, 7, 7, 7, 9, 9, 9, 11, 11, 11};

        int size = removeDuplicates(arr, arr.length);
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static int removeDuplicates(int[] arr, int length) {
//        if (length == 0 || length == 1)
//            return length;
//
//        int j = 0;
//        for (int i = 0; i < length - 1; i++) {
//            if (arr[i] != arr[1 + i]) {
//                arr[j++] = arr[i];
//            }
//        }
//        arr[j++] = arr[length - 1];
//        return j;
//    }

        if (length == 0 || length == 1)
            return length;
        int j = 1;
        for (int i = 0; i < length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i + 1];
            }
        }
        return j;
    }
}

// both correct