package gfg.oracle;

import java.util.Stack;

public class QueueUsingStack {

    static class Queue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        void enQueue(int ele) {
            while (!s1.empty()) {
                s2.push(s1.pop());
            }
            s1.push(ele);

            while (!s2.empty()) {
                s1.push(s2.pop());
            }
        }

        int deQueue() {
            if (s1.empty()) {
                return -1; // queue empty
            }
            int x = s1.peek();
            s1.pop();
            return x;
        }

    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);

        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
    }
}

