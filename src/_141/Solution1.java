package _141;

import java.util.HashSet;
import java.util.Set;

/**
 * @author lining
 * @date 18-11-16
 *
 * 题目描述：
 * 给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
 * 说明：不允许修改给定的链表。
 *
 */
public class Solution1 {
    public boolean hasCycleBySet(ListNode head) {

        Set<ListNode> set = new HashSet<>();

        ListNode dummy = head;
        while (dummy != null) {
            if (set.contains(dummy)) {
                return true;
            } else {
                set.add(dummy);
            }
            dummy = dummy.next;
        }
        return false;

    }

    public static void main(String[] args) {
        ListNode A = new ListNode(1);
        ListNode B = new ListNode(2);
        ListNode C = new ListNode(3);
        ListNode D = new ListNode(4);
        ListNode E = new ListNode(5);
        A.next = B;
        B.next = C;
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.hasCycleBySet(A));
    }
}
