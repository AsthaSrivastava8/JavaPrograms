package educative.data_structures.trees;

public class Preorder {

    Node root;

    public static void main(String[] args) {
        Preorder tree = new Preorder();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        printPreOrder(tree.root);
    }

    private static void printPreOrder(Node root) {
        if (root == null)
            return;

        System.out.println(root.data);
        printPreOrder(root.left);
        printPreOrder(root.right);
    }
}
