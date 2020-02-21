public class code_54 {
    public static void main(String[] args){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);
        System.out.println(kthLargest(root,1));
    }

    // 第k大的
    public static int kthLargest(TreeNode root, int k) {
        if (k <= 0 || root == null) return 0;
        int right = getNodeNum(root.right);
        if (right == k-1){
            return root.val;
        }else if (right > k-1){// 在右边
            return kthLargest(root.right,k);
        }else {// 在左边
            return kthLargest(root.left,k-right-1);
        }
    }

    public static int getNodeNum(TreeNode root){
        if (root == null) return 0;
        int left = getNodeNum(root.left);
        int right = getNodeNum(root.right);
        return left+right+1;
    }
}
