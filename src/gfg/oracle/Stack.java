package gfg.oracle;

public class Stack {
    char[] stack = new char[32000];
    int size;

    public char pop() {

        size--;
        return stack[size + 1];
    }

    public void push(char ch) {
        stack[size++] = ch;
    }

    public char peek() {
        return stack[size - 1];
    }
}

