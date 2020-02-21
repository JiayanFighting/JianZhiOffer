public class code_55_1 {
    public static void main(String[] args){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);
        System.out.println(maxDepth(root));
    }

    // 第k大的
    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null){ // 叶节点
            return 1;
        }
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}
