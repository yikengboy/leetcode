/*
 * SortedSquares.java
 * Copyright 2025 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package com.yikengboy.array;

import java.util.Arrays;
import java.util.Scanner;

/// 有序数组的平方 [题干链接](https://leetcode.cn/problems/squares-of-a-sorted-array/description/)
public class SortedSquares {


    // 暴力解法
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        Arrays.sort(nums);
        return nums;
    }

    // 双指针
    public int[] sortedSquares2(int[] nums) {

        int[] result = new int[nums.length];
        int index = nums.length - 1;
        for (int i = 0, j = nums.length - 1; i <= j; ) {
            if (nums[i] * nums[i] > nums[j] * nums[j]) {
                result[index] = nums[i] * nums[i];
                i++;
            } else {
                result[index] = nums[j] * nums[j];
                j--;
            }
            index--;
        }
        return result;
    }
}
