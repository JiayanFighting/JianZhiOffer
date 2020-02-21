public class code_27 {
    public static void main(String[] args){

    }

    //      1
    //    2   3
    //   1
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) return root;
        TreeNode mirror = new TreeNode(root.val);
        mirror.left = mirrorTree(root.right);
        mirror.right = mirrorTree(root.left);
        return mirror;
    }
}
