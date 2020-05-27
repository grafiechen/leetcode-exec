/*
 * @projectName leetcodetests
 * @package person.grafie.leetcode.tests.no141
 * @className person.grafie.leetcode.tests.no141.Solution
 * @copyright Copyright 2020 www.grafie.cn, All rights reserved.
 */
package person.grafie.leetcode.tests.no141;

import person.grafie.leetcode.tests.common.ListNode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author grafie www.grafie.cn
 * @date 2020-05-06 17:30
 * @version 0.0.0.1
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null){
            return false;
        }
        Set<ListNode> listNodes = new HashSet<>();
        while (head != null){
            if (listNodes.contains(head)){
                return true;
            }else{
                listNodes.add(head);
                head = head.next;
            }
        }
        return false;
    }
}
