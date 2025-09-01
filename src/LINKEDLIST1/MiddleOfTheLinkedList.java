package LINKEDLIST1;
import java.util.*;
public class MiddleOfTheLinkedList {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static void print() {
        if (head == null) {
            System.out.println("LL IS EMPTY");
        }
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println();
    }
    public static Node MiddleLinkedList(Node head) {
        if(head == null) {
            return null;
        }

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

//Time Complexity : O(n)
//Space Complexity : O(1)