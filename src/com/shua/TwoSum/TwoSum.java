package com.shua.TwoSum;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lining
 * @date 18-10-11
 */
public class TwoSum implements INumberSum {

    @Override
    public int[] numSum(int[] array, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        if (array.length < 2) {
            return null;
        }
        for (int i = 0; i < array.length; i++) {
            int current = array[i];

            int dif = target - current;

            Integer val = map.get(dif);
            if (val == null) {
                map.put(current, i);
            } else {
                return new int[] { i, val };
            }

        }
        return null;
    }

    public static void main(String[] args) {
        TwoSum s = new TwoSum();
        int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] arr = s.numSum(array, 11);
        s.printArray(arr);
    }

}
