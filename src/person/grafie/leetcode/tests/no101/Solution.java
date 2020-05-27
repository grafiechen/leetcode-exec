/*
 * @projectName leetcodetests
 * @package person.grafie.leetcode.tests.no101
 * @className person.grafie.leetcode.tests.no101.Solution
 * @copyright Copyright 2020 www.grafie.cn, All rights reserved.
 */
package person.grafie.leetcode.tests.no101;

import person.grafie.leetcode.tests.common.TreeNode;

/**
 *
 * @author grafie www.grafie.cn
 * @date 2020-05-06 16:34
 * @version 0.0.0.1
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null){
            return true;
        }
        return isSymmetric(root.right,root.left);
    }

    private boolean isSymmetric(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null){
            return true;
        }
        if (node1 == null || node2 == null){
            return  false;
        }
        return (node1.val == node2.val) && (isSymmetric(node1.left,node2.right)) && (isSymmetric(node1.right,node2.left));
    }
}
