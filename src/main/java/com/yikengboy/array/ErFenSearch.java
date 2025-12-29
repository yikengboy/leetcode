/*
 * ErFenSearch.java
 * Copyright 2025 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package com.yikengboy.array;

///  二分查找 [题干链接](https://leetcode.cn/problems/binary-search/)
public class ErFenSearch {

    public int search(int[] nums, int target) {
        int length = nums.length;
        if (length == 1 && nums[0] == target) {
            return 0;
        }
        int left = 0;
        int right = length - 1;
        while (left <= right) {
            int middle = (right - left) / 2 + left;
            int value = nums[middle];
            if (value == target) {
                return middle;
            } else if (value > target)  {
               right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }
}
