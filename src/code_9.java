import java.util.HashMap;
import java.util.Stack;

public class code_9 {
    public static void main(String[] args){
        CQueue obj = new CQueue();
        obj.appendTail(1);
        int param_2 = obj.deleteHead();
    }
}

class CQueue {

    Stack<Integer> stack1;
    Stack<Integer> stack2;
    public CQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void appendTail(int value) {
        while (!stack2.isEmpty())
            stack1.push(stack2.pop());
        stack1.push(value);
    }

    public int deleteHead() {
        while (!stack1.isEmpty())
            stack2.push(stack1.pop());

        return stack2.isEmpty() ? -1 : stack2.pop();
    }
}