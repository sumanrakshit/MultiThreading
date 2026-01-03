public class LeftShift {
    public static void main(String[] args) {
        int[] arr={2,4,5,3};
        int first=arr[0];
        for(int i=0;i<arr.length-1;i++)
        {
            arr[i]=arr[i+1];

        }
        arr[arr.length-1]=first;
        for (int n:arr)
        {
            System.out.println(n);
        }
    }
}
