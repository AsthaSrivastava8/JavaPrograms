package gfg.oracle;

public class Profession {
    TreeNode root;

    public static void main(String[] args) {
        Profession profession = new Profession();
        profession.root = new TreeNode(69);
        profession.root.left = new TreeNode(69);
        profession.root.right = new TreeNode(68);
        profession.root.left.left = new TreeNode(69);
        profession.root.left.right = new TreeNode(68);
        profession.root.right.left = new TreeNode(68);
        profession.root.right.right = new TreeNode(69);
        profession.root.left.left.left = new TreeNode(69);
        profession.root.left.left.right = new TreeNode(68);
        profession.root.left.right.left = new TreeNode(68);
        profession.root.left.right.right = new TreeNode(69);
        profession.root.right.left.left = new TreeNode(68);
        profession.root.right.left.right = new TreeNode(69);
        profession.root.right.right.left = new TreeNode(69);
        profession.root.right.right.right = new TreeNode(68);

        int level = 4, pos = 2;

        System.out.println((char) findProfession(level, pos));

    }

    private static int findProfession(int level, int pos) {
        if (level == 1)
            return 69;

        if (findProfession(level - 1, (pos + 1) / 2) == 68)
            return pos % 2 > 0
                    ? 68
                    : 69;
        return pos % 2 > 0
                ? 69
                : 68;

    }

}
