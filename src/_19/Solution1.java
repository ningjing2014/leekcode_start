package _19;

public class Solution1 {
    /**
     * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。 <br>
     * <b>利用快慢指针来实现<b/>
     * 
     * @param node
     * @param n
     * @return
     */
    public ListNode JumpToNodeN(ListNode node, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = node;
        ListNode head = dummy;
        ListNode tail = dummy;
        // 定位快指针
        while (n > 0) {
            if (tail == null) {
                throw new RuntimeException("链表元素不足" + n + "个");
            }
            tail = tail.next;
            n--;
        }
        // 快指针走一步，则慢指针走一步，等快的到头，即 慢指针为要删除的数据
        while (tail != null && tail.next != null) {
            tail = tail.next;
            head = head.next;
        }
        if (head.next != null) {
            head.next = head.next.next;
        } else {
            head.next = null;
        }

        return dummy;

    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;

        ListNode node = solution1.JumpToNodeN(l1, 5);
        print(node);
    }

    public static void print(ListNode node) {
        while (node != null) {
            System.out.print(node.val + "->");
            node = node.next;
        }
        System.out.println();
    }
}