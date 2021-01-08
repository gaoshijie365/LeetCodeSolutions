package tech.gaoshijie.leetcode.p4;

import org.junit.Before;
import org.junit.Test;

/**
 * @author gaoshijie
 */
public class MedianOfTwoSortedArraysSolutionTest {
    private MedianOfTwoSortedArrays solution;

    @Before
    public void setUp() {
        solution = new MergeSolution();
    }

    @Test
    public void medianOfTwoSortedArraysTest() {
        testCase(new int[]{1, 3}, new int[]{2}, 2.0);
        testCase(new int[]{1, 2}, new int[]{3, 4}, 2.5);
        testCase(new int[]{0, 0}, new int[]{0, 0}, 0.0);
        testCase(new int[]{}, new int[]{1}, 1.0);
        testCase(new int[]{2}, new int[]{}, 2.0);
    }

    private void testCase(int[] nums1, int[] nums2, double expect) {
        double median = solution.findMedianSortedArrays(nums1, nums2);
        assert Double.compare(median, expect) == 0 : "expect " + expect + ", but now is " + median + ".";
    }
}
