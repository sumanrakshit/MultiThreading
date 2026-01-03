import java.util.Stack;

public class LC84 {
    public static int largestRectangleArea(int[] heights)
    {
        int n=heights.length;
        Stack<Integer> check=new Stack<>();
        int mxArea=0;
        for(int i=0;i<=n;i++)
        {
            int currentheight= (i == n) ? 0 : heights[i];
            while(!check.isEmpty() && currentheight< heights[check.peek()])
            {
                int height=heights[check.pop()];
                int width=check.isEmpty() ? i: i-check.peek()-1;
                mxArea= Math.max(mxArea,height*width);
            }
            check.push(i);
        }


return  mxArea;
    }
    public static void main(String[] args) {
        int []heights = {2,1,5,6,2,3};
        System.out.println(largestRectangleArea(heights));

    }
}
