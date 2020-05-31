public class _code_18 {
    public static void main(String[] args) {

    }

    //操作给定的二叉树，将其变换为源二叉树的镜像。
    public static void Mirror(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return;
        }
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        Mirror(root.left);
        Mirror(root.right);
    }
}
