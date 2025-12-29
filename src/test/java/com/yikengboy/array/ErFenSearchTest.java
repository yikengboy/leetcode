/*
 * ErFenSearchTest.java
 * Copyright 2025 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package com.yikengboy.array;

import junit.framework.TestCase;

/**
 * @author songke
 * @date 2025/12/29
 */
public class ErFenSearchTest extends TestCase {


    public void testErFenSearch() {
        int[] arr = {1, 5};
        int index = new ErFenSearch().search(arr, 1);
        assertEquals(0, index);
    }

}