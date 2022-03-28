package leetcode.linkedlist;

public class SinglyLinkedList {
    public ListNode head;
    public ListNode tail;
    public int size;

    public SinglyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void add(int val) {
        if (size == 0) {
            addFirst(val);
            return;
        }

        ListNode node = new ListNode(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void add(int[] values) {
        for (int val : values) {
            add(val);
        }
    }

    public void addFirst(int val) {
        ListNode node = new ListNode(val);
        node.next = head;
        head = node;
        size++;

        if (head.next == null) tail = head;
    }

    public void delete() {
        head = null;
        tail = null;
        size = 0;
    }

    public String toString() {
        if (head == null) {
            return "";
        }

        ListNode node = head;
        StringBuilder sb = new StringBuilder();

        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(node.val);
            node = node.next;
            if (i != size - 1) sb.append(", ");
        }
        sb.append("]");

        return sb.toString();
    }
}
