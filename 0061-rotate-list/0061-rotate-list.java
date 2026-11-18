class Solution {

    public int length(ListNode head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null)
            return head;
        int n = length(head);
        k %= n;
        if (k == 0)
            return head;
        ListNode slow = head;
        ListNode fast = head;
        for (int i = 1; i <= k; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        ListNode a = slow.next;
        slow.next = null;
        ListNode tail = a;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = head;
        return a;
    }
}