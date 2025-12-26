public class LC167 {

    public  static int[] twoSum(int[] numbers, int target)
    {

        try
        {
            int n=numbers.length;
            int l=0;
            int r=n-1;
            while(l<r)
            {
                int sum=numbers[l]+numbers[r];
                if(sum==target)
                {
                    return new int []{l +1,r+1};
                }
                else if(sum<target)
                {
                    l++;
                }
                else {
                    r--;
                }
            }

        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }

return new int[0];
    }
    public static void main(String[] args) {

        int[] numbers = {2, 7, 11, 15};
        int target = 130;
         int [] res=twoSum(numbers,target);
        if (res.length == 0) {
            System.out.println("No pair found");
        } else {
            System.out.println(res[0]);
            System.out.println(res[1]);
        }
    }
}
