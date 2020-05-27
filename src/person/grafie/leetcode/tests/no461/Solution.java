/*
 * @projectName leetcodetests
 * @package person.grafie.leetcode.tests.no461
 * @className person.grafie.leetcode.tests.no461.Solution
 * @copyright Copyright 2020 www.grafie.cn, All rights reserved.
 */
package person.grafie.leetcode.tests.no461;

/**
 *
 * @author grafie www.grafie.cn
 * @date 2020-04-30 14:33
 * @version 0.0.0.1
 */
public class Solution {
    public  int hammingDistance(int x, int y) {
        String binaryString_y = Integer.toBinaryString(y);
        String binaryString_x = Integer.toBinaryString(x);
        int length = binaryString_x.length() >= binaryString_y.length() ? binaryString_x.length() : binaryString_y.length();
        StringBuilder sb_x = new StringBuilder();
        appendNeed0(sb_x,length,binaryString_x);
        StringBuilder sb_y = new StringBuilder();
        appendNeed0(sb_y,length,binaryString_y);
        if (sb_x.length() == 0){
            sb_x.append(binaryString_x);
        }
        if (sb_y.length() == 0){
            sb_y.append(binaryString_y);
        }
        char[] binaryChar_x = sb_x.toString().toCharArray();
        char[] binaryChar_y = sb_y.toString().toCharArray();
        int hammingLength = 0;
        for (int i =0; i<length; i++){
            if (binaryChar_x[i] != binaryChar_y[i]){
                hammingLength +=1;
            }
        }
        return hammingLength;
    }
    private void appendNeed0(StringBuilder sb,int length,String binaryString){
        if (length > binaryString.length()){
            int y_need_length = length - binaryString.length();
            for (int i = 0; i<y_need_length; i++){
                sb.append('0');
            }
            for (char char_y : binaryString.toCharArray()){
                sb.append(char_y);
            }
        }
    }

    public static int solution2(int x, int y){
        int res = x ^ y;
        int cou = 0;
        while (res != 0) {
            if ((res & 1) == 1) {
                cou++;
            }
            res = res >> 1;
        }
        return cou;
    }

    public static void main(String[] args) {
        solution2(1,2);
    }
}
