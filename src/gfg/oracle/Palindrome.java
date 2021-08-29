package gfg.oracle;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int temp = n;
        int reverse = 0;
        while (temp > 0) {
            int digit = temp % 10;
            reverse = (reverse * 10) + digit;
            temp = temp / 10;
        }
        if (reverse == n)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
