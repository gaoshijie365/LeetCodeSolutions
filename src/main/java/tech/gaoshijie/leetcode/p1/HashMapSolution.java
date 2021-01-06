package tech.gaoshijie.leetcode.p1;

import java.util.HashMap;

/**
 * HashMap 实现。原理：通过一次遍历，每遍历一个元素，判断其是否在 HashMap 中存在，若存在，即找到结果；
 * 若不存在，将 target - num[i] 的值存入 HashMap 中。
 * <p>
 * 这里面利用到了 HashMap 的快速查找特性。但同时也带来了另一个问题，即拆装箱问题。
 *
 * @author gaoshijie
 */
public class HashMapSolution implements TwoSum {
    @Override
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            } else {
                map.put(target - nums[i], i);
            }
        }
        return new int[0];
    }
}
