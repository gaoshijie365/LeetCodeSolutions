package tech.gaoshijie.leetcode.p1;

/**
 * 双重循环实现。
 * <ul>
 * <li>时间复杂度：O(n<sup>2</sup>)</li>
 * <li>空间复杂度：O(1)</li>
 * </ul>
 *
 * @author gaoshijie
 */
public class DoubleLoopSolution implements TwoSum {
    @Override
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}
