package _703;

import java.util.PriorityQueue;

/**
 * @author lining
 * @date 18-11-20 PriorityQueue 默认是小顶堆，利用小顶推实现
 */
public class Solution1 {
    PriorityQueue<Integer> priorityQueue;
    int k;

    public Solution1(int k, int[] nums) {
        this.k = k;
        priorityQueue = new PriorityQueue<>();

        if (nums.length < k) {
            for (int num : nums) {
                priorityQueue.add(num);
            }
        } else {
            for (int num : nums) {
                if (priorityQueue.size() < k) {
                    priorityQueue.add(num);
                } else {
                    Integer top = priorityQueue.peek();
                    if (top < num) {
                        priorityQueue.poll();
                        priorityQueue.add(num);
                    }
                }
            }
        }
    }

    public int add(int val) {
        if (priorityQueue.size() < k) {
            priorityQueue.add(val);
        } else {
            Integer top = priorityQueue.peek();
            if (top < val) {
                priorityQueue.poll();
                priorityQueue.add(val);
            }
        }
        System.out.println(priorityQueue.peek());
        return priorityQueue.peek();
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1(3, new int[] { 4, 5, 8, 2 });
        solution1.add(3); // returns 4
        solution1.add(5); // returns 5
        solution1.add(10); // returns 5
        solution1.add(9); // returns 8
        solution1.add(4); // returns 8

    }
}
