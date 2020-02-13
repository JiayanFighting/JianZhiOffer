import java.util.HashMap;

public class code_7 {
    public static void main(String[] args){

    }

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(inorder,preorder,0,preorder.length-1,0,inorder.length-1);
    }

    public static TreeNode helper(int[] preorder, int[] inorder,int preStart,int preEnd, int inStart, int inEnd){
        if (preStart < 0 || inStart < 0 || preEnd >= preorder.length || inEnd>= inorder.length || preStart > preEnd || inStart > inEnd) return null;
        TreeNode root = new TreeNode(inorder[inStart]);
        int k = preStart,num = 0;
        for (;k<=preEnd;k++){
            if (preorder[k] == inorder[inStart]) break;
            num ++;
        }
        root.left  = helper(preorder,inorder,preStart,k-1,inStart+1,inStart+num);
        root.right  = helper(preorder,inorder,k+1,preEnd,inStart+num+1,inEnd);
        return root;
    }
}
