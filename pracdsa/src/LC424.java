public class LC424 {
    public static int characterReplacement(String s, int k)
    {
        int r=0,l=0;
        int mxFreq=0;
        int[] freq=new int[26];
       int res=0;
       for(r=0;r<s.length();r++)
       {
           int idx=s.charAt(r)-'A';
           freq[idx]++;
           mxFreq=Math.max(mxFreq,freq[idx]);

           if((r-l+1)-mxFreq>k)
           {
               freq[s.charAt(l)-'A']--;
               l++;
           }
           res = Math.max(mxFreq,r-l+1);
       }
return res;
    }
    public static void main(String[] args) {
        String s = "AABABBA";
                int k = 1;
        System.out.println(characterReplacement(s,k));


    }
}
