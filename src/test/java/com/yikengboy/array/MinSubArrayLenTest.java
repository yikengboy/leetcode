/*
 * MinSubArrayLenTest.java
 * Copyright 2025 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package com.yikengboy.array;

import junit.framework.TestCase;

/**
 * @author songke
 * @date 2025/12/30
 */
public class MinSubArrayLenTest extends TestCase {

    public void test() {
        int[] nums = {1,4,4};
        int target = 4;
        int i = new MinSubArrayLen().minSubArrayLen(target, nums);
        assertEquals(1, i);
    }

}