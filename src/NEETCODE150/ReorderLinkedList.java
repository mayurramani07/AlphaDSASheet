package NEETCODE150;
import java.util.*;
public class ReorderLinkedList {
    static class Node{
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
            System.out.println("LL is Empty");
            return;
        }
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    public static void ReorderList(Node head) {
        if(head == null || head.next == null) {
            return;
        }
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node prev = null;
        Node curr = slow.next;
        slow.next = null;

        while(curr != null) {
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        Node first = head;
        Node second = prev;

        while(second != null) {
            Node temp1 = first.next;
            Node temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }
    }
}
//TIME COMPLEXITY : O(n)
//SPACE COMPLEXITY : O(n)