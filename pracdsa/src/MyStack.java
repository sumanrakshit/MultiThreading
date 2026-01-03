import java.util.LinkedList;
import java.util.Queue;

public class MyStack {

    Queue<Integer> q=new LinkedList<>();
    public void push(int x)
    {
        q.add(x);
        for(int i=1;i<q.size();i++)
        {
            q.add(q.remove());
        }
    }
    public static void main(String[] args) {

    }
}
