package tech.gaoshijie.leetcode.p5;

import org.jetbrains.annotations.NotNull;

/**
 * 5. 最长回文子串（https://leetcode-cn.com/problems/longest-palindromic-substring/）
 * <p>
 * 给你一个字符串 s，找到 s 中最长的回文子串。
 * <p>
 * 示例 1：
 * <pre>
 *     输入：s = "babad"
 *     输出："bab"
 *     解释："aba" 同样是符合题意的答案
 * </pre>
 * <p>
 * 示例 2：
 * <pre>
 *     输入：s = "cbbd"
 *     输出："bb"
 * </pre>
 * <p>
 * 示例 3：
 * <pre>
 *     输入：s = "a"
 *     输出："a"
 * </pre>
 * <p>
 * 示例 4：
 * <pre>
 *     输入：s = "ac"
 *     输出："a"
 * </pre>
 * <p>
 * 提示：
 * <ul>
 *     <li>1 <= s.length <= 1000</li>
 *     <li>s 仅有数字和英文字母（大写和/或小写）组成</li>
 * </ul>
 *
 * @author gaoshijie
 */
public interface LongestPalindromicSubstring {
    String longestPalindrome(@NotNull String s);
}
