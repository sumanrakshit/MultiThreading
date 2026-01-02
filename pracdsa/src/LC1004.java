public class LC1004 {
    public static int longestOnes(int[] nums, int k)
    {
        int l=0,r=0;
        int zeroes=0;
        int res=0;
        for(r=0;r<nums.length;r++)
        {
            if(nums[r]==0)
            {
                zeroes++;
            }
            if(zeroes>k)
            {
                if(nums[l]==0)
                {
                    zeroes--;

                }
                l++;
            }
            res=Math.max(res,r-l+1);
        }
        return res;


    }
    public static void main(String[] args) {
     int[]   nums = {1,1,1,0,0,0,1,1,1,1,0};
     int k = 2;
        System.out.println(longestOnes(nums,k));

    }
}
