package gfg.oracle;

public class Knapsack_01 {
    public static void main(String[] args) {
        int[] profits = {24, 25, 15};
        int[] weights = {15, 18, 10};
        int capacity = 20;
        int size = 3;
        int[] matrix[] = new int[size + 1][capacity + 1];

        for (int i = 0; i < size + 1; i++)
            for (int j = 0; j < capacity + 1; j++) {
                if (i == 0 || j == 0) // since weight allowed in knapsack =0; profit = 0
                    matrix[i][j] = 0;

                else if (j - weights[i-1] > 0) {
                    int a = matrix[i - 1][j - weights[i-1]] + profits[i-1];
                    int b = matrix[i - 1][j];
                    matrix[i][j] = Math.max(a, b);

                } else
                    matrix[i][j] = matrix[i-1][j];
            }
        System.out.println(matrix[size][capacity]);
    }
}
