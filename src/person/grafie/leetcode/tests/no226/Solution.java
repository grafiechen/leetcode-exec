/*
 * @projectName leetcodetests
 * @package person.grafie.leetcode.tests.no226
 * @className person.grafie.leetcode.tests.no226.Solution
 * @copyright Copyright 2020 www.grafie.cn, All rights reserved.
 */
package person.grafie.leetcode.tests.no226;

import person.grafie.leetcode.tests.common.TreeNode;

/**
 *
 * @author grafie www.grafie.cn
 * @date 2020-04-30 15:42
 * @version 0.0.0.1
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        if (root.left != null || root.right != null) {
            TreeNode treeNode = root.left;
            root.left = root.right;
            root.right = treeNode;
            root.left = invertTree(root.left);
            root.right = invertTree(root.right);
        }
        return root;
    }
}
