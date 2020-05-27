/*
 * @projectName leetcodetests
 * @package person.grafie.leetcode.tests.no104
 * @className person.grafie.leetcode.tests.no104.Solution
 * @copyright Copyright 2020 www.grafie.cn, All rights reserved.
 */
package person.grafie.leetcode.tests.no104;

import person.grafie.leetcode.tests.common.TreeNode;

/**
 *
 * @author grafie www.grafie.cn
 * @date 2020-04-30 15:47
 * @version 0.0.0.1
 */
public class Solution {
    private int indexdepth_left = 1;
    private int indexdepth_right = 1;
    private int maxDepth = 0;
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        int index = getdepth(root.right, 1);
        int index2 = getdepth(root.left, 1);
        if (index >= index2 && index > maxDepth) {
            return index;
        }
        if (index2 >= index && index2 > maxDepth) {
            return index2;
        }
        return maxDepth;
    }

    private int getdepth(TreeNode treeNode, int index) {
        if (treeNode == null) {
            return index;
        }
        if (treeNode.right == null && treeNode.left == null) {
            return index + 1;
        }
        if (treeNode.left != null) {
            indexdepth_left = getdepth(treeNode.left, index + 1);
        }
        if (treeNode.right != null) {
            indexdepth_right = getdepth(treeNode.right, index + 1);
        }
        indexdepth_left = indexdepth_left >= indexdepth_right ? indexdepth_left:indexdepth_right;
        if (indexdepth_left > maxDepth) {
            maxDepth = indexdepth_left;
        }
        return indexdepth_left;
    }

    public int solution(TreeNode root){
        if (root == null){
            return 0;
        }
        if (root.left ==null && root.right == null){
            return 1;
        }
        return Math.max(solution(root.left)+1,solution(root.right)+1);
    }
}
