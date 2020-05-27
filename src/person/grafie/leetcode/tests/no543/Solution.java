/*
 * @projectName leetcodetests
 * @package person.grafie.leetcode.tests.no543
 * @className person.grafie.leetcode.tests.no543.Solution
 * @copyright Copyright 2020 www.grafie.cn, All rights reserved.
 */
package person.grafie.leetcode.tests.no543;

import person.grafie.leetcode.tests.common.TreeNode;

/**
 *
 * @author grafie www.grafie.cn
 * @date 2020-05-06 17:02
 * @version 0.0.0.1
 */
public class Solution {
    private int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        getDia(root);
        return max;
    }

    private int getDia(TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        }
        int left = getDia(treeNode.left);
        int right = getDia(treeNode.right);
        max = Math.max(left + right, max);
        return Math.max(left, right) + 1;
    }
}
