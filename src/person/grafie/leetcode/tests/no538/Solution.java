/*
 * @projectName leetcodetests
 * @package person.grafie.leetcode.tests.no538
 * @className person.grafie.leetcode.tests.no538.Solution
 * @copyright Copyright 2020 www.grafie.cn, All rights reserved.
 */
package person.grafie.leetcode.tests.no538;

import person.grafie.leetcode.tests.common.TreeNode;

/**
 *
 * @author grafie www.grafie.cn
 * @date 2020-05-06 11:17
 * @version 0.0.0.1
 * 想法
 *
 * 一个反序中序遍历的方法是通过递归实现。通过调用栈回到之前的节点，我们可以轻松地反序遍历所有节点。
 *
 * 算法
 *
 * 在递归方法中，我们维护一些递归调用过程中可以访问和修改的全局变量。首先我们判断当前访问的节点是否存在，如果存在就递归右子树，递归回来的时候更新总和和当前点的值，然后递归左子树。如果我们分别正确地递归 root.right 和 root.left ，那么我们就能正确地用大于某个节点的值去更新此节点，然后才遍历比它小的值。
 *
 * 作者：LeetCode
 * 链接：https://leetcode-cn.com/problems/convert-bst-to-greater-tree/solution/ba-er-cha-sou-suo-shu-zhuan-huan-wei-lei-jia-shu-3/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 *
 */
public class Solution {
    private int sum = 0;

    public TreeNode convertBST(TreeNode root) {
        if (root != null) {
            convertBST(root.right);
            sum += root.val;
            root.val = sum;
            convertBST(root.left);
        }
        return root;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode treeNode = new TreeNode(5);
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(13);
        treeNode.left = treeNode1;
        treeNode.right = treeNode2;
        solution.convertBST(treeNode);
    }
}
