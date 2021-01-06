package tech.gaoshijie.leetcode.p1;

/**
 * 1. 两数之和（https://leetcode-cn.com/problems/two-sum/）
 * <p>
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 <strong>和为目标值</strong> 的那 <strong>两个</strong> 整数，
 * 并返回它们的数组下标。
 * <p>
 * 您可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * <p>
 * 你可以按任意顺序返回答案。
 * <p>
 * 示例 1：
 * <pre>
 *     输入：nums = [2,7,11,15], target = 9
 *     输出：[0,1]
 *     解释：因为 nums[0] + nums[1] == 9，返回 [0,1]。
 * </pre>
 * <p>
 * 示例 2：
 * <pre>
 *     输入：nums = [3,2,4], target = 6
 *     输出：[1,2]
 * </pre>
 * <p>
 * 示例 3：
 * <pre>
 *     输入：nums = [3,3], target = 6
 *     输出：[0,1]
 * </pre>
 * <p>
 * 提示：
 * <ul>
 *     <li>2 <= nums.length <= 10<sup>3</sup></li>
 *     <li>-10<sup>9</sup> <= nums[i] <= 10<sup>9</sup></li>
 *     <li>-10<sup>9</sup> <= target <= 10<sup>9</sup></li>
 *     <li>只会存在一个有效答案</li>
 * </ul>
 * <p>
 * 推论：由提示可知，对任意两个整数执行相加计算都不会溢出，所以放心地用 int 类型吧。
 *
 * @author gaoshijie
 */
public interface TwoSum {
    int[] twoSum(int[] nums, int target);
}
