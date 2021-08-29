package gfg.oracle;

public class RemoveDuplicateLinkedList {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int ele) {
            this.data = ele;
        }
    }

    private void push(int ele) {
        Node node = new Node(ele);
        node.next = null;
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }

    private static void traverseList(Node head) {
        Node temp = head;
        while (temp!= null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        RemoveDuplicateLinkedList list = new RemoveDuplicateLinkedList();
        list.push(2);
        list.push(2);
        list.push(2);

        list.push(4);
        list.push(5);

        removeDuplicates(list.head);
        traverseList(list.head);

    }

    private static void removeDuplicates(Node head) {
        if (head == null)
            return;

        Node temp = head;
        while (temp.next != null) {
            if (temp.data == temp.next.data)
                temp.next = temp.next.next;
            else
                temp = temp.next;
        }
    }
}
