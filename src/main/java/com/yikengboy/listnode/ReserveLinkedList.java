/*
 * ReserveLinkedList.java
 * Copyright 2025 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package com.yikengboy.listnode;

/// 反转链表 [题干链接](https://leetcode.cn/problems/reverse-linked-list/description/)
public class ReserveLinkedList {

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode header = new ListNode(-1);
        header.next = head;
        ListNode cur = header;
        while (cur.next != null && cur.next.next != null) {
            ListNode rest = cur.next.next.next;
            cur.next.next.next = null;
            ListNode next = cur.next;
            ListNode next2 = cur.next.next;
            next.next = rest;
            next2.next = next;



            cur = cur.next.next;
        }

        return header.next;
    }

}
