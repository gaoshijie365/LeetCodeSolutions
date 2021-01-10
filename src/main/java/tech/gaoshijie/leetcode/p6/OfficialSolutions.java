package tech.gaoshijie.leetcode.p6;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Range;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gaoshijie
 */
public class OfficialSolutions {
    /**
     * 方法一：按行排序
     * <p>
     * 思路：通过从左向右迭代字符串，我们可以轻松地确定字符串位于 Z 字形图案中的哪一行。
     * <p>
     * 算法：我们可以使用 <code>min(numRows, len(s))</code> 个列表来表示 Z 字形图案中的非空行。
     * 从左到右迭代 s ，将每个字符添加到合适的行。可以使用当前行和当前方向这两个变量对合适的行进行跟踪。
     * 只有当我们向上移动到最上面的行或向下移动到最下面的行时，当前方向才会发生改变。
     * <p>
     * <p>
     * 复杂度分析：
     * <ul>
     *     <li>时间复杂度：<code>O(n)</code>，其中 <code>n == len(s)</code></li>
     *     <li>空间复杂度：<code>O(n)</code></li>
     * </ul>
     * <p>
     * <p>
     * 执行结果：7ms | 38.7MB
     */
    static class MethodOne implements ZigzagConversion {
        @Override
        public String convert(@NotNull String s, @Range(from = 1, to = 1000) int numRows) {
            if (numRows == 1) return s;

            List<StringBuilder> rows = new ArrayList<>();
            for (int i = 0; i < Math.min(numRows, s.length()); i++)
                rows.add(new StringBuilder());

            int curRow = 0;
            boolean goingDown = false;

            for (char c : s.toCharArray()) {
                rows.get(curRow).append(c);
                if (curRow == 0 || curRow == numRows - 1) goingDown = !goingDown;
                curRow += goingDown ? 1 : -1;
            }

            StringBuilder ret = new StringBuilder();
            for (StringBuilder row : rows) ret.append(row);
            return ret.toString();
        }
    }
}
