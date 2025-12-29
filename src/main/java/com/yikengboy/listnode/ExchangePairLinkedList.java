/*
 * ExchangePairLinkedList.java
 * Copyright 2025 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package com.yikengboy.listnode;


/// 两两交换链表 [题干链接](https://leetcode.cn/problems/swap-nodes-in-pairs/description/)
public class ExchangePairLinkedList {

    public ListNode swapPairs(ListNode head) {
        ListNode header = new ListNode(-1);
        ListNode headerNext = new ListNode(0);
        header.next = headerNext;
        while (head != null) {
            ListNode next = new ListNode(head.next.val);
            ListNode nextNext = new ListNode(head.next.next.val);
            nextNext.next = next;
            headerNext.next = nextNext;

            headerNext = headerNext.next.next;
        }

        return header.next;
    }

}
