import java.util.Stack;

public class LC20 {


    public static boolean isHelper(char open,char close)
    {
        return (open=='(' && close==')') || (open=='{' && close=='}') ||(open=='[' && close==']');
    }
    public static boolean isValid(String s)
    {
        Stack<Character> check=new Stack<>();
        for(char c: s.toCharArray())
        {
            if(c=='(' || c=='{' || c=='[')
            {
               check.push(c);
            }
            else {
                if(check.isEmpty() || !isHelper(check.pop(),c))
                {
                    return false;
                }
            }

        }
        return check.isEmpty();

    }

    public static void main(String[] args) {

        String str="()[]{}";
        System.out.println(isValid(str));
        String s= "(]";
        System.out.println(isValid(s));

    }
}
