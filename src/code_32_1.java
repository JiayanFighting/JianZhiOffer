import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class code_32_1 {
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(3);
        int[] ret = levelOrder(root);
        for (int num : ret){
            System.out.print(num+" ");
        }
    }

    // 队列
    public static int[] levelOrder(TreeNode root) {
        if (root == null) return new int[0];
        ArrayList<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int len = queue.size();
            for (int i = 0;i<len;i++){
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null){
                    queue.add(node.left);
                }
                if (node.right != null){
                    queue.add(node.right);
                }
            }
        }
        int[] ret = new int[list.size()];
        for (int i = 0;i<list.size();i++){
            ret[i] = list.get(i);
        }
        return ret;
    }
}
