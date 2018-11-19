package _15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author lining
 * @date 18-11-19
 */
public class Solution3 {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) {
            return null;
        }
        Arrays.sort(nums);
        List<List<Integer>> result = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int ni = nums[i];
                int nj = nums[j];
                int nk = nums[k];
                if (ni + nj + nk == 0) {
                    List<Integer> list = new ArrayList<>(3);
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);

                    Collections.sort(list);
                    if (!result.contains(list)) {
                        result.add(list);
                    }
                    k--;
                    j++;
                } else if (ni + nj + nk > 0) {
                    k--;
                } else {
                    j++;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution3 solution = new Solution3();
        int[] arr = new int[] { -1, 0, 1, 2, -1, -4, 0, 0 };
        List<List<Integer>> list = solution.threeSum(arr);
        System.out.println(list);
    }
}
