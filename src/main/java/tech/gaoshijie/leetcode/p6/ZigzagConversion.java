package tech.gaoshijie.leetcode.p6;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Range;

/**
 * 6. Z 字形变换（https://leetcode-cn.com/problems/zigzag-conversion/）
 * <p>
 * 将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行 Z 字形排列。
 * <p>
 * 比如输入字符串为 "PAYPALISHIRING" 行数为 3 时，排列如下：
 * <pre>
 *     P   A   H   N
 *     A P L S I I G
 *     Y   I   R
 * </pre>
 * 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："PAHNAPLSIIGYIR" 。
 * <p>
 * 请您实现这个将字符串进行制定行数变换的函数：
 * <pre>
 *     String covert(String s, int numRows);
 * </pre>
 * <p>
 * 示例 1：
 * <pre>
 *     输入：s = "PAYPALISHIRING", numRows = 3
 *     输出："PAHNAPLSIIGYIR"
 * </pre>
 * <p>
 * 示例 2：
 * <pre>
 *     输入：s = "PAYPALISHIRING", numRows = 4
 *     输出："PINALSIGYAHRPI"
 *     解释：
 *     P    I    N
 *     A  L S  I G
 *     Y A  H R
 *     P    I
 * </pre>
 * <p>
 * 示例 3：
 * <pre>
 *     输入：s = "A", numRows = 1
 *     输出："A"
 * </pre>
 * <p>
 * 提示：
 * <ul>
 *     <li>1 <= s.length <= 1000</li>
 *     <li>s 由英文字母（小写和大写）、',' 和 '.' 组成</li>
 *     <li>1 <= numRows <= 1000</li>
 * </ul>
 *
 * @author gaoshijie
 */
public interface ZigzagConversion {
    String convert(@NotNull String s, @Range(from = 1, to = 1000) int numRows);
}
