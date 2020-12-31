import java.util.ArrayList;

public class day1_stack {
    public static void main(String[] args) {
    }
}

class MinStack {

    ArrayList<Integer> stack = new ArrayList();
    public MinStack() {

    }

    public void push(int x) {
        stack.add(x);
    }

    public void pop() {
        int last = stack.size() - 1;
        stack.get(last);
        stack.remove(last);
    }

    public int top() {
        return stack.get(stack.size() - 1);
    }

    public int getMin() {
        int min = stack.get(0);
        for(int i = 1; i < stack.size(); i++){
            if(min > stack.get(i)){
                min = stack.get(i);
            }
        }
        return min;
    }
}