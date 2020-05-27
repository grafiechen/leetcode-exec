/*
 * @projectName leetcodetests
 * @package person.grafie.leetcode.tests.no617
 * @className person.grafie.leetcode.tests.no617.Solution
 * @copyright Copyright 2020 www.grafie.cn, All rights reserved.
 */
package person.grafie.leetcode.tests.no617;

import person.grafie.leetcode.tests.common.TreeNode;

/**
 *
 * @author grafie www.grafie.cn
 * @date 2020-04-30 14:26
 * @version 0.0.0.1
 */
public class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return null;
        }
        if (t1 == null && t2 != null) {
            return t2;
        }
        if (t1 != null && t2 == null) {
            return t1;
        }
        t1.val += t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
    }
}
