package com.sample;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：panleilei
 * @description 两数之和
 * @modified By：
 * @version:
 * @date ：Created in 2023/9/12 19:57
 */
public class TwoSum {
    /**
     * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那 两个 整数，并返回它们的数组下标。
     * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
     * 你可以按任意顺序返回答案。
     *
     * 示例 1：
     *
     * 输入：nums = [2,7,11,15], target = 9
     * 输出：[0,1]
     * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
     * @param args
     */
    public static void main(String[] args) {
        // 1.定义数组
        int[] nums = {2,11,7,15};
        // 2.定义目标值
        int target = 9;
        // 3.调用方法
        int[] result = twoSum(nums,target);
        System.out.println(result[0] + "," + result[1]);
        result = twoSum2(nums,target);
        System.out.println(result[0] + "," + result[1]);
    }

    /**
     * 哈希表的方式，时间复杂度O(n)
     * @param nums
     * @param target
     * @return
     */
    private static int[] twoSum2(int[] nums, int target) {
        int len = nums.length;
        // 哈希表
        Map<Integer,Integer> hashmap = new HashMap<>(len -1);
        hashmap.put(nums[0],0);
        for (int i = 1; i < len; i++) {
            if (hashmap.containsKey(target - nums[i])) {
                return new int[]{hashmap.get(target - nums[i]),i};
            }
            hashmap.put(nums[i],i);
        }
        return new int[0];
    }

    /**
     * 暴力模式，时间复杂度O(n^2)
     * @param nums
     * @param target
     * @return
     */
    private static int[] twoSum(int[] nums, int target) {
        // 1.定义一个数组，用来存放结果
        int[] result = new int[2];
        // 2.定义一个循环，遍历数组
        for (int i = 0; i < nums.length; i++) {
            // 3.定义一个循环，遍历数组
            for (int j = i+1; j < nums.length; j++) {
                // 4.判断两个数之和是否等于目标值
                if (nums[i] + nums[j] == target) {
                    // 5.如果等于目标值，将两个数的下标存放到数组中
                    result[0] = i;
                    result[1] = j;
                    // 6.返回结果
                    return result;
                }
            }
        }
        return new int[0];
    }


}



















