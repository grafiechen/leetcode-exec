/*
 * @projectName leetcodetests
 * @package person.grafie.leetcode.tests.no136
 * @className person.grafie.leetcode.tests.no136.Solution
 * @copyright Copyright 2020 www.grafie.cn, All rights reserved.
 */
package person.grafie.leetcode.tests.no136;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author grafie www.grafie.cn
 * @date 2020-04-30 18:10
 * @version 0.0.0.1
 */
public class Solution {
    public int singleNumber(int[] nums){
        Map<Integer,Integer> numTimeMap = new HashMap<>();
        for (int i : nums){
            numTimeMap.put(i,numTimeMap.getOrDefault(i,0)+1);
        }
        for (Map.Entry<Integer,Integer> entry: numTimeMap.entrySet()){
            if (entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return 0;
    }
}
