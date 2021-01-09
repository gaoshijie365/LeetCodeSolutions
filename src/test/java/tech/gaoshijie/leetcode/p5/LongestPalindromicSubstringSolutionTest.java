package tech.gaoshijie.leetcode.p5;

import junit.framework.TestCase;
import org.junit.Ignore;

import java.util.Set;

/**
 * @author gaoshijie
 */
public class LongestPalindromicSubstringSolutionTest extends TestCase {
    private LongestPalindromicSubstring solution;

    public void setUp() {
        solution = new DoubleLoopSolution();
    }

    public void testCase1() {
        Set<String> resultSet = Set.of("bab", "aba");
        String result = solution.longestPalindrome("babad");
        assert resultSet.contains(result) : "expect one of " + resultSet.toString() + ", but now is " + result + ".";
    }

    public void testCase2() {
        Set<String> resultSet = Set.of("bb");
        String result = solution.longestPalindrome("cbbd");
        assert resultSet.contains(result) : "expect one of " + resultSet.toString() + ", but now is " + result + ".";
    }

    public void testCase3() {
        Set<String> resultSet = Set.of("a");
        String result = solution.longestPalindrome("a");
        assert resultSet.contains(result) : "expect one of " + resultSet.toString() + ", but now is " + result + ".";
    }

    public void testCase4() {
        Set<String> resultSet = Set.of("a", "c");
        String result = solution.longestPalindrome("ac");
        assert resultSet.contains(result) : "expect one of " + resultSet.toString() + ", but now is " + result + ".";
    }

    public void testCase5() {
        Set<String> resultSet = Set.of("ccc");
        String result = solution.longestPalindrome("ccc");
        assert resultSet.contains(result) : "expect one of " + resultSet.toString() + ", but now is " + result + ".";
    }
}
