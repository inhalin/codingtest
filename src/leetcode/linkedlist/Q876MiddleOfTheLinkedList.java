package leetcode.linkedlist;

public class Q876MiddleOfTheLinkedList {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] arr = {
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5, 6}
        };

        SinglyLinkedList list = new SinglyLinkedList();

        for (int[] ints : arr) {
            list.add(ints);
            System.out.println(list);
            System.out.println(s.middleNode(list.head).val);
            list.delete();
        }
    }

    static class Solution {
        public ListNode middleNode(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            return slow;
        }
    }
}
