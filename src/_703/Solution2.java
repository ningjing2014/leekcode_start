package _703;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author lining
 * @date 18-11-20 PriorityQueue 默认排序实现
 */
public class Solution2 {
    List<Integer> list;
    int k;

    public Solution2(int k, int[] nums) {
        this.k = k;
        list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        Collections.sort(list);
    }

    public int add(int val) {
        list.add(val);
        Collections.sort(list);
        Integer rcd = list.get(list.size() - k);
        System.out.println(rcd);
        return rcd;
    }

    public static void main(String[] args) {
        Solution2 solution1 = new Solution2(3, new int[] { 4, 5, 8, 2 });
        solution1.add(3); // returns 4
        solution1.add(5); // returns 5
        solution1.add(10); // returns 5
        solution1.add(9); // returns 8
        solution1.add(4); // returns 8

    }
}
