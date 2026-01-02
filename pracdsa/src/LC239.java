import java.util.Arrays;

public class LC239 {
    public static  int findMax(int [] arr)
    {

        return Arrays.stream(arr).max().getAsInt();
    }
    public static int[] maxSlidingWindow(int[] nums, int k)
    {

        int n=nums.length;
        if(n==0) return new int[0];
        int[] res=new int[n-k+1];
        for(int i=0;i<=n-k;i++)
        {
            int [] windows=Arrays.copyOfRange(nums,i,i+k);
            res[i]=findMax(windows);

        }
return res;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int res[]=maxSlidingWindow(arr,k);
        for(int i=0;i<res.length;i++)
        {
            System.out.println(res[i]);
        }

    }
}
