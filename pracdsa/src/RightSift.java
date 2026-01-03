public class RightSift {
    public static void main(String[] args) {
        int[] arr={2,4,5,3};
        int last=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--)
        {
            arr[i]=arr[i-1];

        }
        arr[0]=last;
        for (int n:arr)
        {
            System.out.println(n);
        }
    }
}
