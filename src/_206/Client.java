package _206;

/**
 * @author lining
 * @date 18-11-13
 */
public class Client {

    public static void main(String[] args) {
        Node a = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");
        Node d = new Node("D");

        a.setNextNode(b);
        b.setNextNode(c);
        c.setNextNode(d);

        System.out.println(reserve2(a));

    }

    /**
     * 就地反转法 B->A->C->D-> C->B->A->D-> D->C->B->A->
     * 
     * @param head
     * @return
     */
    public static Node reserve(Node head) {

        if (head == null) {
            return null;
        }
        Node dummy = new Node(null);
        Node cur = head;
        dummy.setNextNode(cur);
        Node next = cur.getNextNode();
        while (next != null) {

            // A->C
            cur.setNextNode(next.getNextNode());
            // B->A
            next.setNextNode(dummy.getNextNode());

            dummy.setNextNode(next);

            next = cur.getNextNode();
            Node.print(dummy.getNextNode());
        }
        return dummy.getNextNode();
    }

    /**
     * 新建链表，头节点插入法
     * 
     * @param head
     * @return
     */
    public static Node reserve2(Node head) {

        if (head == null) {
            return null;
        }
        Node dummy = new Node(null);
        Node cur = head;

        while (cur != null) {
            Node next = cur.getNextNode();
            cur.setNextNode(dummy.getNextNode());
            dummy.setNextNode(cur);
            cur = next;
            Node.print(dummy.getNextNode());
        }
        return dummy.getNextNode();
    }

    public static boolean isCicle(Node head) {
        if (head == null) {
            return false;
        }
        Node flow = head;

        Node quick = head;

        while (flow != null && quick != null) {
            flow = flow.getNextNode();
            if (flow == null || quick == null) {
                return false;
            }
            quick = quick.getNextNode().getNextNode();
            if (flow == quick) {
                return true;
            }

        }
        return false;
    }

}
