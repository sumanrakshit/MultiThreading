public class MinSubArrayLen {

    public static int minSubArrayLen(int s, int[] nums)
    {
        int result=Integer.MAX_VALUE;
        int n=nums.length;
        int l=0;
        int sum=0;
        for(int r=0;r<n;r++)
        {
            sum +=nums[r];
          while(sum >=s)
          {
              result=Math.min(result,r-l+1);
              sum -=nums[l];
              l++;
          }
        }
        return result ==Integer.MAX_VALUE?0:result;


    }
    public static void main(String[] args) {
        int s = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};

        System.out.println(minSubArrayLen(s, nums));

    }
}
