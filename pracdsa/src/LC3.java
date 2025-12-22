import java.util.HashSet;

public class LC3 {
    public static String getNonRepeatingString(String str)
    {
        String result="";
        HashSet<Character> check=new HashSet<>();
        int l=0,r=0;
        while(r<str.length())
        {
            if(!check.contains(str.charAt(r)))
            {
                check.add(str.charAt(r));
                r++;
                if(r-l>result.length())
                {
                    result=str.substring(l,r);
                }
            }
            else
            {
                check.remove(str.charAt(l));
                l++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str="abcadsccde";
        System.out.println("Longest substring without repeating character:  " + getNonRepeatingString(str));

    }
}
