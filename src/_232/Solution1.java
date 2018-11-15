package _232;

import java.util.Stack;

/**
 * @author lining
 * @date 18-11-15 @实现思路：
 */
public class Solution1<E> {

    private Stack<E> stack = new Stack();
    private Stack<E> stack2 = new Stack();

    void push(E e) {
        stack.add(e);
    }

    E pop() {
        if (stack2.empty()) {
            while (!stack.empty()) {
                stack2.push(stack.pop());
            }
        }
        return stack2.pop();
    }

    E peek() {
        if (stack2.empty()) {
            while (!stack.empty()) {
                stack2.push(stack.pop());
            }
        }
        return stack2.peek();
    }

    boolean empty() {
        return stack2.empty() && stack.empty();
    }

    void printAndPop() {
        System.out.println(this.pop());
    }

    void print() {
        System.out.println(this.peek());
    }

}
