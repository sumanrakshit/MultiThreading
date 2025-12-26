public class LC283 {
    public  static void moveZeroes(int[] nums)
    {
        int n=nums.length;
        int i=0;
        for(int j=0;j<n;j++)
        {
            if(nums[j]!=0)
            {
                nums[i]=nums[j];
                i++;
            }
        }
        while(i<n)
        {
            nums[i]=0;
            i++;
        }
        for(int k=0;k<n;k++)
        {
            System.out.println(nums[k]);

        }

    }

    public static void main(String[] args) {

         int [] nums={0, 1, 0, 3, 12};
         moveZeroes(nums);
    }
}
