import java.util.Stack;

public class LC155 {

    private Stack<Integer>  newStack;
    private Stack<Integer> minStack;

    public LC155() {
        newStack=new Stack<>();
        minStack=new Stack<>();

    }

public  void push(int val)
{
    newStack.push(val);
    if(minStack.isEmpty() || val<=minStack.peek())
    {
        minStack.push(val);
    }

}
    public void pop() {
        if(newStack.peek().equals(minStack.peek()))
        {
            minStack.pop();
        }
        newStack.pop();

    }

    public int top() {
        return newStack.peek();

    }

    public int getMin() {
        return minStack.peek();

    }
    public static void main(String[] args) {

    }
}
