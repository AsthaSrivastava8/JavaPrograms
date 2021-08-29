package gfg.oracle;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingOneQueue {
    static class Stack {
        Queue<Integer> queue = new LinkedList<>();

        int pop() {
            if (queue.isEmpty())
                return -1;
            int size = queue.size();
            for (int i = 0; i < size - 1; i++)
                queue.add(queue.poll());
            return queue.poll();
        }

        void push(int ele) {
            queue.add(ele);
        }
    }

    public static void main(String[] args) {


        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        stack.pop();
        stack.pop();

    }
}
