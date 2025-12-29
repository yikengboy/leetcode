/*
 * RemoveNthFromEndTest.java
 * Copyright 2025 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package com.yikengboy.listnode;

import junit.framework.TestCase;

/**
 * @author songke
 * @date 2025/12/29
 */
public class RemoveNthFromEndTest extends TestCase {

    public void test() {
        ListNode fiveNode = new ListNode(5, null);
        ListNode fourNode = new ListNode(4, fiveNode);
        ListNode threeNode = new ListNode(3, fourNode);
        ListNode twoNode = new ListNode(2, threeNode);
        ListNode oneNode = new ListNode(1, twoNode);

        new RemoveNthFromEnd().removeNthFromEnd(fiveNode, 1);
    }

}