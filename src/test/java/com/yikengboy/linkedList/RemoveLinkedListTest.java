/*
 * RemoveLinkedListTest.java
 * Copyright 2025 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package com.yikengboy.linkedList;

import junit.framework.TestCase;

/**
 * @author songke
 * @date 2025/12/26
 */
public class RemoveLinkedListTest extends TestCase {

    public void test() {
        ListNode threeNode = new ListNode(3, null);
        ListNode twoNode = new ListNode(2, threeNode);
        ListNode oneNode = new ListNode(1, twoNode);

        RemoveLinkedList removeLinkedList = new RemoveLinkedList();
        System.out.println(removeLinkedList.removeElements(oneNode, 2));
    }

}