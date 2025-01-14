package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class TwinSum {

    public static int maxTwinSum(ListNode head) {
       // ListNode current = head, last = head, prev=null;
        int maxsum = 0;
        List<Integer> list = new ArrayList<>();

        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        for(int i = 0; i < list.size(); i++){
            int temp = list.get(i) + list.get(list.size()-1-i);
            if(temp > maxsum){
                maxsum = temp;
            }
            temp = 0;
        }
        return maxsum;

    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(2);
        // head.next.next.next.next.next.next = new ListNode(6);

        System.out.println("Original List:");
        printList(head);

        int maxsum = maxTwinSum(head);
        System.out.println("max twin sum:"+ maxsum);
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
