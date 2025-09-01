package LINKEDLIST1;
import java.util.*;
public class DeleteTheMiddleNodeOfLL {
    public class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public static void print() {
        if(head == null) {
            System.out.println("LL IS EMPTY");
        }
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println();
    }
    public static Node DeleteFromMiddle(Node head) {
        if(head == null || head.next == null) {
            return null;
        }
        Node slow = head;
        Node fast = head;
        Node prev = null;

        while(fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;
        return head;
    }
}

//Time Complexity : O(n)
//Space Complexity : O(1)