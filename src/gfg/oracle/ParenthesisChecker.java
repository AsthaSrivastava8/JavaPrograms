package gfg.oracle;

import java.util.Scanner;

public class ParenthesisChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Stack stack = new Stack();
        for (int i = 0; i < input.length(); i++) {
            if (stack.size == 0)
                stack.push(input.charAt(i));
            else if (stack.peek() == '{' && input.charAt(i) == '}')
                stack.pop();
            else if (stack.peek() == '[' && input.charAt(i) == ']')
                stack.pop();
            else if (stack.peek() == '(' && input.charAt(i) == ')')
                stack.pop();
            else
                stack.push(input.charAt(i));
        }

        if (stack.size == 0)
            System.out.println(true);
        else
            System.out.println(false);


    }
}
