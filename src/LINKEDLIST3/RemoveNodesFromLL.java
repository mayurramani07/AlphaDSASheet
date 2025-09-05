package LINKEDLIST3;
import java.util.*;
public class RemoveNodesFromLL {
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
    public static Node removeNode(Node head) {
        head = reverse(head);

        int max = head.data;
        Node curr = head;
        Node prev = head;

        head = head.next;
        while(head != null) {
            if(head.data >= max) {
                max = head.data;
                prev.next = head;
                prev = head;
            }
            head = head.next;
        }
        prev.next = null;
        return reverse(curr);
    }
    public static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;

        while(curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
