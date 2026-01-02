public class LC1343 {
    public static int numOfSubarrays(int[] arr, int k, int threshold)
    {
    int res=0;
    int sum=0;
    int target=k * threshold;
     for(int i=0;i<k;i++)
     {
         sum +=arr[i];

     }

     if(sum>=threshold)
     {
         res++;
     }
     for(int i=k;i<arr.length;i++)
     {
         sum +=arr[i] -arr[i-k];
         if(sum>=target)
         {
             res++;
         }
     }
         return res;
    }
    public static void main(String[] args) {

        int []arr = {2,2,2,2,5,5,5,8};
        int k = 3;
        int threshold = 4;
        System.out.println(numOfSubarrays(arr,k,4));

    }
}
