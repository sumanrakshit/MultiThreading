public class LC11 {
    public static int maxArea(int[] height)
    {
        int n=height.length;
        int l=0;
        int r=n-1;
        int mxWater=Integer.MIN_VALUE;
        while(l<r)
        {
            int water=Math.min(height[l],height[r])*(r-l);
            mxWater=Math.max(water,mxWater);
            if(height[l]<height[r])
            {
                l++;
            }
            else
            {
                r--;
            }
        }
        return mxWater;
    }

    public static void main(String[] args) {

          int [] height={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));

    }
}
