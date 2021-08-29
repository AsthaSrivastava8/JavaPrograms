package pepCoding;

public class SubSetOfArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        int n = arr.length;
        int limit = (int) Math.pow(2, n);
        for (int i = 0; i < limit; i++) {
            String set = "";
            int temp = i;
            for (int j = 0; j < n; j++) {
                int r = temp % 2;
                temp /= 2;
                if (r == 1)
                    set += arr[j] + " ";
            }
            System.out.println(set);
        }
    }


}
