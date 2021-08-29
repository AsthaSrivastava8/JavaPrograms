package gfg.oracle;

public class BinaryTreeDiameter {
    TreeNode root;

    public static void main(String[] args) {

        BinaryTreeDiameter tree = new BinaryTreeDiameter();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        System.out.println(diameter(tree.root));

    }

    private static int height(TreeNode root) {
        if (root == null)
            return 0;
        int left = height(root.left);
        int right = height(root.right);
        if (left > right)
            return left + 1;
        return right + 1;
    }

    private static int diameter(TreeNode root) {

        if (root == null)
            return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int leftDiameter = diameter(root.left);
        int rightDiameter = diameter(root.right);

        return Math.max(leftHeight + rightHeight + 1,
                Math.max(leftDiameter, rightDiameter));
    }
}


/*
 find left subtree diameter
 find right subtree diameter
 find left height + right height +1
 return max of these three
 */