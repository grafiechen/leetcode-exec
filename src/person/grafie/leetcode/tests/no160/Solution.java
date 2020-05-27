/*
 * @projectName leetcodetests
 * @package person.grafie.leetcode.tests.no160
 * @className person.grafie.leetcode.tests.no160.Solution
 * @copyright Copyright 2020 www.grafie.cn, All rights reserved.
 */
package person.grafie.leetcode.tests.no160;

import person.grafie.leetcode.tests.common.ListNode;

/**
 *
 * @author grafie www.grafie.cn
 * @date 2020-05-06 14:24
 * @version 0.0.0.1
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode pa = headA, pb = headB;
        //        双指针互追，最后会走到一起
        while (pa != pb) {
            pa = pa == null ? headB : pa.next;
            pb = pb == null ? headA : pb.next;
        }
        return pa;
    }
}
