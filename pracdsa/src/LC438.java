import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC438 {
    public  static List<Integer> findAnagrams(String s, String p)
    {
        List<Integer> result=new ArrayList<>();
        int n=s.length();
        int m=p.length();
        if(n<m)
            return  result;

        int[] sPattern=new int[26];
        int[] pPattern=new int[26];

        for(int i=0;i<m;i++)
        {
            sPattern[s.charAt(i) -'a']++;
            pPattern[p.charAt(i)-'a']++;
        }
        if(Arrays.equals(sPattern,pPattern))
        {
            result.add(0);
        }
        for(int i=m;i<n;i++)
        {
            sPattern[s.charAt(i)-'a']++;
            sPattern[s.charAt(i-m)-'a']--;
            if(Arrays.equals(sPattern,pPattern))
            {
                result.add(i-m+1);
            }
        }
        return result;


    }
    public static void main(String[] args) {
        String s = "cbaebabacd", p = "abc";
        System.out.println(findAnagrams(s,p));

    }
}
