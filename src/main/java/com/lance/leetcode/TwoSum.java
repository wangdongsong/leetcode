package com.lance.leetcode;

import java.util.Arrays;

/**
 * 两数之和
 *
 *
 */
public class TwoSum {

    public static void main(String[] args) {

        int nums[] = {1, 7, 8, 15};
        int target = 9;

        TwoSum ts = new TwoSum();
        int results[] = ts.twoSum(nums, target);
        if(results != null && results.length == 2){
            System.out.printf("%d, %d", results[0], results[1]);
        }else {
            System.out.println("Nothing");
        }

    }

    /**执行结果：
     * 通过
     * 显示详情
     * 执行用时 :    17 ms , 在所有 Java 提交中击败了57.37%的用户
     * 内存消耗 :   36.8 MB, 在所有 Java 提交中击败了93.82%的用户
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target){
        int source;
        for(int i = 0; i < nums.length; i++){
            source = target - nums[i];
            for(int j = i + 1; j < nums.length; j++){
                if (source == nums[j]){
                    return new int[]{i, j};
                }
            }
        }

        return null;
    }
}
