/*
 * @projectName leetcodetests
 * @package person.grafie.leetcode.tests.no53
 * @className person.grafie.leetcode.tests.no53.Solution
 * @copyright Copyright 2020 www.grafie.cn, All rights reserved.
 */
package person.grafie.leetcode.tests.no53;

/**
 *
 * @author grafie www.grafie.cn
 * @date 2020-05-06 16:23
 * @version 0.0.0.1
 */
public class Solution {
//    O(n)
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = 0;
        for (int i : nums){
            if (sum > 0){
                sum += i;
            }else{
                sum = i;
            }
            max = Math.max(max,sum);
        }
        return max;
    }

}
