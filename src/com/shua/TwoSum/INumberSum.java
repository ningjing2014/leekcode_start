package com.shua.TwoSum;

/**
 * @author lining
 * @date 18-10-11
 */
public interface INumberSum {
    int[] numSum(int[] array, int target);

    default void printArray(int[] arr) {
        if (arr == null) {
            System.out.println("未找到");
        } else {
            for (int i = 0; i < arr.length; i++) {
                System.out.print((arr[i] + 1) + "  ");
            }
        }
    }
}
