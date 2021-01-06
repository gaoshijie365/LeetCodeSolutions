package tech.gaoshijie.leetcode.p1;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author gaoshijie
 */
public class TwoSumSolutionTest {
    private TwoSum twoSumSolution;

    @Before
    public void setUp() {
//        twoSumSolution = new DoubleLoopSolution();
        twoSumSolution = new HashMapSolution();
    }

    @Test
    public void twoSum() {
        testCase(new int[]{2, 7, 11, 15}, 9, new int[]{0, 1});
        testCase(new int[]{3, 2, 4}, 6, new int[]{1, 2});
        testCase(new int[]{3, 3}, 6, new int[]{0, 1});
    }

    private void testCase(int[] nums, int target, int[] expect) {
        int[] result = twoSumSolution.twoSum(nums, target);
        if (!Arrays.equals(result, expect))
            throw new AssertionError("return value should be [1,2].");
    }
}
