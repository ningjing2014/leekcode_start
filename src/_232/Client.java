package _232;

/**
 * @author lining
 * @date 18-11-15
 */
public class Client {

    public static void main(String[] args) {
        // ----------测试栈转队列
        Solution1<String> solution1 = new Solution1();
        solution1.push("A");
        solution1.push("B");
        solution1.push("C");

        solution1.print();
        solution1.printAndPop();
        solution1.print();
        solution1.printAndPop();
        solution1.printAndPop();
        // ----------------测试队列转栈
        Solution2<String> solution2 = new Solution2<>();
        solution2.add("A");
        solution2.add("B");
        solution2.add("C");
        solution2.add("D");
        solution2.print();
        solution2.print();

        solution2.printAndPoll();
        solution2.printAndPoll();
        solution2.printAndPoll();
        solution2.printAndPoll();
        solution2.printAndPoll();
        solution2.printAndPoll();

    }
}
