package com.bxc.code;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class TwoSum_001 {
    /**
     * 暴力法(双for循环 时间复杂度 O(n²))
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum01(int[] nums, int target) {
        int[] array = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    array[0] = i;
                    array[1] = j;
                }
            }
        }
        return array;
    }

    /**
     * HashMap方法(时间复杂度 O(n) 推荐使用)
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum02(int nums[], int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

    @Test
    public void aaa() {
        int[] ints = twoSum02(new int[]{3, 2, 4}, 6);
        System.out.println(ints[0] + "," + ints[1]);
    }

}
