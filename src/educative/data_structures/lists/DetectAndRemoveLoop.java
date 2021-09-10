package educative.data_structures.lists;

public class DetectAndRemoveLoop {

    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static public void push(int new_data) {

        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public static void main(String[] args) {
        DetectAndRemoveLoop llist = new DetectAndRemoveLoop();

        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(10);

        llist.head.next.next.next.next = llist.head;

        detectAndRemoveCycle(head);

    }

    private static void detectAndRemoveCycle(Node head) {
        if (head == null || head.next == null) {
            System.out.println("Cycle not found");
            return;
        }
        boolean isCyclic = false;
        Node slow = head, fast = head;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                System.out.println("Cycle found");
                isCyclic = true;
                break;
            }
        }
        if (!isCyclic) {
            System.out.println("Cycle not found");
            return;
        }
    }
}
