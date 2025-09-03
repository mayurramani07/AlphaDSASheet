package LINKEDLIST2;
import java.util.*;
public class SortList {
    public class Node {
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
        if (head == null) {
            System.out.println("LinkedList is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public Node sortList(Node head) {
        if(head == null || head.next == null) {
            return head;
        }
        Node slow = head;
        Node fast = head;
        Node prev = null;

        while(fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;

        Node left = sortList(head);
        Node right = sortList(slow);

        return merge(right, left);
    }
    public Node merge(Node list1, Node list2) {
        Node newNode = new Node(-1);
        Node curr = newNode;

        while(list1 != null && list2 != null) {
            if(list1.data <= list2.data) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }
        if(list1 != null) {
            curr.next = list1;
        } else {
            curr.next = list2;
        }
        return newNode.next;
    }
}
