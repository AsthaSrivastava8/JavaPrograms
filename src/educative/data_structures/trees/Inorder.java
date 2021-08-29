package educative.data_structures.trees;

// left - root - right

public class Inorder {

    Node root;

    public static void main(String[] args) {
        Inorder tree = new Inorder();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        printInorder(tree.root);

    }

    private static void printInorder(Node root) {

        if (root == null)
            return;
        printInorder(root.left);
        System.out.println(root.data);
        printInorder(root.right);
    }

}
