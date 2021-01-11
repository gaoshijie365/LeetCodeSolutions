package tech.gaoshijie.leetcode.p7;

/**
 * 7. 整数反转（https://leetcode-cn.com/problems/reverse-integer/）
 * <p>
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * <p><p>
 * 注意：
 * <ul>
 *     <li>假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [-1<sup>31</sup>, 2<sup>31</sup>-1] 。
 *     请根据这个假设，如果反转后整数溢出那么就返回 0。</li>
 * </ul>
 * <p>
 * 示例 1：
 * <pre>
 *     输入：x = 123
 *     输出：321
 * </pre>
 * <p>
 * 示例 2：
 * <pre>
 *     输入：x = -123
 *     输出：-321
 * </pre>
 * <p>
 * 示例 3：
 * <pre>
 *     输入：x = 120
 *     输出：21
 * </pre>
 * <p>
 * 示例 4：
 * <pre>
 *     输入：x = 0
 *     输出：0
 * </pre>
 * <p>
 * 提示：
 * <ul>
 *     <li>-2<sup>31</sup> <= x <= 2<sup>31</sup> - 1</li>
 * </ul>
 *
 * @author gaoshijie
 */
public interface ReverseInteger {
    int reverse(int x);
}
