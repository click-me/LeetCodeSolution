package LinkedList;

public class MergeTwoSortedLists {

    public static void main(String[] args) {
        ListNode head0 = new ListNode(0);
        ListNode head1 = new ListNode(3);
        ListNode head2 = new ListNode(8);
        head0.next = head1;
        head1.next = head2;

        ListNode head3 = new ListNode(1);
        ListNode head4 = new ListNode(2);
        ListNode head5 = new ListNode(7);
        ListNode head6 = new ListNode(10);
        head3.next = head4;
        head4.next = head5;
        head5.next = head6;

        ListNode mergedList = new MergeTwoSortedLists().mergeTwoLists(head0, head3);
        while (mergedList != null) {
            System.out.println(mergedList.val);
            mergedList = mergedList.next;
        }
    }

    /**
     * 21: Merge two sorted linked lists and return it as a new sorted list. The new list should be made by splicing together the nodes of the first two lists.
     * @param l1 LinkedList 1
     * @param l2 LinkedList 1
     * @return MergedLinkedList
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
