package _876;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    /**
     * 给定一个带有头结点 head 的非空单链表，返回链表的中间结点。如果有两个中间结点，则返回第二个中间结点。 <br>
     * <b>利用快慢指针来实现<b/>
     * 
     * @param node
     * @return
     */
    public ListNode middleNode(ListNode node) {
        if (node == null) {
            return null;
        }
        List<ListNode> list = new ArrayList<>();
        while (node != null) {
            list.add(node);
            node = node.next;
        }

        ListNode middle = list.get(list.size() / 2);

        return middle;
    }

    public static void main(String[] args) {
        Solution2 solution1 = new Solution2();
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;

        ListNode node = solution1.middleNode(l1);
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