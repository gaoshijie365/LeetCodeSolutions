package tech.gaoshijie.leetcode.p4;

import org.jetbrains.annotations.NotNull;

/**
 * 4. 寻找两个正序数组的中位数（https://leetcode-cn.com/problems/median-of-two-sorted-arrays/）
 * <p>
 * 给定两个大小为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的中位数。
 * <p>
 * <strong>进阶</strong>：你能设计一个时间复杂度为 <code>O(log(m+n))</code> 的算法解决此问题吗？
 * <p>
 * 示例 1：
 * <pre>
 *     输入：nums1 = [1,3], nums2 = [2]
 *     输出：2.00000
 *     解释：合并数组 = [1,2,3]，中位数 2
 * </pre>
 * <p>
 * 示例 2：
 * <pre>
 *     输入：nums1 = [1,2], nums2 = [3,4]
 *     输出：2.50000
 *     解释：合并数组 = [1,2,3,4]，中位数 (2 + 3) / 2 = 2.5
 * </pre>
 * <p>
 * 示例 3：
 * <pre>
 *     输入：nums1 = [0,0], nums2 = [0,0]
 *     输出：0.00000
 * </pre>
 * <p>
 * 示例 4：
 * <pre>
 *     输入：nums1 = [], nums2 = [1]
 *     输出：1.00000
 * </pre>
 * <p>
 * 示例 5：
 * <pre>
 *     输入：nums1 = [2], nums2 = []
 *     输出：2.00000
 * </pre>
 * <p>
 * 提示：
 * <ul>
 *     <li>nums1.length == m</li>
 *     <li>nums2.length == n</li>
 *     <li>0 <= m <= 1000</li>
 *     <li>0 <= n <= 1000</li>
 *     <li>1 <= m + n <= 2000</li>
 *     <li>-10<sup>6</sup> <= nums1[i], nums2[i] <= 10<sup>6</sup></li>
 * </ul>
 *
 * @author gaoshijie
 */
public interface MedianOfTwoSortedArrays {
    double findMedianSortedArrays(@NotNull int[] nums1, @NotNull int[] nums2);
}
