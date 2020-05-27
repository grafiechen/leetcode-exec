/*
 * @projectName leetcodetests
 * @package person.grafie.leetcode.tests.no169
 * @className person.grafie.leetcode.tests.no169.Solution
 * @copyright Copyright 2020 www.grafie.cn, All rights reserved.
 */
package person.grafie.leetcode.tests.no169;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author grafie www.grafie.cn
 * @date 2020-05-06 10:49
 * @version 0.0.0.1
 */
public class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int mid = nums.length / 2;
        for (int i : nums) {
            int num = map.getOrDefault(i, 0);
            if (num >= mid) {
                return i;
            }
            num += 1;
            map.put(i, num);
        }
        return 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] i = { 3, 2, 3 };
        solution.majorityElement(i);
    }

    public int sulotion(int[] args) {
        int candidate = args[0], count = 1;
        for (int i : args) {
            if (candidate == i) {
                count++;
            } else if (count - 1 == 0) {
                candidate = i;
            } else {
                count--;
            }
        }
        return candidate;
    }
}
