package tech.gaoshijie.leetcode.p2;

import org.jetbrains.annotations.NotNull;

/**
 * 2. 两数相加（https://leetcode-cn.com/problems/add-two-numbers/）
 * <p>
 * 给你两个 <strong>非空</strong> 的链表，表示两个非负的整数。它们每位数字都是按照 <strong>逆序</strong> 的方式存储的，
 * 并且每个节点只能存储 <strong>一位</strong> 数字。
 * <p>
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * <p>
 * 你可以假设除了数字 0 以外，这两个数都不会以 0 开头。
 * <p>
 * 示例 1：
 * <pre>
 *     输入：l1 = [2,4,3], l2 = [5,6,4]
 *     输出：[7,0,8]
 *     解释：342 + 456 = 807
 * </pre>
 * <p>
 * 示例 2：
 * <pre>
 *     输入：l1 = [0], l2 = [0]
 *     输出：[0]
 * </pre>
 * <p>
 * 示例 3：
 * <pre>
 *     输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 *     输出：[8,9,9,9,0,0,0,1]
 * </pre>
 * <p>
 * 提示：
 * <ul>
 *     <li>每个链表中的节点数范围 [1,100] 内</li>
 *     <li>0 <= Node.val <= 9</li>
 *     <li>题目数据保证列表表示的数字不含前导零</li>
 * </ul>
 *
 * @author gaoshijie
 */
public interface AddTwoNumbers {
    ListNode addTwoNumbers(@NotNull ListNode l1, @NotNull ListNode l2);
}
