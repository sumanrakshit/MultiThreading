public class LC344 {

    public  static void reverseString(char[] s)
    {
        int n=s.length;
        int l=0;
        int r=n-1;
        while(l<=r)
        {
            char temp= s[l];
            s[l]=s[r];
            s[r]=temp;
            l++;
            r--;
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }

    }
    public static void main(String[] args) {
        char[] str={'h','e','l','l','o'};
        reverseString(str);

    }
}
