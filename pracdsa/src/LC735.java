import java.util.Stack;

public class LC735 {
    public static int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> check = new Stack<>();

        for (int ast : asteroids) {
            boolean destroy = false;

            while (!check.isEmpty() && ast < 0 && check.peek() > 0) {
                if (Math.abs(ast) > check.peek()) {
                    check.pop();
                } else if (Math.abs(ast) == check.peek()) {
                    check.pop();
                    destroy = true;
                    break;
                } else {
                    destroy = true;
                    break;
                }
            }

            if (!destroy) {
                check.push(ast);
            }
        }

        int[] res = new int[check.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = check.pop();
        }

        return res;
    }

    public static void main(String[] args) {
        int arr[] = {3, 5, -6, 2, -1, 4};
        int res[] = asteroidCollision(arr);
        for (int n : res) {
            System.out.println(n);
        }
    }
}
