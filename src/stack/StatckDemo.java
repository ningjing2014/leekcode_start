package stack;

import java.util.Stack;

/**
 * @author lining
 * @date 18-11-13
 */
public class StatckDemo {

    public static void main(String[] args) {
        System.out.println(valid("(())"));
    }

    public static boolean valid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (Character c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }

        }
        return stack.isEmpty();
    }
}
