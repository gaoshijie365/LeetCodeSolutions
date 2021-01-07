package tech.gaoshijie.leetcode.p3;

import org.junit.Before;
import org.junit.Test;

/**
 * @author gaoshijie
 */
public class LongestSubstringWithoutRepeatingCharactersSolutionTest {
    private LongestSubstringWithoutRepeatingCharacters solution;

    @Before
    public void setUp() {
        solution = new SingleLoopSolution();
    }

    @Test
    public void lengthOfLongestSubstringTest() {
        testCase("abcabcbb", 3);
        testCase("bbbbb", 1);
        testCase("pwwkew", 3);
        testCase("", 0);
    }

    private void testCase(String s, int expect) {
        int result = solution.lengthOfLongestSubstring(s);
        assert result == expect : "expect " + expect + ", but now is " + result + ".";
    }
}
