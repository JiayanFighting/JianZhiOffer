import java.util.HashMap;

public class code_26 {
    public static void main(String[] args){
        TreeNode A = new TreeNode(1);
        A.left = new TreeNode(0);
        A.right = new TreeNode(1);
        A.left.left = new TreeNode(-4);
        A.left.right = new TreeNode(3);

        TreeNode B = new TreeNode(1);
        B.left = new TreeNode(-4);
        System.out.println(isSubStructure(A,B));
    }

    public static boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B ==null) return false; // null 不是任何树的子结构
        return helper(A,B) || isSubStructure(A.left,B) || isSubStructure(A.right,B);
    }

    public static boolean helper(TreeNode A, TreeNode B){
        if (A == null && B ==null) return true;
        if (A == null) return false;
        if (B == null) return true;
        if (A.val != B.val) return false;
        return helper(A.left,B.left) && helper(A.right,B.right);
    }
}
