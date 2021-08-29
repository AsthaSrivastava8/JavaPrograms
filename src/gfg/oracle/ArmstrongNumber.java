package gfg.oracle;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int temp = n;
        int sum = 0;
        while (temp > 0) {
            int digit = temp% 10;
            sum += Math.pow(digit, 3);
            temp = temp/10;
        }
        if (sum == n)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
