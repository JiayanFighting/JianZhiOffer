import java.util.Stack;

public class code_31 {
    public static void main(String[] args){
        int[] pushed = {1,2,4,5,6,7};
        int[] popped = {2,1,5,7,4,6};
        System.out.println(validateStackSequences(pushed,popped));
    }

    // 1 2
    //
    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        if (pushed.length == 0 && popped.length == 0) return true;
        if (pushed.length == 0 || popped.length == 0) return false;
        if (pushed.length != popped.length) return false;
        Stack<Integer> stack = new Stack<>();
        stack.push(pushed[0]);
        int index1 = 1,index2 = 0;
        while (index2 < popped.length ){
            if (stack.isEmpty()){
                if (index1 < pushed.length){
                    stack.push(pushed[index1]);
                    index1 ++;
                }else {
                    return false;
                }
            }else{
                int top = stack.peek();
                if (top == popped[index2]){
                    stack.pop();
                    index2++;
                }else if (index1 < pushed.length){
                    stack.push(pushed[index1]);
                    index1 ++;
                }else {
                    return false;
                }
            }

        }
        return true;
    }
}
