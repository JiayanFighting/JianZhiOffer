import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class code_32_2 {
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

    // 队列
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<>();
        if (root == null) return ret;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int len = queue.size();
            List<Integer> list = new ArrayList<>();
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
            ret.add(new ArrayList<>(list));
        }
        return ret;
    }
}
