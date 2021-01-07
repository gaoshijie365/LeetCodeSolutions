package tech.gaoshijie.leetcode.p2;

import org.jetbrains.annotations.NotNull;

/**
 * 普通的方案，遍历的同时记录进位值给下一位。
 *
 * @author gaoshijie
 */
public class NormalSolution implements AddTwoNumbers {
    @Override
    public ListNode addTwoNumbers(@NotNull ListNode l1, @NotNull ListNode l2) {
        int carry = 0;
        ListNode head = new ListNode(0);
        ListNode cur = head;
        while (l1 != null && l2 != null) {
            int sum = carry + l1.val + l2.val;
            cur.next = new ListNode((sum % 10));
            cur = cur.next;
            carry = sum / 10;
            l1 = l1.next;
            l2 = l2.next;
        }

        l1 = l1 == null ? l2 : l1;
        while (l1 != null) {
            int sum = carry + l1.val;
            cur.next = new ListNode((sum % 10));
            cur = cur.next;
            carry = sum / 10;
            l1 = l1.next;
        }

        if (carry != 0) {
            cur.next = new ListNode(carry);
        }

        return head.next;
    }
}
