package _884;

import java.util.Stack;

/**
 * @author lining
 * @date 18-11-15
 */
public class Solution1 {
    public boolean isEquls(String str1, String str2) {
        if (str1 == null && str2 == null) {
            return true;
        }

        Stack<Character> stack = new Stack<Character>();
        if (str1 != null) {
            for (Character character : str1.toCharArray()) {

                if ('#' == character) {
                    if (stack.isEmpty()) {
                        continue;
                    }
                    stack.pop();
                } else {
                    stack.push(character);
                }
            }
        }
        Stack<Character> stack2 = new Stack<Character>();
        if (str2 != null) {
            for (Character character : str2.toCharArray()) {

                if ('#' == character) {
                    if (stack2.isEmpty()) {
                        continue;
                    }
                    stack2.pop();
                } else {
                    stack2.push(character);
                }
            }
        }

        if (stack.toString().equals(stack2.toString())) {
            return true;
        }
        return false;

    }
}
