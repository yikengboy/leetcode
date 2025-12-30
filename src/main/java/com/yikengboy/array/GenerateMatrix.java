/*
 * GenerateMatrix.java
 * Copyright 2025 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package com.yikengboy.array;

///  螺旋矩阵 [题干链接](https://leetcode.cn/problems/spiral-matrix-ii/)
public class GenerateMatrix {

    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int top = 0,
                right = n - 1,
                button = n - 1,
                left = 0,
                value = 1;

        while (value <= n * n) {
            for (int i = left; i <= right ; i++) {
                result[top][i] = value++;
            }
            top++;
            for (int i = top; i <= button ; i++) {
                result[i][right] = value++;
            }
            right--;
            for (int i = right; i >= left ; i--) {
                result[button][i] = value++;
            }
            button--;
            for (int i = button; i >= top ; i--) {
                result[i][left] = value++;
            }
            left++;
        }
        return result;
    }
}
