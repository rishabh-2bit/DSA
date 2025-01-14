package LinkedList;

public class OddEvenLinkedList {

    public static ListNode oddEvenList(ListNode head) {
        ListNode evenHead = new ListNode(0);
        ListNode oddHead = new ListNode(0);
        ListNode even = evenHead, odd = oddHead;
        ListNode current = head;
        int index = 0;

        while (current != null) {
            if(index % 2 == 0){
                even.next = current;
                even = even.next;
            } else {
                odd.next = current;
                odd = odd.next;
            }
            current = current.next;
            index++;
        }
        odd.next = null;

        even.next = oddHead.next;
        return evenHead.next;

    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        // head.next.next.next.next.next = new ListNode(2);
        // head.next.next.next.next.next.next = new ListNode(6);

        System.out.println("Original List:");
        printList(head);

        head = oddEvenList(head);
        System.out.println("After List:");
        printList(head);
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    
}
