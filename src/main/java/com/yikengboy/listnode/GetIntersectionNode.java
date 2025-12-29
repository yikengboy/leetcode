/*
 * GetIntersectionNode.java
 * Copyright 2025 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package com.yikengboy.listnode;

///  链表相交 [题干链接](https://leetcode.cn/problems/intersection-of-two-linked-lists-lcci/description/)
public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        int sizeA = getLength(headA);
        int sizeB = getLength(headB);
        int count = Math.min(sizeA, sizeB);

        ListNode curA = sizeA > count ? substract(headA, sizeA - count) : headA;
        ListNode curB = sizeB > count ? substract(headB, sizeB - count) : headB;
        for (int i = 0; i < count; i++) {
            if (curA == curB) {
                return curA;
            }
            curA = curA.next;
            curB = curB.next;
        }
        return null;
    }

    public int getLength(ListNode node) {
        int size = 0;
        ListNode sizeANode = node;
        while (sizeANode != null) {
            size++;
            sizeANode = sizeANode.next;
        }
        return size;
    }

    public ListNode substract(ListNode node, int count) {
        for (int i = 1; i <= count; i++) {
            node = node.next;
        }
        return node;
    }
}
