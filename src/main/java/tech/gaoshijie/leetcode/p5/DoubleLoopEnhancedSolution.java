package tech.gaoshijie.leetcode.p5;

import org.jetbrains.annotations.NotNull;

/**
 * 原理：双重循环。从最长的串开始寻找，第一个找到的回文串即是结果。
 * <p>
 * 执行结果：380ms | 38.6MB
 *
 * @author gaoshijie
 */
public class DoubleLoopEnhancedSolution implements LongestPalindromicSubstring {
    @Override
    public String longestPalindrome(@NotNull String s) {
        // 将数组转换成字符数组（数组下标访问比 Sting.charAt(int) 有着更高的效率）
        char[] chars = s.toCharArray();
        String longestPalindrome = new String(chars, 0, 1);
        for (int i = chars.length; i > longestPalindrome.length(); i--) {
            for (int j = 0; j + i <= chars.length; j++) {
                if (isPalindrome(chars, j, j + i)) {
                    longestPalindrome = new String(chars, j, i);
                }
            }
        }

        return longestPalindrome;
    }

    private boolean isPalindrome(char[] original, int beginIndex, int endIndex) {
        for (int i = 0; i < (endIndex - beginIndex) / 2; i++) {
            if (original[beginIndex + i] != original[endIndex - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
