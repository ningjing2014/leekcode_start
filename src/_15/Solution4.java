package _15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author lining
 * @date 18-11-19
 */
public class Solution4 {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) {
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        List<List<Integer>> result = new LinkedList<>();

        for (int i = 0; i < nums.length - 1;) {
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
                    result.add(list);
                    j++;
                    // 从左向右找第一个与之前处理的数不同的数的下标
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                    k--;
                    // 从右向左找第一个与之前处理的数不同的数的下标
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                } else if (ni + nj + nk > 0) {
                    k--;
                    // 从右向左找第一个与之前处理的数不同的数的下标
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                } else {
                    j++;
                    // 从左向右找第一个与之前处理的数不同的数的下标
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                }
            }

            i++;
            // 从左向右找第一个与之前处理的数不同的数的下标
            while (i < nums.length - 1 && nums[i] == nums[i - 1]) {
                i++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution4 solution = new Solution4();
        int[] arr = new int[] { -1, 0, 1, 2, -1, -4, 0, 0 };
        List<List<Integer>> list = solution.threeSum(arr);
        System.out.println(list);
    }
}
