package com.shua.TwoSum;

/**
 * @author lining
 * @date 18-10-11
 */
public class ThreeSum implements INumberSum {

    @Override
    public int[] numSum(int[] array, int target) {
        if (array.length < 3) {
            return null;
        }
        for (int i = 0; i < array.length; i++) {
            int before = array[i];
            if (before >= target) {
                continue;
            }
            for (int j = i + 1; j < array.length; j++) {
                int after = array[j];
                if (before + after >= target) {
                    continue;
                }
                for (int k = j + 1; k < array.length; k++) {
                    int current = array[k];
                    if (before + after + current == target) {
                        return new int[] { i, j, k };
                    }
                }
            }

        }

        return null;
    }

    public static void main(String[] args) {
        ThreeSum s = new ThreeSum();
        int[] array = new int[] { 11, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] arr = s.numSum(array, 11);
        s.printArray(arr);
    }

}
