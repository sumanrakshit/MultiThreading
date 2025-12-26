public class LC26 {

    public  static int removeDuplicates(int[] nums)
    {

        int n=nums.length;
        if(n==0)
        {
            return 0;
        }
        int i=0;
        for(int j=1;j<n;j++)
        {
            if(nums[i] !=nums[j])
            {
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;

    }
    public static void main(String[] args) {
       int[] nums = {1,1,2,2,3};
        System.out.println(removeDuplicates(nums));

    }
}
