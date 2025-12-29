/*
 * GetIntersectionNodeTest.java
 * Copyright 2025 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package com.yikengboy.listnode;

import junit.framework.TestCase;

/**
 * @author songke
 * @date 2025/12/29
 */
public class GetIntersectionNodeTest extends TestCase {

    public void test() {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2, one);
        ListNode three = new ListNode(3, two);
        ListNode four = new ListNode(4, three);

        ListNode listNode = new ListNode(5, two);

        new GetIntersectionNode().getIntersectionNode(four, listNode);
    }

}