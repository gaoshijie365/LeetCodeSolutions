package tech.gaoshijie.leetcode.p4;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

/**
 * 原理：先合并数组，后取中间位计算中位数。
 *
 * <p>
 * 需要额外的 nums1.length + nums2.length 的空间。
 *
 * @author gaoshijie
 */
public class MergeSolution implements MedianOfTwoSortedArrays {
    @Override
    public double findMedianSortedArrays(@NotNull int[] nums1, @NotNull int[] nums2) {
        int[] array1 = Arrays.copyOf(nums1, nums1.length + 1);
        array1[array1.length - 1] = Integer.MAX_VALUE;

        int[] array2 = Arrays.copyOf(nums2, nums2.length + 1);
        array2[array2.length - 1] = Integer.MAX_VALUE;

        int[] merged = new int[nums1.length + nums2.length];
        int i = 0;
        int j = 0;
        for (int k = 0; k < merged.length; k++) {
            merged[k] = array1[i] < array2[j] ? array1[i++] : array2[j++];
        }

        if (merged.length % 2 == 0) {
            return (merged[merged.length / 2] + merged[merged.length / 2 - 1]) / 2.0;
        } else {
            return merged[merged.length / 2];
        }
    }
}
