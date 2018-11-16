package _142;

/**
 * @author lining
 * @date 18-11-16 题目描述： 给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。 说明：不允许修改给定的链表。
 */
public class Solution2 {
    public ListNode detectCycle(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;
        ListNode meetNode = null;
        while (fast != null && slow != null) {
            // 快指针走一步
            fast = fast.next;
            if (fast == null) {
                return null;
            }
            // 慢的走一步
            slow = slow.next;

            // 快的再走一步
            fast = fast.next;

            if (fast == slow) {
                meetNode = fast;
                break;
            }
        }

        if (meetNode != null) {
            slow = head;
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            return fast;
        }
        return null;

    }

    public static void main(String[] args) {
        ListNode A = new ListNode(1);
        ListNode B = new ListNode(2);
        ListNode C = new ListNode(3);
        ListNode D = new ListNode(4);
        ListNode E = new ListNode(5);
        A.next = B;
        B.next = C;
        C.next = D;
        D.next = E;
        E.next = C;
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.detectCycle(A));
    }
}
