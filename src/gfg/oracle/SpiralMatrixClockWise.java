package gfg.oracle;

public class SpiralMatrixClockWise {
    public static void main(String[] args) {
        int matrix[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int m = 4, n = 4, l = 0, r = 0;
        while (l < m && r < n) {
            for (int i = r; i < n && l < m && r < n; i++) {
                System.out.print(matrix[l][i] + " ");
            }
            l++;

            for (int i = l; i < m && l < m && r < n; i++) {
                System.out.print(matrix[i][n - 1] + " ");
            }
            n--;

            for (int i = n - 1; i >= r && l < m && r < n; i--) {
                System.out.print(matrix[m - 1][i] + " ");
            }
            m--;

            for (int i = m - 1; i >= l && l < m && r < n; i--) {
                System.out.print(matrix[i][r] + " ");
            }
            r++;

        }
    }
}
