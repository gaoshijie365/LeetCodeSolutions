package tech.gaoshijie.leetcode.p2;

import org.junit.Before;
import org.junit.Test;

/**
 * @author gaoshijie
 */
public class AddTwoNumbersSolutionTest {
    private AddTwoNumbers addTwoNumbers;

    @Before
    public void setUp() {
        addTwoNumbers = new NormalSolution();
    }

    @Test
    public void addTwoNumbers() {
        testCase(ListNode.of(2, 4, 3), ListNode.of(5, 6, 4), ListNode.of(7, 0, 8));
        testCase(ListNode.of(0), ListNode.of(0), ListNode.of(0));
        testCase(ListNode.of(9, 9, 9, 9, 9, 9, 9), ListNode.of(9, 9, 9, 9), ListNode.of(8, 9, 9, 9, 0, 0, 0, 1));
    }

    private void testCase(ListNode l1, ListNode l2, ListNode expect) {
        ListNode result = addTwoNumbers.    addTwoNumbers(l1, l2);
        if (!ListNode.isSame(result, expect)) {
            throw new AssertionError("expect " + expect.toString() + " but now is " + result.toString() + ".");
        }
    }
}
