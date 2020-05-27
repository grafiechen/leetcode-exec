/*
 * @projectName leetcodetests
 * @package person.grafie.leetcode.tests.no206
 * @className person.grafie.leetcode.tests.no206.Solution
 * @copyright Copyright 2020 www.grafie.cn, All rights reserved.
 */
package person.grafie.leetcode.tests.no206;

import person.grafie.leetcode.tests.common.ListNode;

/**
 *
 * @author grafie www.grafie.cn
 * @date 2020-04-30 16:16
 * @version 0.0.0.1
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
