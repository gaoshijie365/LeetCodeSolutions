package tech.gaoshijie.leetcode.p7;

import junit.framework.TestCase;

/**
 * @author gaoshijie
 */
public class ReverseIntegerTest extends TestCase {
    private ReverseInteger solution;

    @Override
    protected void setUp() throws Exception {
        solution = new StackSolution();
    }

    public void testPositive() {
        int result = solution.reverse(123);
        assert result == 321 : "expect 321 but now is " + result;
    }

    public void testPositiveEndWithZero() {
        int result = solution.reverse(120);
        assert result == 21 : "expect 21 but now is " + result;
    }

    public void testZero() {
        int result = solution.reverse(0);
        assert result == 0 : "expect 0 but now is " + result;
    }

    public void testNegative() {
        int result = solution.reverse(-123);
        assert result == -321 : "expect -321 but now is " + result;
    }

    public void testOverflow() {
        int result = solution.reverse(1534236469);
        assertEquals(0, result);
    }

}
