package _206;

/**
 * @author lining
 * @date 18-11-13
 */

public class Node {

    public Node(String value) {
        this.value = value;
    }

    private String value;

    private Node nextNode;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public static void print(Node node) {
        while (node != null) {
            System.out.print(node.getValue() + "->");
            node = node.getNextNode();
        }
        System.out.println();
    }
}
