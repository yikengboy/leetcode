/*
 * DetectCycle2.java
 * Copyright 2025 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package com.yikengboy.listnode;

import java.util.ArrayList;
import java.util.List;

///  环形链表2 [题干链接](https://leetcode.cn/problems/linked-list-cycle-ii/)
public class DetectCycle2 {

    public ListNode detectCycle(ListNode head) {
        ListNode cur = head;
        if (cur == null) {
            return head;
        }
        List<ListNode> container = new ArrayList<>();
        while (cur != null) {
            if (container.contains(cur.next)) {
                return cur.next;
            } else {
                container.add(cur);
            }
            cur = cur.next;
        }
        return null;
    }
}
