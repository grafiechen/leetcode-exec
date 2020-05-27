/*
 * @projectName leetcodetests
 * @package person.grafie.leetcode.tests.no283
 * @className person.grafie.leetcode.tests.no283.Solution
 * @copyright Copyright 2020 www.grafie.cn, All rights reserved.
 */
package person.grafie.leetcode.tests.no283;

/**
 *
 * @author grafie www.grafie.cn
 * @date 2020-05-06 11:44
 * @version 0.0.0.1
 */
public class Solution {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i > j) {
                    nums[j] = nums[i];
                    nums[i] = 0;
                }
                j++;
            }
        }
    }
}
