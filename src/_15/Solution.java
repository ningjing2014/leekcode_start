package _15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author lining
 * @date 18-11-19 暴利破解法
 */
public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) {
            return null;
        }

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (sum == 0) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);

                        Collections.sort(list);
                        if (!result.contains(list)) {
                            result.add(list);
                        }

                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = new int[] { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> list = solution.threeSum(arr);
        System.out.println(list);
    }
}
