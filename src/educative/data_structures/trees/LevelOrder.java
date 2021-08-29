package educative.data_structures.trees;

public class LevelOrder {
    Node root;

    public static void main(String[] args) {
        LevelOrder tree = new LevelOrder();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        printLevelOrder(tree.root);
    }

    private static void printLevelOrder(Node root) {
        int h = height(root);
        int i;
        for (i = 1; i <= h; i++) {
            printGivenLevel(root, i);
            System.out.println();
        }
    }

    private static int height(Node root) {
        if (root == null)
            return 0;
        else {
            /* compute the depth of each subtree */
            int lDepth = height(root.left);
            int rDepth = height(root.right);

            /* use the larger one */
            if (lDepth > rDepth)
                return (lDepth + 1);
            else
                return (rDepth + 1);
        }
    }

    private static void printGivenLevel(Node root, int level) {
        if (root == null)
            return;
        if (level == 1)
            System.out.println(root.data);
        if (level > 1) {
            printGivenLevel(root.left, level - 1);
            printGivenLevel(root.right, level - 1);
        }
    }
}
