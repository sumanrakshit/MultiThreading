import java.util.Stack;

public class LC739 {

    public  static int[] dailyTemperatures(int[] temperatures)
    {
        int n=temperatures.length;
        int [] res=new int[n+1];
        Stack<Integer> check=new Stack<>();
        for(int i=0;i<n;i++)
        {
            while(check.isEmpty() || temperatures[i]>temperatures[check.peek()])
            {
                int idx=check.pop();
                res[idx]=i-idx;
            }
            check.push(i);
        }

return res;
    }

    public static void main(String[] args) {

    }
}
