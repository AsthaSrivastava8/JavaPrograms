package gfg.amazon;

import java.util.Scanner;

public class ReplaceAll0With5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int newNumber = 0;
        int temp = number;
        while (temp > 0) {
            int rem = temp % 10;
            if (rem == 0)
                newNumber = newNumber * 10 + 5;
            else
                newNumber = newNumber * 10 + rem;
            temp = temp / 10;
        }
        number = newNumber;
        temp = number;
        newNumber = 0;
        while (temp > 0) {
            newNumber = newNumber *10 + (temp%10);
            temp /= 10;
        }

        System.out.println(newNumber);
    }

}
