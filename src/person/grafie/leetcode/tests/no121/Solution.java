/*
 * @projectName leetcodetests
 * @package person.grafie.leetcode.tests.no121
 * @className person.grafie.leetcode.tests.no121.Solution
 * @copyright Copyright 2020 www.grafie.cn, All rights reserved.
 */
package person.grafie.leetcode.tests.no121;

/**
 *
 * @author grafie www.grafie.cn
 * @date 2020-05-06 14:47
 * @version 0.0.0.1
 */
public class Solution {
    public int maxProfit(int[] prices) {
//        if (prices == null) {
//            return 0;
//        }
//        int money = 0;
//        for (int i = 0; i < prices.length; i++) {
//            for (int j = i; j < prices.length; j++) {
//                int num = (prices[i] - prices[j]) * -1;
//                if (num > 0 && num > money) {
//                    money = num;
//                }
//            }
//        }
//        return money;
        int res = 0;
        int minBuy = Integer.MAX_VALUE;
        for (int i =0; i< prices.length; i++){
            if (prices[i]< minBuy){
                minBuy = prices[i];
            }
            if (prices[i] > res){
                res = Math.max(res,prices[i] - minBuy);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] i = {1,2};
        Solution solution = new Solution();
        solution.maxProfit(i);
    }
}
