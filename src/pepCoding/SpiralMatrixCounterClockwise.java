package pepCoding;

public class SpiralMatrixCounterClockwise {
    public static void main(String[] args) {
        int re, ce, rs = 0, cs = 0;
        re = 3;
        ce = 5;

        int[][] matrix = {
                {11, 12, 13, 14, 15},
                {21, 22, 23, 24, 25},
                {31, 32, 33, 34, 35}

        };

        int tne = re * ce;
        int pne = 0;
        for (int i = 0; i < re; i++) {
            for (int j = 0; j < ce; j++)
                System.out.printf("%" + 4 + "d", matrix[i][j]);
            System.out.println();
        }

        System.out.println("---------");

        while (pne < tne) {

            // start with min row, min col
            for (int i = rs; i < re && pne < tne; i++) {
                System.out.printf("%" + 4 + "d", matrix[i][cs]);
                pne++;
            }
            cs++;

            // start with max row, min col
            for (int i = cs; i < ce && pne < tne; i++) {
                System.out.printf("%" + 4 + "d", matrix[re - 1][i]);
                pne++;
            }
            re--;

            //start with max row, max col
            for (int i = re - 1; i >= rs && pne < tne; i--) {
                System.out.printf("%" + 4 + "d", matrix[i][ce - 1]);
                pne++;
            }
            ce--;

            //start with min row, max col
            for (int i = ce - 1; i >= cs && pne < tne; i--) {
                System.out.printf("%" + 4 + "d", matrix[rs][i]);
                pne++;
            }
            rs++;
        }
    }
}
