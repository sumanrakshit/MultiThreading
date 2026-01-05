public class LC74 {

    public static boolean searchMatrix(int[][] matrix, int target)
    {
        int n=matrix.length;
        int m=matrix[0].length;
        int l=0;
        int r=m*n-1;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            int row=mid/m;
            int col=mid%m;
            int midValue=matrix[row][col];
            if(midValue==target)
            {
                return  true;
            } else if (midValue<target) {
                l=mid+1;
            }
            else
            {
                r=mid-1;
            }

        }
        return  false;
    }


    public static void main(String[] args) {

    }
}
