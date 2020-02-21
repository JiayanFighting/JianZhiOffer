import java.util.ArrayList;
import java.util.List;

public class code_34 {
    public static void main(String[] args){
        int[] postorder = {1,3,2,6,5};
        //            5
        //         2       7
        //       1   3   6   9
        //             4
        // 1 4 3 2 6 9 7 5

    }

    public static List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> ret = new ArrayList<>();
        if (root == null) return ret;
        List<Integer> list = new ArrayList<>();
        list.add(root.val);
        helper(root,sum-root.val,list,ret);
        return ret;
    }

    public static void helper(TreeNode root,int sum,List<Integer> list,List<List<Integer>> ret){
        if (root.left == null && root.right == null){ // 根节点
            if (sum == 0){
                ret.add(new ArrayList<>(list));
                return;
            }
            return;
        }
        if (root.left != null){
            list.add(root.left.val);
            helper(root.left,sum-root.left.val,list,ret);
            list.remove(list.size()-1);
        }
        if (root.right != null){
            list.add(root.right.val);
            helper(root.right,sum-root.right.val,list,ret);
            list.remove(list.size()-1);
        }
    }
}
