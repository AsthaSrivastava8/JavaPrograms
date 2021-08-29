package skillenza;

import java.util.Scanner;

public class IfPrime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t > 0) {
            long n = scn.nextLong();
            long c = 0, i;
            for (i = 2; i <= n; i++) {
                if (n % i == 0)
                    c++;
                if (c > 1)
                    break;
            }
            if (c == 1)
                System.out.println("prime");
            else
                System.out.println("not prime");
            t--;

        }
    }
}
