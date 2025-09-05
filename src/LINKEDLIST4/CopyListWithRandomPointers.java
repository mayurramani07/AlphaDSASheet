package LINKEDLIST4;
import java.util.*;
public class CopyListWithRandomPointers {
    public class Node {
        int data;
        Node next;
        Node random;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.random = null;
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
    public Node copyRandomList(Node head) {
        if(head == null) {
            return null;
        }
        Node curr = head;
        while(curr != null) {
            Node newNode = new Node(curr.data);
            newNode.next = curr.next;
            curr.next = newNode;
            curr = newNode.next;
        }
        curr = head;
        while(curr != null) {
            if(curr.random != null) {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }
        curr = head;
        Node newHead = head.next;
        Node newCurr = newHead;
        while(curr != null) {
            curr.next = newCurr.next;
            curr = curr.next;
            if(curr != null) {
                newCurr.next = curr.next;
                newCurr = newCurr.next;
            }
        }
        return newHead;
    }
}
