package tech.gaoshijie.leetcode.p5;

import org.jetbrains.annotations.NotNull;

/**
 * 原理：双重循环。
 * <p>
 * 时间复杂度: O(n<sup>2</sup>)
 * <p>
 * 力扣执行结果：1609ms | 39.1M
 *
 * @author gaoshijie
 */
public class DoubleLoopSolution implements LongestPalindromicSubstring {
    @Override
    public String longestPalindrome(@NotNull String s) {
        String longestPalindrome = s.substring(0, 1);
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + longestPalindrome.length(); j < s.length(); j++) {
                // 检查 s[i..j] 是否是回文串
                String sub = s.substring(i, j + 1);
                if (isPalindrome(sub)) {
                    if (sub.length() > longestPalindrome.length()) {
                        longestPalindrome = sub;
                    }
                }
            }
        }
        return longestPalindrome;
    }

    private boolean isPalindrome(String sub) {
        if (sub == null || sub.length() == 0) {
            return false;
        }

        for (int i = 0; i < sub.length() / 2; i++) {
            if (sub.charAt(i) != sub.charAt(sub.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
