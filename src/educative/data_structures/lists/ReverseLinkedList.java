package educative.data_structures.lists;

public class ReverseLinkedList {

    Node head = null;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

    }

    public static void main(String[] args) {
        ReverseLinkedList reverseList = new ReverseLinkedList();

        reverseList.push(1);
        reverseList.push(3);
        reverseList.push(5);
        reverseList.push(7);
        reverseList.push(9);
        reverseList.head = reverseList.reverse(reverseList.head);
        reverseList.traverse();

    }

    private Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    private void traverse() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    private void push(int i) {
        Node node = new Node(i);
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;

            temp.next = node;

        }
    }
}