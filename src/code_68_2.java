public class code_68_2 {
    public static void main(String[] args){
        TreeNode root = new TreeNode(3);
        TreeNode left = new TreeNode(5);
        TreeNode right = new TreeNode(1);
        root.left = left;
        root.right = right;
        TreeNode leftleft = new TreeNode(6);
        TreeNode leftright = new TreeNode(2);
        left.left = leftleft;
        left.right = leftright;
        System.out.println(lowestCommonAncestor(root,right,leftleft).val);
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p.val == root.val || q.val == root.val) return root;
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        if (left == null){
            return lowestCommonAncestor(root.right,p,q);
        }else {
            TreeNode right = lowestCommonAncestor(root.right,p,q);
            if (right == null){
                return left;
            }else {
                return root;
            }
        }
    }

    public static TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return root;
        if (p.val == q.val) return p; // 同一节点
        if (p.val == root.val) return p; // p是q的祖先
        if (q.val == root.val) return q; // q是p的祖先
        if (isChild(root.left,p) && isChild(root.left,q)){ // 两个结点都在左边
            return lowestCommonAncestor(root.left,p,q);
        }else if (isChild(root.right ,p) && isChild(root.right,q)){// 两个结点都在右边
            return lowestCommonAncestor(root.right ,p,q);
        }else{ // 一个在左边一个在右边
            return root;
        }
    }

    // p 是否是 root 的孩子节点
    public static boolean isChild(TreeNode root, TreeNode p){
        if (root == null) return false;
        if (root.val == p.val) return true;
        return isChild(root.left,p) || isChild(root.right,p);
    }
}
