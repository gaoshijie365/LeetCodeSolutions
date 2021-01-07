package tech.gaoshijie.leetcode.p3;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

/**
 * 单层循环。通过两个指针实现，记录两指针的最大差值即为所求。通过 {@code Map<Character, Integer>} 记录子串中出现的字符。
 *
 * @author gaoshijie
 */
public class SingleLoopSolution implements LongestSubstringWithoutRepeatingCharacters {
    @Override
    public int lengthOfLongestSubstring(@NotNull String s) {
        int start = -1;
        int max = 0;
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (characterIntegerMap.containsKey(c)) {
                int index = characterIntegerMap.get(c);
                for (int j = start + 1; j <= index; j++) {
                    characterIntegerMap.remove(s.charAt(j));
                }
                start = index;
            }
            characterIntegerMap.put(c, i);
            max = Math.max(i - start, max);
        }
        return max;
    }
}
