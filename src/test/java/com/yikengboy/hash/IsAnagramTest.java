/*
 * IsAnagramTest.java
 * Copyright 2025 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package com.yikengboy.hash;

import junit.framework.TestCase;

/**
 * @author songke
 * @date 2025/12/31
 */
public class IsAnagramTest extends TestCase {

    public void test() {
        IsAnagram isAnagram = new IsAnagram();
        boolean anagram = isAnagram.isAnagramV2("rat", "car");
        System.out.println(anagram);
    }

}