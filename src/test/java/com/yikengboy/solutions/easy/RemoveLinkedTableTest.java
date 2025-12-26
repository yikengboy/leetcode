/*
 * RemoveLinkedTableTest.java
 * Copyright 2025 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package com.yikengboy.solutions.easy;

import org.junit.Test;

/**
 * @author songke
 * @date 2025/12/25
 */
public class RemoveLinkedTableTest {

    RemoveLinkedTable solution = new RemoveLinkedTable();

    @Test
    public void test() {
        RemoveLinkedTable.ListNode threeNode = new RemoveLinkedTable.ListNode(3, null);
        RemoveLinkedTable.ListNode twoNode = new RemoveLinkedTable.ListNode(2, threeNode);
        RemoveLinkedTable.ListNode oneNode = new RemoveLinkedTable.ListNode(1, twoNode);
        RemoveLinkedTable.ListNode listNode = solution.removeElements(oneNode, 1);
    }
}
