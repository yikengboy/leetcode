/*
 * ReserveLinkedListTest.java
 * Copyright 2025 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package com.yikengboy.listnode;

import junit.framework.TestCase;

/**
 * @author songke
 * @date 2025/12/26
 */
public class ReserveLinkedListTest extends TestCase {


    public void test() {
        ReserveLinkedList reserveLinkedList = new ReserveLinkedList();

        ListNode fourNode = new ListNode(4, null);
        ListNode threeNode = new ListNode(3, fourNode);
        ListNode twoNode = new ListNode(2, threeNode);
        ListNode oneNode = new ListNode(1, twoNode);

        System.out.println(reserveLinkedList.reverseList(oneNode));

    }

}