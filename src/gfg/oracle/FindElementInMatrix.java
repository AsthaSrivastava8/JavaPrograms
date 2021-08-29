package gfg.oracle;

public class FindElementInMatrix {
    public static void main(String[] args) {
        int[] mat[] = {
                {3, 30, 38},
                {44, 52, 54},
                {57, 60, 69}
        };

        int n = 62;
        boolean isFound = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (mat[i][j] == n) {
                    isFound = true;
                    break;
                }
            }
        }
        if (isFound)
            System.out.println(1);
        else
            System.out.println(0);
    }
}

