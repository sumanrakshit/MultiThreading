import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class LC496 {

    public  static int[] nextGreaterElement(int[] nums1, int[] nums2)
    {
        int n=nums1.length;
        int m=nums2.length;
        int[] result=new int[n];
        Map<Integer,Integer> mp=new HashMap<>();
        Stack<Integer> st=new Stack<>();
        for(int num :nums2)
        {
            while( !st.isEmpty() && st.peek()<num)
            {
                mp.put(st.pop(),num);

            }
            st.push(num);
        }
        for(int i=0;i<n;i++)
        {
            result[i] = mp.getOrDefault(nums1[i], -1);
        }
        return  result;
    }

    public static void main(String[] args) {
       int [] nums1 = {4,1,2};
       int [] nums2 = {1,3,4,2};
        int [] result= nextGreaterElement(nums1,nums2);
        for(int num:result)
        {
            System.out.println(num);
        }

    }

}
