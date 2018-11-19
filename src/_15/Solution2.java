package _15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * @author lining
 * @date 18-11-19 暴利破解法 优化版
 */
public class Solution2 {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) {
            return null;
        }
        // key 记录值，value记录值出现次数（话外音，有可能会有重复数字）
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer count = map.get(nums[i]);
            if (count != null) {
                map.put(nums[i], count + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                // 前两数之和
                int sum = nums[i] + nums[j];
                // 查下是否有相反的数字在map中
                Integer count = map.get(-sum);
                if (count == null) {
                    continue;
                }
                // 将map中第一个数和第二数用到的值进行相减
                if (nums[i] == -sum && map.containsKey(nums[i])) {
                    count--;
                }
                if (nums[i] == -sum && map.containsKey(nums[j])) {
                    count--;
                }

                if (count > 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(-sum);

                    Collections.sort(list);
                    if (!result.contains(list)) {
                        result.add(list);
                    }
                }
            }

        }
        return result;
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        int[] arr = new int[] { -1, 0, 1, 2, -1, -4, 0, 0 };
        List<List<Integer>> list = solution.threeSum(arr);
        System.out.println(list);
    }
}
