package tech.gaoshijie.leetcode.p2;

/**
 * @author gaoshijie
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    /**
     * 为了方便构造链表而提供的工厂方法。
     *
     * @param first  第一个结点值（因为链表至少含有一个结点，所以第一个结点值必须提供）
     * @param others 变长参数提供剩余的结点值
     * @return 构造好的链表的头结点
     */
    static ListNode of(int first, int... others) {
        ListNode listNode = new ListNode(first);
        ListNode cur = listNode;
        for (int i : others) {
            ListNode temp = new ListNode(i);
            cur.next = temp;
            cur = cur.next;
        }
        return listNode;
    }

    /**
     * 判断两个单链表是否相同（只要对应位置上的值相同即认为是一样的）
     *
     * @param left
     * @param right
     * @return
     */
    static boolean isSame(ListNode left, ListNode right) {
        if (left == right) {
            return true;
        }
        while (left != null && right != null) {
            if (left.val == right.val) {
                left = left.next;
                right = right.next;
            } else {
                return false;
            }
        }
        return left == null && right == null;
    }

    /**
     * 以 [1,2,3,4] 的形式表示 ListNode
     *
     * @return
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        ListNode cur = this;
        do {
            sb.append(cur.val);
            sb.append(",");
            cur = cur.next;
        } while (cur != null);
        sb.deleteCharAt(sb.length() - 1);
        sb.append("]");
        return sb.toString();
    }
}