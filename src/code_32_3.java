import java.util.*;

public class code_32_3 {
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(3);
        List<List<Integer>> ret = levelOrder(root);
        for (List<Integer> list : ret){
            for (int num:list){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }

    // 两个栈
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<>();
        if (root == null) return ret;
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(root);
        while (!stack1.isEmpty() || !stack2.isEmpty()){
            List<Integer> list = new ArrayList<>();
            if (!stack1.isEmpty()){ // 在 stack1 中
                while (!stack1.isEmpty()){
                    TreeNode node = stack1.pop();
                    list.add(node.val);
                    if (node.left!=null){
                        stack2.add(node.left);
                    }
                    if (node.right != null){
                        stack2.add(node.right);
                    }
                }
            }else{ // stack2 不为空
                while (!stack2.isEmpty()){
                    TreeNode node = stack2.pop();
                    list.add(node.val);
                    if (node.right != null){
                        stack1.add(node.right);
                    }
                    if (node.left!=null){
                        stack1.add(node.left);
                    }
                }
            }
            ret.add(new ArrayList<>(list));
        }
        return ret;
    }
}
