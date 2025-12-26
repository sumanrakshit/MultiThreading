public class ValidPalindrome {
    public static boolean isPalindrome(String s)
    {
        String clean=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        System.out.println(clean);

        int l=0;
        int r=clean.length()-1;
        while(l<=r)
        {
            if(clean.charAt(l) !=clean.charAt(r))
            {
                return false;

            }
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {

        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";

        System.out.println(isPalindrome(s1)); // true
        System.out.println(isPalindrome(s2)); // false;
    }
}
