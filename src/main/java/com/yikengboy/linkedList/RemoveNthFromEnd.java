/*
 * DeleteNNode.java
 * Copyright 2025 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package com.yikengboy.linkedList;

/// 删除链表倒数第 N 个节点 [题干链接](https://leetcode.cn/problems/remove-nth-node-from-end-of-list/description/)
public class RemoveNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int size = 0;
        while (head != null) {
            size++;
            head = head.next;
        }

        if (size == 1 && n == 1) {
            return null;
        }

        ListNode header = new ListNode(-1);
        header.next = temp;
        ListNode cur = header;
        int index = size - n + 1;
        int count = 1;
        while (cur != null) {
            if (count == index) {
                cur.next = cur.next.next;
                break;
            } else {
                count++;
            }
            cur = cur.next;
        }
        return header.next;
    }
}
