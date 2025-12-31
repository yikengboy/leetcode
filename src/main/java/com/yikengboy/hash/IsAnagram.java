/*
 * IsAnagram.java
 * Copyright 2025 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package com.yikengboy.hash;

import java.util.HashMap;
import java.util.Map;

///  有效的字母异位词 [题干链接](https://leetcode.cn/problems/valid-anagram/description/)
public class IsAnagram {

    // 暴力法
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();


        for (int i = 0; i < s.length(); i++) {
            sMap.put(s.charAt(i), sMap.computeIfAbsent(s.charAt(i), k -> 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            tMap.put(t.charAt(i), tMap.computeIfAbsent(t.charAt(i), k -> 0) + 1);
        }

        int sSize = sMap.size();

        for (Map.Entry<Character, Integer> characterIntegerEntry : sMap.entrySet()) {
            if (!characterIntegerEntry.getValue().equals(tMap.get(characterIntegerEntry.getKey()))) {
                return false;
            }
            {
                tMap.remove(characterIntegerEntry.getKey());
            }
        }

        return tMap.isEmpty();
    }


    public boolean isAnagramV2(String s, String t) {
        Map<Character, Integer> tMap = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            tMap.put(t.charAt(i), tMap.computeIfAbsent(t.charAt(i), k -> 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (!tMap.containsKey(s.charAt(i))) {
                return false;
            }
            Integer count = tMap.get(s.charAt(i));
            if (count == 0) {
                return false;
            }
            if (count == 1) {
                tMap.remove(s.charAt(i));
            } else {
                tMap.put(s.charAt(i), count - 1);
            }
        }
        return tMap.isEmpty();
    }
}
