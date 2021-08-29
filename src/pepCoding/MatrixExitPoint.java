package pepCoding;

public class MatrixExitPoint {
    public static void main(String[] args) {
        int[][] arr = {
                {0, 0, 1, 0},
                {0, 1, 0, 1},
                {0, 0, 1, 0},
                {1, 0, 0, 1}
        };

        int r = 0, c = 0;
        boolean e = true, w = false, n = false, s = false;
        while (true) {
            if (r == 4) {
                r--;
                break;
            }
            if (c == 4) {
                c--;
                break;
            }
            if (r == -1) {
                r++;
                break;
            }
            if (c == -1) {
                c++;
                break;
            }

            if (e) {
                if (arr[r][c] != 0) {
                    r++;
                    e = false;
                    s = true;
                } else {
                    c++;
                }
                continue;
            }

            if (s) {
                if (arr[r][c] != 0) {

                    c--;
                    s = false;
                    w = true;

                } else {
                    r++;
                }
                continue;

            }

            if (w) {
                if (arr[r][c] != 0) {

                    r--;
                    w = false;
                    n = true;

                } else {
                    c--;
                }
                continue;

            }
            if (n) {
                if (arr[r][c] != 0) {

                    c++;
                    n = false;
                    e = true;

                } else {
                    r--;
                }
                continue;

            }
        }

        System.out.println((r + 1) + " " + (c + 1));

    }
}