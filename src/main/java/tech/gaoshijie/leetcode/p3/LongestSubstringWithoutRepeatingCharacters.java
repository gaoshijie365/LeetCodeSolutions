package tech.gaoshijie.leetcode.p3;

import org.jetbrains.annotations.NotNull;

/**
 * 3. 无重复字符的最长子串（https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/）
 * <p>
 * 给定一个字符串，请你找出其中不含有重复字符的 <strong>最长子串</strong> 的长度。
 * <p>
 * 示例 1：
 * <pre>
 *     输入：s = "abcabcbb"
 *     输出：3
 *     解释：因为无重复字符的最长子串是 "abc"，所以其长度是 3。
 * </pre>
 * <p>
 * 示例 2：
 * <pre>
 *     输入：s = "bbbbb"
 *     输出：1
 *     解释：因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * </pre>
 * <p>
 * 示例 3：
 * <pre>
 *     输入：s = "pwwkew"
 *     输出：3
 *     解释：因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *          请注意，你的答案必须是 <strong>子串</strong> 的长度，"pwke" 是一个子序列，不是子串。
 * </pre>
 * <p>
 * 示例 4：
 * <pre>
 *     输入：s = ""
 *     输出：0
 * </pre>
 * <p>
 * 提示：
 * <ul>
 *     <li>0 <= s.length <= 5 * 10<sup>4</sup></li>
 *     <li>s 由英文字母、数字、符号和空格组成</li>
 * </ul>
 *
 * @author gaoshijie
 */
public interface LongestSubstringWithoutRepeatingCharacters {
    int lengthOfLongestSubstring(@NotNull String s);
}
