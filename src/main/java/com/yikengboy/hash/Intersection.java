/*
 * Intersection.java
 * Copyright 2025 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package com.yikengboy.hash;

import java.util.Arrays;

/// 两个数组的交集 [题干链接](https://leetcode.cn/problems/intersection-of-two-arrays/)
/// 示例 1：
///
/// 输入：nums1 = [1,2,2,1], nums2 = [2,2]
/// 输出：[2]
/// 示例 2：
///
/// 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
/// 输出：[9,4]
/// 解释：[4,9] 也是可通过的
public class Intersection {

    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] result = new int[Math.max(nums1.length, nums2.length)];
        int i = 0, j = 0, index = 0, pre = Integer.MIN_VALUE;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                if (nums1[i] != pre) {
                    result[index++] = nums1[i];
                    pre = nums1[i];
                }
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            }
        }
        return Arrays.copyOfRange(result, 0, index);
    }

}
