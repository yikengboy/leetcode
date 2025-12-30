/*
 * MinSubArrayLen.java
 * Copyright 2025 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package com.yikengboy.array;

/// 长度最小的子数组 [长度最小的子数组](https://leetcode.cn/problems/minimum-size-subarray-sum/)
/// 示例 1：
///
/// 输入：target = 7, nums = [2,3,1,2,4,3]
/// 输出：2
/// 解释：子数组 [4,3] 是该条件下的长度最小的子数组。
/// 示例 2：
///
/// 输入：target = 4, nums = [1,4,4]
/// 输出：1
/// 示例 3：
///
/// 输入：target = 11, nums = [1,1,1,1,1,1,1,1]
/// 输出：0
public class MinSubArrayLen {

    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int result = Integer.MAX_VALUE;
        for (int right = 0; left <= right && right < nums.length; right++) {
            sum = sum + nums[right];
            while (sum >= target && left <= right) {
                sum = sum - nums[left];
                result = Math.min(result, right - left + 1);
                left++;
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
