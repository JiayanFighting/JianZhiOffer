import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class code_33 {
    public static void main(String[] args){
        int[] postorder = {1,3,2,6,5};
        //            5
        //         2       7
        //       1   3   6   9
        //             4
        // 1 4 3 2 6 9 7 5
        System.out.println(verifyPostorder(postorder));
    }

    public static boolean verifyPostorder(int[] postorder) {
        if (postorder.length <= 1) return true;
        return helper(0,postorder.length-1,postorder);
    }

    public static boolean helper(int begin, int end, int[] postorder){
        if (begin == end)  return true;
        if (begin > end || end >= postorder.length || begin < 0) return false;
        int root = postorder[end];
        int i = begin;
        for (;i<end;i++){
            if (postorder[i] > root){
                break;
            }
        }
        for (int j = i+1;j<end;j++){
            if (postorder[j] < root){
                return false;
            }
        }
        return helper(begin,i-1,postorder) && helper(i,end-1,postorder);
    }
}
