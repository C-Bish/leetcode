public class MergeTwoSortedLists {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode head = mergeTwoLists(l1, l2);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode prehead = new ListNode();
        ListNode node = prehead;

        while (list1 != null || list2 != null) {
            // If reached end of list1, take list2 node
            if (list1 == null) {
                node.next = new ListNode(list2.val);
                list2 = list2.next;
                // If reached end of list2, take list1 node
            } else if (list2 == null) {
                node.next = new ListNode(list1.val);
                list1 = list1.next;
                // Else take min of both lists
            } else {
                if (list1.val > list2.val) {
                    node.next = new ListNode(list2.val);
                    list2 = list2.next;
                } else {
                    node.next = new ListNode(list1.val);
                    list1 = list1.next;
                }
            }
            node = node.next;
        }

        return prehead.next;
    }

    /**
     * Definition for singly-linked list.
     */
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    }

}