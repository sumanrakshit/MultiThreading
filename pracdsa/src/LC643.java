public class LC643 {
    public  static double findMaxAverage(int[] nums, int k)
    {
        double res=0;
        int mxSum=0;
        int sum=0;
        for(int i=0;i<k;i++)
        {

            sum +=nums[i];
        }
        res=sum/k;

        for(int i=k;i<nums.length;i++)
        {
            sum +=nums[i]- nums[i-k];
            mxSum =Math.max(sum,mxSum);

        }
        return (double) mxSum/k;


    }

    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        System.out.println(findMaxAverage(nums, k));

    }
}
