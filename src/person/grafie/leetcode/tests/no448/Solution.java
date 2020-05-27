/*
 * @projectName leetcodetests
 * @package person.grafie.leetcode.tests.no448
 * @className person.grafie.leetcode.tests.no448.Solution
 * @copyright Copyright 2020 www.grafie.cn, All rights reserved.
 */
package person.grafie.leetcode.tests.no448;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author grafie www.grafie.cn
 * @date 2020-05-06 13:46
 * @version 0.0.0.1
 */
public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
//       将能找到的下标都设置成负数
        for (int i = 0; i < nums.length; i++) {
            int newindex = Math.abs(nums[i]) - 1;
            if (nums[newindex] > 0) {
                nums[newindex] *= -1;
            }
        }
//       如果i-1拿到的值不是负的，则说明上一步操作过程中，没有遍历到，那么i就是要找的
        List<Integer> list = new LinkedList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (nums[i - 1] > 0) {
                list.add(i);
            }
        }
        return list;
    }
}
