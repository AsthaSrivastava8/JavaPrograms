package pepCoding;

public class PairClosestTo0 {
    public static void main(String[] args) {
        int[] arr = {1, 60, -10, 70, -80, 85};

        // sort according to absolute value
        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i - 1]) > Math.abs(arr[i])) {
                int temp = arr[i - 1];
                arr[i] = arr[i];
                arr[i] = temp;
            }
        }

        int min = Integer.MAX_VALUE;
        int x = 0, y = 0;
        for (int i = 1; i < arr.length; i++) {
            int abs = Math.abs(arr[i] + arr[i - 1]);
            if (abs <= min) {
                min = abs;
                x = i - 1;
                y = i;
            }
        }
        System.out.println(arr[x] + " " + arr[y]);

    }
}
