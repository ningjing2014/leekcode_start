package _232;

import java.util.Stack;

/**
 * @author lining
 * @date 18-11-15
 * @实现思路：例用stack的特性来处理
 */
public class Solution1 {
    public boolean isEquls(String str1, String str2) {
        String stack = backSpace(str1);
        String stack2 = backSpace(str2);
        if (stack.equals(stack2)) {
            return true;
        }
        return false;

    }

    private String backSpace(String str) {
        Stack<Character> stack = new Stack<>();
        if (str != null) {
            for (Character character : str.toCharArray()) {

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
        return stack.toString();
    }

}
