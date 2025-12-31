/*
 * CommonChars.java
 * Copyright 2025 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package com.yikengboy.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/// 查找共用字符 [题干链接](https://leetcode.cn/problems/find-common-characters/description/)
/// 示例 1：
///
/// 输入：words = ["bella","label","roller"]
/// 输出：["e","l","l"]
/// 示例 2：
///
/// 输入：words = ["cool","lock","cook"]
/// 输出：["c","o"]
public class CommonChars {

    public List<String> commonChars(String[] words) {
        int[] num = new int[23];
        String oneWord = words[0];
        List<String> result = new ArrayList<>();
        for (int i = 0; i < oneWord.length(); i++) {
            char c = oneWord.charAt(i);
            boolean flag = true;
            for (int j = 1; j < words.length; j++) {
                if (!words[j].contains(String.valueOf(c))) {
                    flag = false;
                    break;
                }
                words[j] = words[j].replaceFirst(String.valueOf(c), "");
            }
            if (flag) {
                result.add(String.valueOf(c));
            }
        }
        return result;
    }
}
