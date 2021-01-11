package tech.gaoshijie.leetcode.p7;

/**
 * 通过栈数据结构来实现。
 * <p>
 * 执行结果：1ms | 35.4MB
 *
 * @author gaoshijie
 */
public class StackSolution implements ReverseInteger {
    @Override
    public int reverse(int x) {
        long reverse = 0;
        while (x != 0) {
            int pop = x % 10;
            reverse = reverse * 10 + pop;
            x = x / 10;
        }
        return reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE ? 0 : (int) reverse;
    }
}
