package gfg.oracle;

import java.util.Scanner;

public class ChangeCaseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder(input.substring(0, 1));
        boolean isUpperCase = true;
        if (input.charAt(0) >= 97 && input.charAt(0) <= 122)
            isUpperCase = false;

        if (isUpperCase)
            for (int i = 1; i < input.length(); i++) {
                char ch = input.charAt(i) > 90
                        ? (char) (input.charAt(i) - 32)
                        : input.charAt(i);
                stringBuilder.append(ch);
            }
        else
            for (int i = 1; i < input.length(); i++) {
                char ch = input.charAt(i) < 97
                        ? (char) (input.charAt(i) + 32)
                        : input.charAt(i);
                stringBuilder.append(ch);
            }
        System.out.println(stringBuilder);

    }
}
