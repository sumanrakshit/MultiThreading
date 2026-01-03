import java.util.Stack;

public class LC150 {

    public static  boolean isHelper(String s)
    {
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
    }
    public static int evalRPN(String[] tokens)
    {
        int res=0;
        Stack<Integer> check=new Stack<>();
        for(int i=0;i<tokens.length;i++)
        {
       if(isHelper(tokens[i]))
       {
           int b=check.pop();
           int a=check.pop();
            switch ( tokens[i])
            {
                case "+" -> check.push(a + b);
                case "-" -> check.push(a - b);
                case "*" -> check.push(a * b);
                case "/" -> check.push(a / b);
            }
       }
       else
       {
           check.push(Integer.parseInt(tokens[i]));
       }
        }
        return  check.pop();

    }
    public static void main(String[] args) {

         String []tokens = {"2","1","+","3","*"};
        System.out.println(evalRPN(tokens));

    }
}
