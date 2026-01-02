import java.util.HashMap;
import java.util.Map;

public class lengthOfLongestSubstringK {
    public  static int lengthOfLongestSubstringKDistinct(String s, int k)
    {
        int res=0;
        int l=0;
        Map<Character,Integer> treck=new HashMap<>();
        for(int r=0;r<s.length();r++)
        {
            char c=s.charAt(r);
            treck.put(c,treck.getOrDefault(c,0)+1);
            while(treck.size()>k)
            {
                char lc=s.charAt(l);
                treck.put(lc,treck.get(lc)-1);
                if(treck.get(lc)==0)
                    treck.remove(lc);
                l++;
            }
            res=Math.max(res,r-l+1);


        }

        return res;
    }
    public static void main(String[] args) {
        String s = "eceba";
        int k = 2;
        System.out.println(lengthOfLongestSubstringKDistinct(s,k));
    }
}
