/*
 * IntersectionTest.java
 * Copyright 2025 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package com.yikengboy.hash;

import junit.framework.TestCase;

/**
 * @author songke
 * @date 2025/12/31
 */
public class IntersectionTest extends TestCase {

    public void test() {

        new Intersection().intersection(new int[]{7,2,2,4,7,0,3,4,5}, new int[]{3,9,8,6,1,9});
    }

}