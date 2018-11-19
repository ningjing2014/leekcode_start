package _21;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
public class Solution1 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode head = null;
        if (l1.val > l2.val) {
            head = l2;
            head.next = mergeTwoLists(l1, l2.next);
        } else {
            head = l1;
            head.next = mergeTwoLists(l1.next, l2);
        }
        return head;
    }

    public static void print(ListNode node) {
        while (node != null) {
            System.out.print(node.val + "->");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(3);
        ListNode l3 = new ListNode(5);

        l1.next = l2;
        l2.next = l3;

        ListNode l4 = new ListNode(2);
        ListNode l5 = new ListNode(3);
        ListNode l6 = new ListNode(4);
        l4.next = l5;
        l5.next = l6;

        Solution1 solution1 = new Solution1();
        ListNode mergeNode = solution1.mergeTwoLists(l1, l4);
        print(mergeNode);
    }
}