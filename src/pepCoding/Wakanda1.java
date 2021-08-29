package pepCoding;

public class Wakanda1 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < 3; i++) {
            if (i % 2 == 0)
                for (int j = 0; j < 3; j++) {
                    System.out.print(arr[j][i] + " -> ");
                }
            else {
                for (int j = 3 - 1; j >= 0; j--)
                    System.out.print(arr[j][i] + " -> ");

            }
        }

    }
}
