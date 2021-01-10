package tech.gaoshijie.leetcode.p6;

import junit.framework.TestCase;

/**
 * @author gaoshijie
 */
public class ZigzagConversionTest extends TestCase {
    private ZigzagConversion solution;

    public void setUp() {
        solution = new OfficialSolutions.MethodOne();
    }

    public void testCase1() {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        String expect = "PAHNAPLSIIGYIR";

        String result = solution.convert(s, numRows);
        assert expect.equals(result) : "expect " + expect + ", but now is " + result + ".";
    }

    public void testCase2() {
        String s = "PAYPALISHIRING";
        int numRows = 4;
        String expect = "PINALSIGYAHRPI";

        String result = solution.convert(s, numRows);
        assert expect.equals(result) : "expect " + expect + ", but now is " + result + ".";
    }

    public void testCase3() {
        String s = "A";
        int numRows = 1;
        String expect = "A";

        String result = solution.convert(s, numRows);
        assert expect.equals(result) : "expect " + expect + ", but now is " + result + ".";
    }
}
