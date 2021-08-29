package pepCoding;

public class SearchInSorted2DArray {
    public static void main(String[] args) {
        int[][] a = {
                {11, 12, 13, 14},
                {21, 22, 23, 24},
                {31, 32, 33, 34},
                {41, 42, 43, 44}
        };

        int x = 43;

        int i = 0, j = 3;
        boolean isFound = false;
        while (i < 4 && j >= 0) {

            if (a[i][j] == x) {
                System.out.println(i);
                System.out.println(j);
                isFound = true;
                break;
            } else if (a[i][j] > x) {
                j = j - 1;
            } else {
                i = i + 1;
            }
        }
        if (!isFound)
            System.out.println(-1);
    }
}
