package tech.gaoshijie.leetcode.p5;

import org.jetbrains.annotations.NotNull;

/**
 * 原理：双重循环。从最长的串开始寻找，第一个找到的回文串即是结果。
 * <p>
 * 执行结果：681ms | 38.1MB
 *
 * @author gaoshijie
 */
public class DoubleLoopEnhancedSolution implements LongestPalindromicSubstring {
    @Override
    public String longestPalindrome(@NotNull String s) {
        String longestPalindrome = s.substring(0, 1);
        for (int i = s.length(); i > longestPalindrome.length(); i--) {
            for (int j = 0; j + i <= s.length(); j++) {
                if (isPalindrome(s, j, j + i)) {
                    longestPalindrome = s.substring(j, j + i);
                }
            }
        }

        return longestPalindrome;
    }

    private boolean isPalindrome(String original, int beginIndex, int endIndex) {
        for (int i = 0; i < (endIndex - beginIndex) / 2; i++) {
            if (original.charAt(beginIndex + i) != original.charAt(endIndex - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
