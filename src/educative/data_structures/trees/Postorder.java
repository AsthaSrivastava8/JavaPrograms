package educative.data_structures.trees;

public class Postorder {
    Node root;

    public static void main(String[] args) {
        Postorder tree = new Postorder();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        printPostOrder(tree.root);
    }

    private static void printPostOrder(Node root) {
        if (root == null)
            return;

        printPostOrder(root.left);
        printPostOrder(root.right);
        System.out.println(root.data);
    }
}
