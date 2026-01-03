import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class LC503 {

    public static int[] nextGreaterElements(int[] nums)
    {
        Map<Integer,Integer> store=new HashMap<>();
        int n=nums.length;
        Stack<Integer> check=new Stack<>();
        int [] result=new int[n];
        for(int i=0;i<2 * n;i++)
        {
            int num=nums[i% n];
            while(!check.isEmpty() && nums[check.peek()]<num)
            {
                store.put(check.pop(),num);
            }
            if(i<n)
            {
                check.push(i);
            }
        }
        for (int i = 0; i < n; i++) {
            result[i] = store.getOrDefault(i, -1);
        }
return  result;
    }
    public static void main(String[] args) {

        int[] nums = {1,2,1};
        int [] res=nextGreaterElements(nums);
        for (int n:res)
        {
            System.out.println(n);
        }
    }


}
