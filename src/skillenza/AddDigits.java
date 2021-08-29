package skillenza;

import java.util.Scanner;

public class AddDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());
        double input = Math.pow(2, n);
        double ans = 0;
        double temp = input;
        while (ans > 9 || temp > 0) {
            if (temp == 0 && ans > 9) {
                temp = ans;
                ans = 0;
            }
            ans += temp % 10;
            temp /= 10;
        }
        System.out.println(ans);
    }
}
