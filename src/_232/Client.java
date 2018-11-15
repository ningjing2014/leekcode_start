package _232;

/**
 * @author lining
 * @date 18-11-15
 */
public class Client {

    public static void main(String[] args) {
        Solution1<String> solution1 = new Solution1();
        solution1.push("A");
        solution1.push("B");
        solution1.push("C");




        solution1.print();
        solution1.printAndPop();
        solution1.print();
        solution1.printAndPop();
        solution1.printAndPop();



    }
}
