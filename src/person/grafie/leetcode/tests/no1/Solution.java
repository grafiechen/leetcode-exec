/*
 * @projectName leetcodetests
 * @package person.grafie.leetcode.tests.no1
 * @className person.grafie.leetcode.tests.no1.Solution
 * @copyright Copyright 2020 www.grafie.cn, All rights reserved.
 */
package person.grafie.leetcode.tests.no1;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author grafie www.grafie.cn
 * @date 2020-05-06 17:22
 * @version 0.0.0.1
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            int b = target - nums[i];
            if(map.containsKey(b)) {
                return new int[]{map.get(b), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }
}
