package LINKEDLIST5;
import java.util.*;
public class ReverseLinkedList2 {
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
    public Node reverseBetween(Node head, int left , int right) {
        Node newNode = new Node(0);
        newNode.next = head;
        Node prev = newNode;

        for(int i=1 ; i<left ; i++) {
            prev = prev.next;
        }
        Node curr = prev.next;
        Node next = null;
        Node prevSubList = null;

        for(int i=1 ; i<=right - left ; i++) {
            next = curr.next;
            curr.next = prevSubList;
            prevSubList = curr;
            curr = next;
        }
        prev.next.next = curr;
        prev.next = prevSubList;

        return newNode.next;

    }
}
